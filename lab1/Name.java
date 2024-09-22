package lab1;
import java.util.Scanner;

public class Name {
  String fname;
  String lname;
  Name(String fn, String ln){
    fname= fn;
    lname = ln;
  }
  void display(){
  System.out.println("The name is: "+fname.toUpperCase() + " "+lname.toUpperCase());
}
  }

  class Input{
    public static void main(String[] args) {
      System.out.println("Enter first name:");
      try (Scanner sc = new Scanner(System.in)) {
        String fn = sc.nextLine();

        System.out.println("Enter last name:");
        String ln = sc.nextLine();

        Name n = new Name(fn,ln);
        n.display();
      }
    }
  }
