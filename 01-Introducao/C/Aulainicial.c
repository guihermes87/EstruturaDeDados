//Um diabético tem fator de correção (boulus) de carboidrato. O sistema precisa solicitar boulus de correção(dg/ml por carboidrato
// e a quantidade de carboidratos (em gramas) que a pessoa irá consumir. O sistema deve calcular a quantidade de insulina necessária para cobrir os carboidratos consumidos e exibir o resultado.


//Alexandre
//float boulusAlimentar = 15;
//float carboidratos = 60;
//float insulina_necessaria = carboidratos / Boulus;
//quantidadeInsulinaMaxima = 10; // Limite máximo de insulina para evitar hipoglicemia
//quantidade_insulina_maxima = 13; Python;

#include <stdio.h>

int main() {

int quantidadeInsulina;
int quantidadeMaximaCarboidratos;
int restanteInsulinaDia;
int restanteCarboidratosDia;
int quantidadeInsulinaMaxima;

int carboidratos, boulusAlimentar, insulinaNecessaria;
char nome[50];

    printf("Bem-vindo ao sistema de cálculo de insulina para diabéticos!\n");
    
    printf("Informe o seu nome: ");
    gets(nome);

    printf("Digite o fator de correção (boulus) para carboidratos: ");
    scanf("%d", &boulusAlimentar);

    printf("Digite a quantidade de insulina máxima que você pode usar por dia (em unidades): ");
    scanf("%d", &quantidadeInsulinaMaxima);

    printf("Digite a quantidade de carboidratos que você irá consumir (em gramas): ");
    scanf("%d", &carboidratos);

    // Calcula a insulina necessária
    insulinaNecessaria = carboidratos / boulusAlimentar;

    quantidadeInsulina = insulinaNecessaria;
    quantidadeMaximaCarboidratos = quantidadeInsulinaMaxima * boulusAlimentar;
    restanteCarboidratosDia = quantidadeMaximaCarboidratos - carboidratos;
    restanteInsulinaDia = quantidadeInsulinaMaxima - insulinaNecessaria;


    printf("A quantidade de insulina necessária é: %.2d unidades\n", insulinaNecessaria);

    printf("A quantidade de insulina que você usou foi: %.2d unidades\n", quantidadeInsulina);
    printf("A quantidade máxima de carboidratos que você pode consumir é: %.2d gramas\n", quantidadeMaximaCarboidratos);
    printf("A quantidade restante de carboidratos que você pode consumir é: %.2d gramas\n", restanteCarboidratosDia);
    printf("A quantidade restante de insulina que você pode usar é: %.2d unidades\n", restanteInsulinaDia);

    return 0;
}

