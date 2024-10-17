package main;

import atributos.FuncoesUteis;
import atributos.Alunos;  // Importando a classe Alunos

public class Main {
    public static void main(String[] args) {
        // Criando um Aluno
        Alunos aluno1 = new Alunos("João Carlos", "12345678901", 70.0, 1.75, 7.5, 85.0, "escola");
        
        // Exibindo o nome do aluno 1
        System.out.println("Nome do Aluno 1: " + aluno1.getNome());
        
        // Testando FuncoesUteis para verificar CPF
        FuncoesUteis.verificarCpf(aluno1.getCpf());
        
        // Calculando o IMC do aluno 1
        double imcAluno1 = FuncoesUteis.calcularIMC(aluno1.getPeso(), aluno1.getAltura());
        System.out.println("IMC do Aluno 1: " + imcAluno1);
        
        // Avaliando o aluno 1
        String resultadoAluno1 = FuncoesUteis.avaliarAluno(aluno1);
        System.out.println("Resultado da Avaliação do Aluno 1: " + resultadoAluno1 + "\n");

        // Criando outro Aluno
        Alunos aluno2 = new Alunos("Maria Clara", "12586445522", 60.0, 1.65, 8.5, 80.0, "escola");
        
        // Exibindo o nome do aluno 2
        System.out.println("Nome do Aluno 2: " + aluno2.getNome());
        
        // Testando FuncoesUteis para verificar CPF
        FuncoesUteis.verificarCpf(aluno2.getCpf());
        
        // Calculando o IMC do aluno 2
        double imcAluno2 = FuncoesUteis.calcularIMC(aluno2.getPeso(), aluno2.getAltura());
        System.out.println("IMC do Aluno 2: " + imcAluno2);
        
        // Avaliando o aluno 2
        String resultadoAluno2 = FuncoesUteis.avaliarAluno(aluno2);
        System.out.println("Resultado da Avaliação do Aluno 2: " + resultadoAluno2);
    }
}
