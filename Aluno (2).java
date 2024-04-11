public class Aluno {
    private String nome;
    private int ra;

    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String falar() {
        return "Oi, eu sou " + nome + " - " + ra + ".";
    }

    public String getNome() {
        return nome;
    }

    public int getRA() {
        return ra;
    }
}