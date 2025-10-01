/**
 * @author Jhonatan Parada <jhonatanparada499@gmail.com>
 */

// import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Table {
  public static void main(String[] args) {
    DateFirstTry date2 = new DateFirstTry(
        1, 1, 1),
        date3 = new DateFirstTry();

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a line message");
    String s = keyboard.nextLine();
    System.out.println(s);

    System.exit(0);

    date2.setDate(1, 1, 1);
    date3.setDate(2, 1, 1);

    StringTokenizer wordFactory = new StringTokenizer(
        "Give a message, friend.", " ");

    while (wordFactory.hasMoreTokens()) {
      System.out.println(wordFactory.nextToken());
    }

    System.exit(0);

    double sum = 1;
    for (int n = 2; n <= 10; n++) {
      sum += n;
    }

    System.out.print(sum);
    keyboard.close();
  }
}
