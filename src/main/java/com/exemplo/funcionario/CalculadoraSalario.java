package com.exemplo.funcionario;

public class CalculadoraSalario {

    public double calcularSalarioLiquido(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();

        switch (cargo) {
            case DESENVOLVEDOR:
                if (salarioBase >= 3000.0) {
                    return salarioBase * 0.8;
                } else {
                    return salarioBase * 0.9;
                }
            case DBA:
            case TESTADOR:
                if (salarioBase >= 2000.0) {
                    return salarioBase * 0.75;
                } else {
                    return salarioBase * 0.85;
                }
            case GERENTE:
                if (salarioBase >= 5000.0) {
                    return salarioBase * 0.7;
                } else {
                    return salarioBase * 0.8;
                }
            default:
                throw new IllegalArgumentException("Cargo inválido");
        }
    }
}
