
import java.util.ArrayList;
import java.util.Iterator;

public class Colecoes {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(60);
        lista.add(50);

        lista.sort(null);
        lista.remove((Integer)20);

        
        System.out.println(lista.contains(10)); // true
        
        // for (Integer i: lista) {
        //     System.out.println(i); // 10, 30
        // }

        Iterator i = lista.iterator();
        
        while (i.hasNext()) {
            
            System.out.println(i.next()); // 10, 30
        }

        
    }
    
    //PILHA É UMA LISTA DE ELEMENTOS ONDE O ÚLTIMO A ENTRAR É O PRIMEIRO A SAIR (LIFO - LAST IN, FIRST OUT)
    //TODOS OS MÉTODOS DE PILHA SÃO BASEADOS EM PUSH (ADICIONAR), POP (REMOVER) E PEEK (CONSULTAR O TOPO)
    //TODOS OS MÉTODOS VEM DA LISTA, MAS SÃO IMPLEMENTADOS DE FORMA A SE COMPORTAREM COMO PILHA
    
    //FILA -QUEUE - FIFO - FIRST IN, FIRST OUT - O PRIMEIRO A ENTRAR É O PRIMEIRO A SAIR
    //TODOS OS MÉTODOS DE FILA SÃO BASEADOS EM OFFER (ADICIONAR), POLL (REMOVER) E PEEK (CONSULTAR O PRIMEIRO ELEMENTO)
    //DOIS PONTEIROS: UM PARA O INÍCIO DA FILA E OUTRO PARA O FIM DA FILA, PARA FACILITAR A ADIÇÃO E REMOÇÃO DE ELEMENTOS
    //HÁ SOMENTE DUAS OPERAÇÕES: ADICIONAR E REMOVER, NÃO HÁ CONSULTA DE ELEMENTOS INTERMEDIÁRIOS, APENAS 
    // O PRIMEIRO ELEMENTO PODE SER CONSULTADO
    // OUTROS MÉTODOS: SIZE (TAMANHO DA FILA), ISEMPTY (VERIFICA SE A FILA ESTÁ VAZIA), 
    // CONTAINS (VERIFICA SE UM ELEMENTO ESTÁ NA FILA)
    
    // Stack<Integer> pilha = new Stack<>();
    
    //  public void exemploPilha() {
    //     pilha.push(10);
    //     pilha.push(20);
    //     pilha.push(30);
    //     pilha.push(60);
    //     pilha.push(50);
        
    //     pilha.sort(null);

    //     System.out.println(pilha); // [10, 20, 30]

    //     pilha.pop(); // Remove o elemento do topo (30)
    //     pilha.pop();
        
    //     System.out.println(pilha.contains(10)); // [10, 20]
    
    // Queue<Integer> fila = new LinkedList<>();

     
    //     fila.add(10);
    //     fila.add(20);
    //     fila.add(30);

    //     fila.remove(); // Remove o primeiro elemento da fila (10)

    //     System.out.println(fila); // [10, 20, 30]

    
    //     System.out.println(fila.contains(20)); // false

    //     System.out.println(fila.peek()); // 20 (consulta o primeiro elemento da fila sem removê-lo)
        
    //     System.out.println(fila);
    // }
}
