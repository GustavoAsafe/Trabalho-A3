package GerenciadorAlunos;

import Aluno.Aluno;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorAlunos {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(String nome, int faltas, double nota) {
        alunos.add(new Aluno(nome, faltas, nota));
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    public Aluno buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public boolean removerAluno(String nome) {
        Aluno aluno = buscarAluno(nome);
        if (aluno != null) {
            alunos.remove(aluno);
            return true;
        }
        return false;
    }
    
}
