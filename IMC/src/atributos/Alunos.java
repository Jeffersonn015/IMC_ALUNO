package atributos;

public class Alunos extends Pessoa {
     double nota;
     double percentualPresenca;

    public Alunos(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca, String nomePacote) {
        super(nome, cpf, peso, altura, nomePacote); 
        this.nota = nota;
        this.percentualPresenca = percentualPresenca;
    }

    // Getters e Setters
    public double getNota() {
        return nota;
    }

    public double getPercentualPresenca() {
        return percentualPresenca;
    }
}
