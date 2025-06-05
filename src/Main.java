package src;
public class Main {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("João", 20, "123456", 25, 30, 35);
    Aluno aluno2 = new Aluno("Maria", 22, "654321", 20, 30, 40);

    System.out.println(aluno1.InfoAluno());
    System.out.println("---------------");
    System.out.println(aluno2.InfoAluno());
  }
}