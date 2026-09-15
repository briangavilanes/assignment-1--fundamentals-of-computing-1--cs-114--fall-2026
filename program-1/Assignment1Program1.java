import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {
  public static void main(String[] args) {
    // 5-character string
    String chartext;
    String reversedtext = "";
    Scanner scan = new Scanner(System.in);

    System.out.println("Character String | Enter a 5 Character string:");
    chartext = scan.nextLine().substring(1,4);

    for (int i = chartext.length() - 1; i >= 0; i--) {
      reversedtext += chartext.charAt(i);
    }

    System.out.println("Entered: \"" + reversedtext + "\"");

    // Fahrenheit to Celsius conversion
    float Celsius;
    Scanner convertscan = new Scanner(System.in);

    System.out.println("Convert to Celsius | Enter a number in Fahrenheit:");
    float conversion = (convertscan.nextFloat() - 32) * 5/9;

    Celsius = conversion;

    System.out.println("Entered: \"" + Celsius + "\"");

    // Random Number
    Random gen = new Random();
    int numberpicked;

    numberpicked = gen.nextInt(16384) + 32;
    System.out.println("Random number picked: \""+ numberpicked +"\"");

    System.out.println("Final String: \"" + Celsius + reversedtext + numberpicked +"\"");
  }
}
