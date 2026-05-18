def media_graus(lista_filtrada):
    if not lista_filtrada:
        return 0
    return sum(c.graus for c in lista_filtrada) / len(lista_filtrada)


def mes_mais_frequente(lista_filtrada):
    contagem = {}
    for c in lista_filtrada:
        contagem[c.mes] = contagem.get(c.mes, 0) + 1
    return max(contagem, key=contagem.get)


def exibir_resumo(lista_filtrada, titulo):
    if not lista_filtrada:
        print("Nenhum registro encontrado.")
        return

    print(f"\n{titulo}")
    print(f"Total de ocorrências:  {len(lista_filtrada)}")
    print(f"Média de temperatura:  {media_graus(lista_filtrada):.1f}C")
    print(f"Mês com maior frequência: {mes_mais_frequente(lista_filtrada)}")
    print()
    for c in lista_filtrada:
        print(f"  {c.ano} | {c.mes} | {c.graus}C | {c.precipitacao}")
    print()