from Clima import Clima
from funcoes import media_graus, exibir_resumo, mes_mais_frequente

lista = []

leitor = open("base.csv", "r", encoding="utf-8")

for linha in leitor:
    dadosLinha = linha.strip().split(",")
    if len(dadosLinha) == 4:
        obj_clima = Clima(dadosLinha[0], dadosLinha[1], dadosLinha[2], dadosLinha[3])
        if obj_clima not in lista:
            lista.append(obj_clima)

leitor.close()


while True:

    print("\nEscolha entre as opcoes a seguir:")
    print("1 - Meses mais quentes")
    print("2 - Meses mais chuvosos")
    print("3 - Meses mais secos")
    print("4 - Meses mais frios")
    print("5 - Comparativo: Quente vs Frio")
    print("0 - Sair")

    opcao = int(input("\nDigite a opcao desejada: "))

    if opcao == 1:
        exibir_resumo([c for c in lista if c.temperatura == "Quente"], "MESES MAIS QUENTES")
        
        

    elif opcao == 2:
        exibir_resumo([c for c in lista if c.precipitacao in ("média", "muita")], "MESES MAIS CHUVOSOS")

    elif opcao == 3:
        exibir_resumo([c for c in lista if c.precipitacao == "nada"], "MESES MAIS SECOS")

    elif opcao == 4:
        exibir_resumo([c for c in lista if c.temperatura == "Frio"], "MESES MAIS FRIOS")

    elif opcao == 5:
        quentes = [c for c in lista if c.temperatura == "Quente"]
        frios   = [c for c in lista if c.temperatura == "Frio"]

        print("\nCOMPARATIVO: QUENTE vs FRIO")
        print(f"Media meses quentes : {media_graus(quentes):.1f}C")
        print(f"Media meses frios   : {media_graus(frios):.1f}C")
        print(f"Diferenca           : {media_graus(quentes) - media_graus(frios):.1f}C")

    elif opcao == 0:
        print("\nEncerrando o programa!")
        break

    else:
        print("Opcao invalida. Escolha entre 0 e 5.")