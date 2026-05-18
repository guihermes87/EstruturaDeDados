import Dado;

class Matriz:

    def inicializarMatriz(self, linhas, colunas):
        self.linhas = linhas
        self.colunas = colunas
        self.matriz = [[0 for j in range(colunas)] for i in range(linhas)]

    @staticmethod
    def exibirMatriz(matriz, linhas,colunas): 
        for i in range(linhas):
            for j in range(colunas):
                print(matriz[i][j], end=' ')
            print()  # Nova linha após cada linha da matriz
        
    @staticmethod
    def converterMatriz(matriz, linhas, colunas, lista):
        for i in range(linhas):
            for j in range(colunas):
                if matriz[i][j] != 0:
                    lista.append( Dado(i, j, matriz[i][j])) 
    

    @staticmethod
    def exibirLista(lista):
        for dado in lista:
            print(f"Valor: {dado.valor}, Linha: {dado.linha}, Coluna: {dado.coluna}")
            print(lista.length)