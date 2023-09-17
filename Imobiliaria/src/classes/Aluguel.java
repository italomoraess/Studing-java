package classes;

import java.time.LocalDate;

public class Aluguel extends Imovel {

  private double valorAluguel;
  private boolean alugado;

  public Aluguel(String endereco, LocalDate dataCadastro, double valorAluguel) {
    super(endereco, dataCadastro);
    this.alugado = false;
    this.valorAluguel = valorAluguel;
  }

  public double getValorAluguel() {
    return valorAluguel;
  }

  public void setValorAluguel(double valorAluguel) {
    this.valorAluguel = valorAluguel;
  }

  public boolean isAlugado() {
    return alugado;
  }

  public void Alugar() {
    if (ativo) this.alugado = true;
  }

}
