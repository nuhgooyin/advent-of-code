import java.io.*;
import java.util.*; 

class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new FileReader("input.txt"));

    int horizontalPosition = 0;
    int depth = 0;

    while (sc.hasNext()) {
      int i = 0;
      String line = sc.nextLine();
      String[] readValue = line.split(" ");
      String wordCommand = readValue[i];
      System.out.println("Word Command "+wordCommand);
      String valueCommand = readValue[i+1];
      System.out.println("Value command "+valueCommand);
      int valueCommandConv = Integer.parseInt(valueCommand);
      if (wordCommand.equals("forward")) {
        horizontalPosition += valueCommandConv;
      }
      else if (wordCommand.equals("up")) {
        depth -= valueCommandConv;
      }

      else if (wordCommand.equals("down")) {
        depth += valueCommandConv;
      }
    }

    int finalPosition = horizontalPosition*depth;
    System.out.println(finalPosition);
    System.out.println(horizontalPosition);
    System.out.println(depth);
}
}