package lab2;
//Create a Custom Runtime Exception: InvalidmarkException. Use the exception in your program.
class InvalidmarkException extends RuntimeException{
  public InvalidmarkException(String message) { super(message);}
}
public class UncheckedException {
  public static void main(String[] args){
    try {
      testMarks(39);
    }catch(InvalidmarkException e){
      System.out.println("Error :"+ e.getMessage());
    }
    try {
      testMarks(89);
    }catch(InvalidmarkException e){
      System.out.println("Error :"+ e.getMessage());
    }
  }
  
  public static void testMarks(int marks){
    if(marks < 40){
      throw new InvalidmarkException("You have failed!!!");
    } else {
      System.out.println("Congratulations, You have passed.");
    }
  }
}
