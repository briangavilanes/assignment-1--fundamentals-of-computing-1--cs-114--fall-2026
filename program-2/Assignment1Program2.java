import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    int baseinput;
    Scanner inputscan = new Scanner(System.in);
    System.out.println("|| Base Conversion Program ||\n|| Please enter a base (2-9)");

    baseinput = inputscan.nextInt();
    int maxnumber = (int) Math.pow(baseinput, 4) - 1;

    System.out.println("The maximum, 4-digit, base 10 number in base \""+ baseinput + "\" is \""+ maxnumber +"\"");
    System.out.println("Enter a base 10 number in the range 0 to \"" + maxnumber + "\" to convert");

    int baseconvert = inputscan.nextInt();

    int digit1 = baseconvert / ((int) Math.pow(baseinput, 3));
    int digit2 = (baseconvert / ((int) Math.pow(baseinput, 2))) % baseinput;
    int digit3 = (baseconvert / baseinput) % baseinput;
    int digit4 = baseconvert % baseinput;

    System.out.println(baseconvert + " (base 10) = " + digit1 + digit2 + digit3 + digit4 + " (base " + baseinput +")");
  }
}
