package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    // 1
    @Test
    public void testTrianguloEscalenoValido() {
        Triangulo triangulo = new Triangulo();
        assertEquals("Escaleno", triangulo.tipoDeTriangulo(3, 4, 5));
    }

    // 2
    @Test
    public void testTrianguloIsoscelesValido() {
        Triangulo triangulo = new Triangulo();
        assertEquals("Isósceles", triangulo.tipoDeTriangulo(5, 5, 3));
    }

    // 3
    @Test
    public void testTrianguloEquilateroValido() {
        Triangulo triangulo = new Triangulo();
        assertEquals("Equilátero", triangulo.tipoDeTriangulo(3, 3, 3));
    }

    // 4
    @Test
    public void testIsoscelesPermutacoes() {
        Triangulo triangulo = new Triangulo();
        assertEquals("Isósceles", triangulo.tipoDeTriangulo(5, 5, 3));
        assertEquals("Isósceles", triangulo.tipoDeTriangulo(5, 3, 5));
        assertEquals("Isósceles", triangulo.tipoDeTriangulo(3, 5, 5));
    }

    // 5
    @Test
    public void testValorZero() {
        Triangulo triangulo = new Triangulo();
        assertEquals("Lados inválidos", triangulo.tipoDeTriangulo(0, 3, 4));
    }

    // 6
    @Test
    public void testValorNegativo() {
        Triangulo triangulo = new Triangulo();
        assertEquals("Lados inválidos", triangulo.tipoDeTriangulo(-1, 3, 4));
    }

    // 7 e 8
    @Test
    public void testSomaDoisLadosIgualAoTerceiro() {
        Triangulo triangulo = new Triangulo();
        assertEquals("Não é um triângulo", triangulo.tipoDeTriangulo(1, 2, 3));
        assertEquals("Não é um triângulo", triangulo.tipoDeTriangulo(2, 1, 3));
        assertEquals("Não é um triângulo", triangulo.tipoDeTriangulo(3, 1, 2));
    }

    // 9 e 10
    @Test
    public void testSomaDoisLadosMenorQueTerceiro() {
        Triangulo triangulo = new Triangulo();
        assertEquals("Não é um triângulo", triangulo.tipoDeTriangulo(1, 1, 3));
        assertEquals("Não é um triângulo", triangulo.tipoDeTriangulo(1, 3, 1));
        assertEquals("Não é um triângulo", triangulo.tipoDeTriangulo(3, 1, 1));
    }

    // 11
    @Test
    public void testTodosValoresZero() {
        Triangulo triangulo = new Triangulo();
        assertEquals("Lados inválidos", triangulo.tipoDeTriangulo(0, 0, 0));
    }

}
