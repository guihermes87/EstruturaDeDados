
public class Aluno {

        protected String nome;
        protected String curso;
        protected String genero;
        protected int ano;

        public Aluno(String nome, String curso, String genero, int ano) {
            this.nome = nome;
            this.curso = curso;
            this.genero = genero;
            this.ano = ano;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        @Override
        public String toString() {
            return "Aluno [nome=" + nome + ", curso=" + curso + ", genero=" + genero + ", ano=" + ano + "]";
        }

        
    
}
