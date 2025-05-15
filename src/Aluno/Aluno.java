package Aluno;
public class Aluno {
    private String nome;
    private int faltas;
    private double nota;

    public Aluno(String nome, int faltas, double nota) {
        this.nome = nome;
        this.faltas = faltas;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Faltas: " + faltas + ", Nota: " + nota;
    }
}
