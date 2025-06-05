package src;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pessoa pessoa1 = new Pessoa("João", 20);
        Pessoa pessoa2 = new Pessoa("Maria", 30);

        System.out.println(pessoa1.falar());
        System.out.println(pessoa2.falar());
    }
}