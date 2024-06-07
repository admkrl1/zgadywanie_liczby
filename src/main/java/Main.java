// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int a = random.nextInt(100);
    System.out.println("Zgadnij liczbę z zakresu od 0 do 100");
    int b = scanner.nextInt();

    while(a!=b) {
    System.out.println("Zgadnij liczbę z zakresu od 0 do 100");
    b = scanner.nextInt();
    }
    System.out.println("Zgadłeś");
  }
}
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
