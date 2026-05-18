public class Dado {

    int valor;
    int linha;
    int coluna;

    public Dado(int valor, int linha, int coluna) {
        this.valor = valor;
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Dado other = (Dado) obj;

        if (this.linha != other.linha) {
            return false;
        }
        return this.coluna == other.coluna;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dado{");
        sb.append("valor=").append(valor);
        sb.append(", linha=").append(linha);
        sb.append(", coluna=").append(coluna);
        sb.append('}');
        return sb.toString();
    }





}
