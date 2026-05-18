from Matrizes import Matriz

dimensao = 10

matriz = [[0 for i in range(dimensao)] for j in range(dimensao)]    

matriz[0][0] = 1
matriz[0][1] = 2
matriz[2][2] = 3
matriz[4][3] = 4

Matriz.exibirMatriz(matriz, dimensao, dimensao)

lista_especial = []

Matriz.converterMatriz(matriz, dimensao, dimensao, lista_especial)
Matriz.exibir_lista(matriz, dimensao, dimensao)