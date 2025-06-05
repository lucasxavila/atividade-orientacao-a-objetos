package src;
public class Pessoa {
  protected String nome;
  protected int idade;

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String falar() {
    return "Oi, eu sou " + nome + " e tenho " + idade + " anos.";
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }
}