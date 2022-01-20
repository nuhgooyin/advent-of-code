import java.io.*;
import java.util.*; 

class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileReader("input.txt"));

    int numberOfIncrease = 0;
    int readLastNumber = sc.nextInt();

    while (sc.hasNext()) {
      int readCurrentNumber = sc.nextInt();

      if (readLastNumber < readCurrentNumber) {
        numberOfIncrease++;
      }
      readLastNumber = readCurrentNumber;
    }
    System.out.print(numberOfIncrease);
  }
}