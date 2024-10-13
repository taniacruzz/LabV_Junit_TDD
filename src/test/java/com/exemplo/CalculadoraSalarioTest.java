package com.exemplo.funcionario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSalarioTest {

    // 1. Teste para desenvolvedor com salário acima de 3000
    @Test
    public void testDesenvolvedorSalarioAcima3000() {
        Funcionario dev = new Funcionario("João", "joao@exemplo.com", 4000.0, Cargo.DESENVOLVEDOR);
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(3200.0, calculadora.calcularSalarioLiquido(dev), 0.001);
    }

    // 2. Teste para desenvolvedor com salário abaixo de 3000
    @Test
    public void testDesenvolvedorSalarioAbaixo3000() {
        Funcionario dev = new Funcionario("Maria", "maria@exemplo.com", 2500.0, Cargo.DESENVOLVEDOR);
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(2250.0, calculadora.calcularSalarioLiquido(dev), 0.001);
    }

    // 3. Teste para DBA com salário acima de 2000
    @Test
    public void testDBASalarioAcima2000() {
        Funcionario dba = new Funcionario("Ana", "ana@exemplo.com", 2500.0, Cargo.DBA);
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(1875.0, calculadora.calcularSalarioLiquido(dba), 0.001);
    }

    // 4. Teste para DBA com salário abaixo de 2000
    @Test
    public void testDBASalarioAbaixo2000() {
        Funcionario dba = new Funcionario("Carlos", "carlos@exemplo.com", 1500.0, Cargo.DBA);
        CalculadoraSalario calculadora = new CalculadoraSalario();
        assertEquals(1275.0, calculadora.calcularSalarioLiquido(dba), 0.001);
    }

    // Mais testes para GERENTE, TESTADOR, e outros cenários...
}
