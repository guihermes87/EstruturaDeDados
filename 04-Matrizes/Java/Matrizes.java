import java.util.List;

//Saber urgente
// Objeto de classse ou matriz/vetor - Quando passado como parametro/argumento é passado por
// referência, ou seja, o método tem acesso ao objeto original e pode modificar seus valores.
//Todos os objetos em Java são passados por referência, incluindo matrizes e vetores.
// Portanto, quando você passa uma matriz ou vetor como argumento para um método, 
// o método tem acesso ao objeto original e pode modificar seus valores. 
// Isso significa que as alterações feitas dentro do método afetarão o objeto original fora do método.

public class Matrizes {
    /**
     * método para inicializar uma matriz de inteiros com valores aleatórios entre 0 e 100
     * @param matriz inteiro que sera inicializada com zeros
     * @param qtdLinhas
     * @param qtdColunas
     */
    public static void iniciarlizarMatrizInteiro( int m[][], int qtdLinhas, int qtdColunas) {
        for (int lin = 0; lin < qtdLinhas; lin++) {
            for (int col = 0; col < qtdColunas; col++) {
                m[lin][col] = (int) (Math.random() * 0);
            }
        }
    }

    /**
     * método para imprimir uma matriz de inteiros de qualquer tipo
     * @param m - matriz que sera impressa
     * @param qtdLinhas - quantidade de linhas da matriz
     * @param qtdColunas - quantidade de colunas da matriz
     */
    public static void imprimirMatrizInteiro(int m[][], int qtdLinhas, int qtdColunas) {
        for (int lin = 0; lin < qtdLinhas; lin++) {
            for (int col = 0; col < qtdColunas; col++) {
                System.out.print(m[lin][col] + "\t");
            }
            System.out.println();
        }
    }
    /**
     * método para converter uma matriz de inteiros em uma lista de objetos do tipo Dado, onde cada objeto representa um elemento não nulo da matriz, contendo o valor do elemento e suas coordenadas (linha e coluna).
     * @param m - matriz de inteiros a ser convertida
     * @param qtdLinhas - quantidade de linhas da matriz
     * @param qtdColunas - quantidade de colunas da matriz
     * @param lista - lista de objetos do tipo Dado onde serão armazenados os elementos não nulos da matriz
     */
    public static void converterMatrizParaLista(int m[][], int qtdLinhas, int qtdColunas, List<Dado> lista) {
        for (int lin = 0; lin < qtdLinhas; lin++) {
            for (int col = 0; col < qtdColunas; col++) {
                if (m[lin][col] != 0) {
                    Dado dado = new Dado(m[lin][col], lin, col);
                    lista.add(dado);
                }
            }
        }
    }

    /**
     * método para exibir os elementos de uma lista de objetos do tipo Dado, imprimindo o valor e as coordenadas (linha e coluna) de cada elemento.
     * @param lista - lista de objetos do tipo Dado a ser exibida
     */
    
    public static void ExibirLista(List<Dado> lista) {
        for (Dado item : lista) {
            System.out.println(item);
        }
    }
}
