package lab2;
// Create two thread:
//   1. with extending thread class print odd number in span of 2 seconds
//   2. with implementing runnable interface to print even number in span of 3 seconds

class CustomThread extends Thread{
  public void run(){
    System.out.println("Odd numbers:");
    for(int i=0;i<10;i++){
      if(i%2!=0){
        System.out.println("Odd number = " + i );
        try{
          Thread.sleep(2000);
        }
        catch(InterruptedException e){
          System.err.println("Thread Interrupted: "+ e.getMessage());
          Thread.currentThread().interrupt();
        }
      }
    }
  }
}


class ImplementThread implements Runnable{
  public void run(){
    System.out.println("Even numbers:");
    for(int i=0;i<10;i++){
      if(i%2==0){
        System.out.println("Even number = " + i );
        try{
          Thread.sleep(3000);
        }
        catch(InterruptedException e){
          System.err.println("Thread Interrupted: "+ e.getMessage());
          Thread.currentThread().interrupt();
        }
      }
    }
  } 
}
public class ThreadDemo {
  public static void main(String[] args) {
    CustomThread myThread = new CustomThread();
    myThread.run();  
      ImplementThread evenThread = new ImplementThread();    
      evenThread.run();
  }
  
}
