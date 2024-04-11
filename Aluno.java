public class Aluno {
  private String nome;
  private String ra;
  private int nota1, nota2, nota3;
  private int notaTotal;

  public Aluno(String nome, String ra, int nota1, int nota2, int nota3, int notaTotal){
    this.nome = nome;
    this.ra = ra;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
    this.notaTotal = notaTotal;
  }

  public String InfoAluno() {
    return "Nome: " + nome + "\nRA: " + ra + "\nNota1: " + nota1 + "\nNota2: " + nota2 + "\nNota3: " + nota3 + "\nTotal: " + notaTotal;
  }
    
  public String getNome(){
    return nome;
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

  public int getNotaTotal(){
    return notaTotal = nota1 + nota2 + nota3;
  }
}
 
