package lab2;
//Create a Custom Checked Exception: MyException. Use the exception in your program.

class MyException extends Exception{
  public MyException(String message) { super(message);}
}
public class CheckException {
  public static void main(String[] args){
    try {
      testAge(10);
    }catch(MyException e){
      System.out.println("Error :"+ e.getMessage());
    }
    try {
      testAge(22);
    }catch(MyException e){
      System.out.println("Error :"+ e.getMessage());
    }
  }
  
  static void testAge(int age) throws MyException {
    if(age < 18){
      throw new MyException("You are not Authorized!!!");
    } else {
      System.out.println("You are Authorized.");
    }
  }
}
