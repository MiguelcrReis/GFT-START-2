package Ex01;

public class Crianca {

    private String nome;

    private String personalidade;

    @Override
    public String toString() {
        return "__Crianca__" +
                "nome='" + nome + '\'' +
                ", personalidade='" + personalidade + '\'' +
                '}';
    }

    public Crianca(String nome, String personalidade) {
        this.nome = nome;
        this.personalidade = personalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }
}
