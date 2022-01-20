import java.io.*;
import java.util.*; 

class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileReader("input.txt"));

    int numberOfIncrease = 0;
    int currentNumber = 0;
    int nextNumber = 0;
    int lastNumber = 0;
    int lastSum = 0;
    int currentSum = 0;
    int[] numbers = new int[2000];
    int i = 0;

    while (sc.hasNext()) {
      currentNumber = sc.nextInt();
      numbers[i] = currentNumber;
      i++;
    }

    for (int j = 0; j < numbers.length-2; j++) {
      currentNumber = numbers[j];
      nextNumber = numbers[j+1];
      lastNumber = numbers[j+2];
      currentSum = currentNumber + nextNumber + lastNumber;
      if (currentSum > lastSum) {
        if (lastSum != 0) {
          numberOfIncrease++;
        }
      }
      lastSum = currentSum;
    }
    System.out.print(numberOfIncrease);
  }
}