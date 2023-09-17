package com.banco.core;

public class ContaPoupanca extends Conta {
  
  @Override
  public void sacar(double valor){
    this.saldo -= valor + 2;
  }

  public void simalarRendimento(){
    this.saldo *= 0.05;
  }
  public void simalarRendimento(double taxa){
    this.saldo *= taxa;
  }
}
