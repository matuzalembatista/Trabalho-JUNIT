package com.example.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora(3);
    }

    @Test
    public void testConstrutorSemParametro() {
        calculadora = new Calculadora();
        assertEquals(1, calculadora.getMemoria());
    }


    @Test
    public void testConstrutorComParametro() {
        assertEquals(3, calculadora.getMemoria());
    }


    @Test
    public void testSomarNegativo() {
        int valor = -2;
        int esperado = 1;
        calculadora.somar(valor);
        assertEquals(esperado, calculadora.getMemoria());
    }


    @Test
    public void testSubtrairPositivo() {
        int valor = 2;
        int esperado = 1;
        calculadora.subtrair(valor);
        assertEquals(esperado, calculadora.getMemoria());
    }


    @Test
    public void testMultiplicarPositivo() {
        int actual = 2;
        int expected = 6;
        calculadora.multiplicar(actual);
        assertEquals(expected, calculadora.getMemoria());
    }


    @Test
    public void testDividirPor0() {
        assertThrows(Exception.class,
                () -> calculadora.dividir(0)
        );
    }


    @Test
    public void testDividirPositivo() throws Exception {
        int valor = 2;
        int expected = 1;
        calculadora.dividir(valor);
        assertEquals(expected, calculadora.getMemoria());
    }




    @Test
    public void testExponenciarMaior10() {
        assertThrows(Exception.class,
                () -> calculadora.exponenciar(11)
        );
    }

    @Test
    public void testExponenciar() throws Exception {
        int valor = 3;
        int esperado = 9;
        calculadora.exponenciar(valor);
        assertEquals(esperado, calculadora.getMemoria());
    }


}
