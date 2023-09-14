public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("Italo Moraes", 26);

        System.out.println(pessoa1.retornaName());
        System.out.println(pessoa1.retornaAge());
    }
}
