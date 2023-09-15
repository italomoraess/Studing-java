public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa1 = new Pessoa("Italo Moraes", 26, "059.741.313-47");
        pessoa1.setName("Italo Moraes Moura Gurgel");

        System.out.println(pessoa1.getName());
        System.out.println(pessoa1.getAge());
        System.out.println(pessoa1.getCpf());
    }
}
