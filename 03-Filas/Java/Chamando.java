import java.util.Queue;
import java.util.Scanner;

public class Chamando {

    public static void main(String[] args) {

        Queue<Integer> filaNormal = new java.util.LinkedList<>();
        Queue<Integer> filaPrioritaria = new java.util.LinkedList<>();

        int contarNormal = 0;
        int contarPrioritaria = 500;
        int totalAtendimentos = 0;

        Scanner teclado = new Scanner(System.in);
        String opcao = "";
        String qualFila;

        do {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar cliente à fila normal");
            System.out.println("2 - Adicionar cliente à fila prioritária");
            System.out.println("3 - Chamar próximo cliente");
            System.out.println("4 - Mostrar fichas (Quantidade)");
            System.out.println("5 - Sair");

            opcao = teclado.nextLine();

            switch (opcao) {

                case "1":

                    System.out.println("Cliente adicionado à fila normal. Ficha: " + contarNormal);
                    filaNormal.add(contarNormal);
                    contarNormal++;
                    break;

                case "2":

                    filaPrioritaria.add(contarPrioritaria);
                    System.out.println("Cliente adicionado à fila prioritária. Ficha: " + contarPrioritaria);
                    contarPrioritaria++;
                    break;

                case "3":
                    int fichaAtendida = -1;
                    // if (!filaPrioritaria.isEmpty()) {
                    // int clienteAtendido = filaPrioritaria.poll();
                    // totalAtendimentos++;
                    // System.out.println("Cliente da fila prioritária atendido. Ficha: " +
                    // clienteAtendido);
                    // } else if (!filaNormal.isEmpty()) {
                    // int clienteAtendido = filaNormal.poll();
                    // totalAtendimentos++;
                    // System.out.println("Cliente da fila normal atendido. Ficha: " +
                    // clienteAtendido);
                    // } else {
                    // System.out.println("Não há clientes para atender.");
                    // }
                    // break;

                    System.out.println("Chamando próximo cliente...");
                    
                    if (totalAtendimentos % 3 == 0) {
                        qualFila = "prioritária";
                    } else {
                        qualFila = "normal";
                    }

                    if (qualFila.equals("prioritária") && !filaPrioritaria.isEmpty()) {

                        int clienteAtendido = filaPrioritaria.poll();
                        totalAtendimentos++;
                        System.out.println("Cliente da fila prioritária atendido. Ficha: " + clienteAtendido);

                    } else if (qualFila.equals("normal") && !filaNormal.isEmpty()) {

                        int clienteAtendido = filaNormal.poll();
                        totalAtendimentos++;
                        System.out.println("Cliente da fila normal atendido. Ficha: " + clienteAtendido);
                    
                        //DEVERIA SER NORMAL, MAS ESTÁ VAZIA, ENTÃO VAI PRIORITÁRIA.

                    }  else if (qualFila.equals("prioritária") && filaPrioritaria.isEmpty() && !filaNormal.isEmpty()) {
                        int clienteAtendido = filaNormal.poll();
                        totalAtendimentos++;
                        System.out.println("Cliente da fila normal atendido. Ficha: " + clienteAtendido);

                    } else if (qualFila.equals("normal") && filaNormal.isEmpty() && !filaPrioritaria.isEmpty()) {
                        
                        fichaAtendida = filaPrioritaria.poll();
                        int clienteAtendido = filaPrioritaria.poll();
                        totalAtendimentos++;
                        System.out.println("Cliente da fila prioritária atendido. Ficha: " + clienteAtendido);

                    } if(fichaAtendida != -1) {
                        System.out.println("Chamando ficha... Ficha: " +qualFila + ":" + fichaAtendida);
                    } else {
                        System.out.println("Não há clientes para atender.");
                    }
                
                case "4":
                    
                  
                System.out.println("Total de atendimentos realizados: " + totalAtendimentos);

                System.out.println("Clientes na fila normal: " + filaNormal);
                System.out.println("Total de fichas: " + filaNormal.size());

                System.out.println("Clientes na fila prioritária: " + filaPrioritaria);
                System.out.println("Total de fichas: " + filaPrioritaria.size());
                    
                break;

                case "5":

                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (!opcao.equals("5"));

    }

}
