
import java.util.ArrayList;


public class Splitar {
    
    public static void main(String[] args) {
        
        ArrayList<Glicemia> lista = new ArrayList<>();
        
        //ler a linha
        
        String linha = "120,2024-06-01,08:00";
        
        //splitar a linha
        String splitarlinha[] = linha.split(",");

        //criar o objeto
        Glicemia obj = new Glicemia(Integer.parseInt(splitarlinha[0]), splitarlinha[1], splitarlinha[2]);

        System.out.println(obj.valor + " - " + obj.data + " - " + obj.hora);

        if (lista.contains(obj)) {
            System.out.println("O objeto já existe na lista.");
        } else {
            lista.add(obj);
            System.out.println("Objeto adicionado à lista.");
        }
    
        for (Glicemia item : lista) {
            System.out.println("Valor: " + item.valor + ", Data: " + item.data + ", Hora: " + item.hora);
        }
    }
}