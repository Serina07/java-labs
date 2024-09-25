package lab3;


import java.util.Scanner;
import java.io.*;

public class InputText {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text;
    System.out.println("Enter the string: ");
    text = sc.nextLine();
    
    try(
      FileWriter w = new FileWriter("ThisFile.txt")){
      w.write(text);
      }catch
    (IOException e) {
      System.out.println("Error: "+ e.getMessage());
      throw new RuntimeException(e);
    }
     try (BufferedReader bufferedReader = new BufferedReader(new FileReader("ThisFile.txt"))) {
            String line;

            System.out.println("\nFile Contents:\n");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
  }
  
}
}
