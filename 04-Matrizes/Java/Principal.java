import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        int dimensao = 10;

        int matriz  [][] = new int[dimensao][dimensao];
        
        Matrizes.iniciarlizarMatrizInteiro(matriz, dimensao, dimensao);
        matriz[0][3] = 1;
        matriz[1][1] = 1;
        matriz[2][5] = 1;
        matriz[3][0] = 1;
        matriz[4][4] = 1;
        matriz[5][2] = 1;
        matriz[6][6] = 1;

        Matrizes.imprimirMatrizInteiro(matriz, dimensao, dimensao);   

        List<Dado> matrizEspecial = new ArrayList<>();
        
        Matrizes.converterMatrizParaLista(matriz, dimensao, dimensao, matrizEspecial);
        
        Matrizes.ExibirLista(matrizEspecial);

        


    }
}
