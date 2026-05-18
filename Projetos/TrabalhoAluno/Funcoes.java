
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Funcoes {

    public void OrdenarPorAno(List<Aluno> alunos) {
        Collections.sort(alunos, Comparator.comparingInt(Aluno::getAno));
    }

    public Aluno buscarAlunoPorNome(List<Aluno> alunos, String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null; // Retorna null se o aluno não for encontrado
    }

    public void calcularAlunosPorAno(List<Aluno> alunos) {
        Map<Integer, Integer> alunosPorAno = new HashMap<>();
        for (Aluno aluno : alunos) {
            int ano = aluno.getAno();
            alunosPorAno.put(ano, alunosPorAno.getOrDefault(ano, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : alunosPorAno.entrySet()) {
            System.out.println("Ano: " + entry.getKey() + ", Alunos: " + entry.getValue());
        }
    }
}
