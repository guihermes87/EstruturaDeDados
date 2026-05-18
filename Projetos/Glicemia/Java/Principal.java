
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        ArrayList<Glicemia> lista = new ArrayList<>();
        
        
        //alternativa 1
        Glicemia obj = new Glicemia(120, "2024-06-01", "08:00");
        lista.add(obj);

        //alternativa 2
        lista.add(new Glicemia(130, "2024-06-01", "12:00"));

        //alternativa 3
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o valor da glicemia: ");
            int valor = teclado.nextInt();
            teclado.nextLine(); // Limpar o buffer do teclado
            System.out.print("Digite a data (YYYY-MM-DD): ");
            String data = teclado.nextLine();
            System.out.print("Digite a hora (HH:MM): ");
            String hora = teclado.nextLine();

            lista.add(new Glicemia(valor, data, hora));
            teclado.close();
        }

        //exibir os dados alternativa 1

        for (int i = 0; i <lista.size(); i++) {
           
            System.out.println(lista.get(i).valor + " - " + lista.get(i).data + " - " + lista.get(i).hora);
        }

        //alternativa 2
        
        for (Glicemia item : lista) {
            System.out.println("Valor: " + item.valor + ", Data: " + item.data + ", Hora: " + item.hora);
        }


    }   




}
