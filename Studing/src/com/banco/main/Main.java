package com.banco.main;

import com.banco.core.ContaCorrente;
import com.banco.core.ContaPoupanca;

public class Main {
  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();

    cc.depositar(100);
    System.out.println(cc.getSaldo());

    cc.sacar(20);
    System.out.println(cc.getSaldo());

    cp.depositar(100);
    System.out.println(cp.getSaldo());

    cp.sacar(20);
    System.out.println(cp.getSaldo());

  }
}
