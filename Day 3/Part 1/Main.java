import java.io.*;
import java.util.*; 

class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileReader("input.txt"));

    String[] binaryNumbers = new String[1000];
    int i = 0;
    int k = 0;
    String gammaNumber = "";
    String epsilonNumber = "";
    int mostCommon = 0;
    int leastCommon = 0;
    int numberOfOne = 0;
    int numberOfZero = 0;
    int totalConsumption = 0;

    while (sc.hasNext()) {
      String readingCurrNumber = sc.nextLine();
      binaryNumbers[i] = readingCurrNumber;
      i++;
    }
    for (int j = 0; j < 12; j++) {
      for (int l = 0; l < binaryNumbers.length; l++) {
        String accessElement = binaryNumbers[l];
        char firstPart = accessElement.charAt(k);
        int convertFirstPart = Character.getNumericValue(firstPart);
        if (convertFirstPart == 1) {
          numberOfOne++;
        }
        else if (convertFirstPart == 0) {
          numberOfZero++;
        }
      }
      if (numberOfOne > numberOfZero) {
        mostCommon = 1;
        leastCommon = 0;
      }
      else {
        mostCommon = 0;
        leastCommon = 1;
      }
      gammaNumber += mostCommon+""; 
      epsilonNumber += leastCommon+"";
      numberOfOne = 0;
      numberOfZero = 0;
      k++;
    }
    int decimalGamma =Integer.parseInt(gammaNumber,2);
    int decimalEpsilon =Integer.parseInt(epsilonNumber,2);
    totalConsumption = decimalGamma * decimalEpsilon;
    System.out.println(totalConsumption);
  }
}