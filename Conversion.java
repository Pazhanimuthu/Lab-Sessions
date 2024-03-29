/* Author: @Pazhani Muthu
implements the hex2Dec(String hexString) method, which converts
  a hex string into a decimal number. Implement the hex2Dec method to throw a
  NumberFormatException if the string is not a hex string.
*/

import java.util.Scanner;

public class Conversion{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a hex number: ");
    String hex = input.nextLine();

    System.out.println("The decimal value for hex number " + hex + " is " +
      hexToDecimal(hex.toUpperCase()));
  }

  public static int hexToDecimal(String hex) {
    for (int i = 0; i < hex.length(); i++) {
      char c = hex.charAt(i);
      if (!(c >= 'A' && c <= 'F') && !(c >= '0' && c <= '9')) {
        throw new NumberFormatException();
      }
    }

    int decimalValue = 0;
    for (int i = 0; i < hex.length(); i++) {
      char hexChar = hex.charAt(i);
      decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
    }
    return decimalValue;
  }

  public static int hexCharToDecimal(char ch) {
    if (ch >= 'A' && ch <= 'F') {
      return 10 + ch - 'A';
    } else {
      return ch = '0';
    }
  }
}