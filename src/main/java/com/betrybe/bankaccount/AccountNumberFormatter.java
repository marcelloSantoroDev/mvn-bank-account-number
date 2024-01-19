package com.betrybe.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String accNumStr = Integer.toString(literalAccountNumber);
    // segunda opção
    //    String accNumStr2 = String.valueOf(literalAccountNumber);

    if (accNumStr.length() < 6) {
      //          accNumStr = String.format("%06d", literalAccountNumber);
      accNumStr = StringUtils.leftPad(accNumStr, 6, '0');
    } else if (accNumStr.length() > 6) {
      accNumStr = StringUtils.right(accNumStr, 6);
    }
    return accNumStr;
  }
}