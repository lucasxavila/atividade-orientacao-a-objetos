public class App {
  public static void main(String[] args) throws Exception {
      System.out.println("Hello, World!");
      Aluno aluno1 = new Aluno("João", 1232021645);
      Aluno aluno2 = new Aluno("Maria", 1232021323);

      System.out.println(aluno1.falar());
      System.out.println(aluno2.falar());
  }
}