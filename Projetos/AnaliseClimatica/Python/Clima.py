
import random

class Clima:

    # Definindo faixas de temperatura para cada tipo;

    FAIXAS = {
        "Frio":   (0, 15),
        "Ameno":  (16, 24),
        "Quente": (25, 40),
    }

    #construtor

    def __init__(self, ano, mes, temperatura, precipitacao):
        self.ano = ano
        self.mes = mes
        self.temperatura = temperatura
        self.precipitacao = precipitacao
        
        faixa = self.FAIXAS.get(temperatura, (0, 40))
        
        #cria 2 faixas de temperatura para cada tipo, e gera um valor aleatório dentro dessa faixa
        
        self.graus = random.randint(faixa[0], faixa[1]) 

    #REPRESENTANDO A FORMA COMO OBJETO SERÁ DEMONSTRADO - ALTERANDO PARA GRAUS O PROCESSO DE EXIBIÇÃO;

    def __str__(self):
        return (f"Dados Climáticos(ano={self.ano}, mes={self.mes}, "
                f"temperatura={self.temperatura}, graus={self.graus}°C, "
                f"precipitacao={self.precipitacao})")

    #comparação de objetos, considerando ano e mês como critérios de igualdade

    def __eq__(self, object):
        return (self.ano == object.ano and self.mes == object.mes)