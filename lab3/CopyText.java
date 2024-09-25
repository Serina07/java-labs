package lab3;

import java.io.FileOutputStream;
import java.io.FileReader;
// import java.io.FileNotFoundException;
// import java.io.IOException;

public class CopyText {
  public static void main(String[] args) {
    try(
      FileOutputStream out = new FileOutputStream("myFile.txt");
      FileOutputStream copy = new FileOutputStream("copiedFile.txt");
      FileReader read = new FileReader("myFile.txt")){

      String text = "This is coming from Serina.";
      out.write(text.getBytes());

      int i;

      while((i= read.read())!= -1) {
        System.out.print((char) i);
        copy.write(i);
        // copy.close();
      }
      // close();
    }catch
    (Exception e) {
      throw new RuntimeException(e);
    }
  }
  
}
