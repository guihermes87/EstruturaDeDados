import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


public class Principal {

    public static void main(String[] args) {
        
        List<Aluno> lista = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader("alunos.csv", StandardCharsets.UTF_8))) {
            
            String linha;
            
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 4) {
                    String nome = dados[0].trim();
                    String curso = dados[1].trim();
                    String genero = dados[2].trim();
                    int ano = Integer.parseInt(dados[3].trim());
                    
                    Aluno aluno = new Aluno(nome, curso, genero, ano);
                    lista.add(aluno);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Funcoes funcoes = new Funcoes();

        System.out.println("Lista de alunos:");
        for (Aluno aluno : lista) {
            System.out.println(aluno.getNome() + ", " + aluno.getCurso()
                    + ", " + aluno.getGenero() + ", " + aluno.getAno());
        }

        funcoes.OrdenarPorAno(lista);

        System.out.println("\nLista ordenada por ano de ingresso:");
        for (Aluno aluno : lista) {
            System.out.println(aluno.getNome() + ", " + aluno.getCurso()
                    + ", " + aluno.getGenero() + ", " + aluno.getAno());
        }


        String nomeBusca = "Ana Silva";
        Aluno alunoEncontrado = funcoes.buscarAlunoPorNome(lista, nomeBusca);
        
        if (alunoEncontrado != null) {
            System.out.println("\nAluno encontrado: " + alunoEncontrado.getNome()
                    + ", " + alunoEncontrado.getCurso()
                    + ", " + alunoEncontrado.getGenero()
                    + ", " + alunoEncontrado.getAno());
        } else {
            System.out.println("\nAluno não encontrado: " + nomeBusca);
        }

        // Calcular quantos alunos ingressaram em cada ano
        System.out.println("\nNúmero de alunos por ano de ingresso:");
        funcoes.calcularAlunosPorAno(lista);
    }
}

            
    
    
    


       

