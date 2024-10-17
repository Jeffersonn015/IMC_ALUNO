package atributos;

public class FuncoesUteis { 

    // Método para verificar CPF
    public static void verificarCpf(String cpf) {
        if (cpf.length() == 11) { // Verifica se o CPF tem 11 dígitos
            System.out.println("O CPF " + cpf + " é válido.");
        } else {
            System.out.println("O CPF " + cpf + " é inválido. Deve ter 11 dígitos.");
        }
    }

    // Método para calcular IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para avaliar o aluno
    public static String avaliarAluno(Alunos aluno) {
        if (aluno.getNota() >= 5 && aluno.getPercentualPresenca() >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
}
