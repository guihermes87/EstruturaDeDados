
from Glicemia import Glicemia
from minhas_funcoes import popular_lista_arquivo, exibir_lista, calcular_media

lista = []

nome_base = "dados.csv"

popular_lista_arquivo(lista, nome_base)

exibir_lista(lista)

print("Média Glicêmica", calcular_media)



# obj = Glicemia(190,"11/01/2026","09:00")
# lista.append(obj)

# lista.append(Glicemia (130, "2024-06-01", "12:00"))

# for i in range(3):
#     valor = float(input("Digite o valor da glicemia: "))
#     data = input("Digite a data (dd/mm/aaaa): ")
#     hora = input("Digite a hora (hh:mm): ")
#     lista.append(Glicemia(valor, data, hora))

#     for item in lista:
#         print(f"Valor: {item.valor}, Data: {item.data}, Hora: {item.hora}")    

















