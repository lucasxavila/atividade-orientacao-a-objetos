package src;
public class Aluno extends Pessoa {
  private String ra;
  private int nota1, nota2, nota3;

  public Aluno(String nome, int idade, String ra, int nota1, int nota2, int nota3) {
    super(nome, idade);
    this.ra = ra;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public int getNotaTotal() {
    return nota1 + nota2 + nota3;
  }

  public String InfoAluno() {
    return "Nome: " + nome + "\nIdade" + idade + "\nRA: " + ra + "\nNota1: " + nota1 + 
           "\nNota2: " + nota2 + "\nNota3: " + nota3 + "\nTotal: " + getNotaTotal();
  }
    
  public String getRa(){
    return ra;
  }

  public int getNota1(){
    return nota1;
  }

  public int getNota2(){
    return nota2;
  }

  public int getNota3(){
    return nota3;
  }
}