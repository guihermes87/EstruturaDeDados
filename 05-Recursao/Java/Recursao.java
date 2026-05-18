
import java.util.ArrayList;
import java.util.Random;

public class Recursao {

    // static void mostrarsequenciaCrescente(int numero) {
    // for (int i = 0; i <= numero; i++) {
    // System.out.print(i);
    // }

    // }

    // static void mostrarsequenciadecrescente(int numero) {
    // for (; numero >= 0; numero--) {
    // System.out.print(numero);
    // }
    // }

    // static void mostrarsequenciadecrescenteR(int numero) {
    // if (numero >= 0) {
    // System.out.print(numero);
    // mostrarsequenciadecrescenteR(numero - 1); // poi
    // }
    // }

    // static void mostrarIntervalo(int inicio, int fim) {
    // for (; inicio <= fim; inicio++) {
    // System.out.print(inicio);
    // }
    // }

    // static void mostrarIntervaloR(int inicio, int fim) {
    // if (inicio <= fim) {
    // System.out.print(inicio);
    // mostrarIntervaloR(inicio + 1, fim);
    // }
    // }

    // static void mostrarLista(ArrayList<Integer> lista) {

    // for (int i = 0; i < lista.size(); i++) {
    // System.out.println(lista.get(i));
    // }

    // // for (Integer i : lista) {
    // // System.out.println(i);
    // // }
    // }

    // static void mostrarlistaR(ArrayList<Integer> lista, int tamanho) {
    // if (tamanho > 0) {
    // mostrarlistaR(lista, tamanho - 1);
    // System.out.println(lista.get(tamanho - 1));

    // }
    // }

    // static void mostrarParesListaR(ArrayList<Integer> lista, int tamanho) {

    // if (tamanho > 0) {
    // mostrarParesListaR(lista, tamanho - 1);

    // if (lista.get(tamanho - 1) % 2 == 0) {
    // System.out.println(lista.get(tamanho - 1));
    // }
    // }
    // }

    // static void substituirR(ArrayList<Integer> lista, int tamanho, int
    // valorAntigo, int valorNovo) {
    // if (tamanho > 0) {

    // substituirR(lista, tamanho - 1, valorAntigo, valorNovo);

    // if (lista.get(tamanho - 1) == valorAntigo) {
    // lista.set(tamanho - 1, valorNovo);
    // }
    // }
    // }

    public static void popular(ArrayList<Integer> lista, int quantidade) {

        Random gerador = new Random();
        int numero;
        for (int i = 0; i < quantidade; i++) {
            numero = gerador.nextInt(100);
            lista.add(numero);
        }

    }

    public static void exibir(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }

    static void ExibirR(ArrayList<Integer> lista, int n) {

        if (n > 0) {
            System.out.println(lista.get(n - 1));
            ExibirR(lista, n - 1);
        }
    }

    static int somar(ArrayList<Integer> lista) {
        int soma = 0;
        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
        }
        return soma;
    }

    static int somarR (ArrayList<Integer> lista, int n) {
        if (n > 0) {
        
            return  lista.get(n - 1) + somarR(lista, n - 1);
            } else {
                return 0;
            }
            
        }
        
    static int ContarParesR (ArrayList<Integer> lista, int n) {
        if (n > 0) {
            if (lista.get(n - 1) % 2 == 0) {
                return 1 + ContarParesR(lista, n - 1);
            } else {
                return ContarParesR(lista, n - 1);
            }
        } else {
            return 0;
        }

}
    
    static int ContarOcorrenciasR(ArrayList<Integer> lista, int n, int valorPesquisa) {
    if (n > 0) {
        if (lista.get(n - 1) == valorPesquisa) {
            return 1 + ContarOcorrenciasR(lista, n - 1, valorPesquisa);
        } else {
            return ContarOcorrenciasR(lista, n - 1, valorPesquisa);
        }
    } else {
        return 0;
    }
}
   
    static void substituirR(ArrayList<Integer> lista, int tamanho, int valorPesquisa, int valorSubstituicao) {
    if (tamanho > 0) {
        substituirR(lista, tamanho - 1, valorPesquisa, valorSubstituicao);
        if (lista.get(tamanho - 1) == valorPesquisa) {
            lista.set(tamanho - 1, valorSubstituicao);
        }
    }
}

    static boolean isSortedR(ArrayList<Integer> lista, int n) {
    if (n <= 1) {
        return true; // Uma lista com 0 ou 1 elemento é considerada ordenada
    }
    if (lista.get(n - 1) < lista.get(n - 2)) {
        return false; // Se o elemento atual for menor que o anterior, a lista não está ordenada
    }
    
    return isSortedR(lista, n - 1); // Verificar os elementos anteriores
}

    static void ExibirMultiplosDe4R(ArrayList<Integer> lista, int n) {
    if (n > 0) {
        ExibirMultiplosDe4R(lista, n - 1);
        if (lista.get(n - 1) % 4 == 0) {
            System.out.println(lista.get(n - 1));
        }
    }
}

public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        int valorPesquisa = 51;
        int valorSubstituicao = 200;
       
        popular(lista, 10);

        lista.add(50);
        lista.add(51);
        
        substituirR(lista, lista.size(), valorPesquisa, valorSubstituicao);
        
        exibir(lista);

        
        System.out.println("Função Sort");
        isSortedR(lista, lista.size());
        
        System.out.println("Números múltipos de 4");
        ExibirMultiplosDe4R(lista, lista.size());

       
        System.out.println("O valor " + valorPesquisa + " ocorre " + ContarOcorrenciasR(lista, lista.size(), valorPesquisa) + " vezes na lista.");
    }
}


// System.out.println("A soma dos elementos é :" + somarR(lista, lista.size()));

// System.out.println("A quantidade de pares na lista é :" + ContarParesR(lista, lista.size()));

// Exercícios de fixação sobre o código base gerado. Faça métodos recursivos que:
// 1) receba uma lista, seu tamanho, valor de pesquisa. Caso o valor de pesquisa 
// ocorra na lista, retornar quantas vezes ele aparece.



// 2) receba uma lista, seu tamanho, valor de pesquisa, valor de substituição. 
// Caso o valor ocorra na lista, substituir o valor de pesquisa pelo valor de substituição



// 3) receba uma lista, seu tamanho e retorne TRUE se a lista, FALSE se a lista desordenada.


// 4) receba uma lista e seu tamanho. O método deve exibir todos os números múltiplos de 4.

