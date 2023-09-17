import java.time.LocalDate;

import classes.Aluguel;
import classes.Venda;

public class App {
    public static void main(String[] args) throws Exception {
        Aluguel apto1 = new Aluguel("Rua Joao Maciel, 189", LocalDate.now(), 800);
        System.out.println(apto1.getEndereco());
        System.out.println(apto1.getValorAluguel());

        Venda apto2 = new Venda("Rua Joao Maciel, 189", LocalDate.now(), 500000);
        System.out.println(apto2.getEndereco());
        System.out.println(apto2.getValorVenda());

        apto2.setAtivo();

        apto2.vender();
        System.out.println(apto2.isVendido());
    }
}
