import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Estrutura {

    public static void gerarProcessos(ArrayList<Processo> lista) {
        
        //atribuição de valores para os objetos
        int id;
        String descricao;
        Processo tmp;

        //instanciação dos objetos para leitura de dados e geração de números aleatórios
        Scanner teclado = new Scanner(System.in);
        
        Random gerador = new Random(); //importação da classe para geração de números aleatórios

        //leitura de dados e geração de objetos
        while (true) {
            id = gerador.nextInt(5) + 1; // Gerar um ID aleatório entre 1 e 100
            System.out.println("Digite a descrição do processo");
            descricao = teclado.nextLine().toUpperCase(); // Converter a descrição para maiúscula para evitar problemas de comparação
            if (descricao.equals("SAIR")) { // Condição de parada para o loop
                break;
            }
            //gerar o objeto temporário para comparação
            tmp = new Processo(id, descricao); //gerar o objeto temporário para comparação
            if (!lista.contains(tmp)) { // Verificar se o objeto já existe na lista
                lista.add(tmp); // Adicionar o objeto à lista se ele não existir
        }
    }
    }    
    
    public static void exibirProcessos(ArrayList<Processo> lista) {
        
        lista.sort(Comparator.comparing(p -> p.descricao));
        for (Processo p : lista) {
            System.out.println(p); // Exibir cada processo da lista
        }
    }
    
    public static void localizarProcesso(ArrayList<Processo> lista) {
        String descricao;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite parte da descrição do processo para pesquisa");
        descricao = teclado.nextLine().toUpperCase(); // Converter a descrição para maiúscula para evitar problemas de comparação

        if (lista.stream().anyMatch(p -> p.descricao.contains(descricao))) {
        lista.stream().filter(p -> p.descricao.contains(descricao))
        .sorted(Comparator.comparing(p -> p.descricao))
         .forEach(System.out::println);
            } else {
                    System.out.println("Nenhum processo encontrado com a descrição fornecida.");
            }

    }
 
    public static void removerProcesso(ArrayList<Processo> lista) {
        String descricao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite parte da descrição do processo para remoção");
        descricao = teclado.nextLine().toUpperCase(); // Converter a descrição para maiúscula para evitar problemas de comparação
            
        if (lista.removeIf(p -> p.descricao.contains(descricao))) { // Remover processos que contêm a descrição fornecida
            System.out.println("Processos removidos com sucesso.");
            
            System.out.println(lista); // Exibir a lista atualizada após a remoção
        } else {
            System.out.println("Nenhum processo encontrado com a descrição fornecida.");
        }
        teclado.close(); // Fechar o scanner para evitar vazamento de recursos
    }
   
    public static void removerprocesso2 (ArrayList<Processo> lista) {
        
        //metodo iterador para remoção de processos;
        String descricao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite parte da descrição do processo para remoção");
        descricao = teclado.nextLine().toUpperCase(); // Converter a descrição para maiúscula para evitar problemas de comparação
        Iterator<Processo> iterator = lista.iterator();
        
        while (iterator.hasNext()) {
            Processo p = iterator.next();
            if (p.descricao.contains(descricao)) {
                iterator.remove(); // Remover o processo usando o iterador
                System.out.println("Processo removido: " + p);
            }
        }
        teclado.close(); // Fechar o scanner para evitar vazamento de recursos

    }
    public static void main(String[] args) {
        
        
        ArrayList<Processo> lista = new ArrayList<>();

        Estrutura.gerarProcessos(lista); // Gerar 5 processos aleatórios e adicioná-los à lista

        Estrutura.exibirProcessos(lista); // Exibir os processos gerados

        Estrutura.localizarProcesso(lista); // Localizar um processo específico na lista

        Estrutura.removerProcesso(lista); // Remover um processo específico da lista

        
        
        
        
        
        // lista.add(new Processo(1, "abertura"));
        // lista.add(new Processo(2, "teste de clock"));
        // lista.add(new Processo(3, "fechamento de valvula"));
        // lista.add(new Processo(4, "teste de pressão"));


        //exibir os dados
        

            
    }

}


//Pesquisar, entender e anotar no seu github a diferença entre Vector, List, ArrayList e LinkedList. Qual a melhor estrutura para cada situação? Quais as vantagens e desvantagens de cada uma?

//Vector é uma classe que implementa a interface List e é sincronizada, o que significa que é thread-safe. 
// No entanto, isso pode levar a um desempenho mais lento em comparação com outras implementações de List, 
// como ArrayList e LinkedList. Vector é recomendado para situações em que a sincronização é necessária, 
// como em ambientes multithread.

//ArrayList é uma implementação de List que é baseada em um array dinâmico. Ele é rápido para acessar elementos, mas 
// pode ser lento para adicionar ou remover elementos, especialmente se a lista for grande. 
// ArrayList é recomendado para situações em que o acesso rápido aos elementos é mais importante do que a 
// adição ou remoção frequente de elementos.

//LinkedList é uma implementação de List que é baseada em uma estrutura de dados de lista encadeada. 
// Ele é rápido para adicionar ou remover elementos, mas pode ser lento para acessar elementos, especialmente se a lista for grande.
// LinkedList é recomendado para situações em que a adição ou remoção frequente de elementos
