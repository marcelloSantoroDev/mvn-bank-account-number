package com.betrybe.bankaccount;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


/**
 * The type Application.
 */
public class Application {

  /**
   * A simple get method.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    AccountNumberFormatter formatter = new AccountNumberFormatter();

    System.out.println("Informe o número da conta:");
    String accountNum = scanner.next();

    if (StringUtils.isNumeric(accountNum)) {
      String accountNumber = formatter.formatAccountNumber(Integer.parseInt(accountNum));
      System.out.println("Número da conta: " + accountNumber);

    } else {

      System.out.println("Número da conta inválido!");

    }

    scanner.close();

  }

}
