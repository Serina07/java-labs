package lab4;



abstract class Animal{
  abstract void display();
  void breed(String b)
  {
      System.out.println("I am "+b+" breed");
  }
}

class Dog extends Animal
{

  void display()
  {
      System.out.println("Woof woof 🐕");
  }
}
class Cat extends Animal
{
  void display()
  {
      System.out.println(("Meow meow 🐈‍⬛"));
  }
}
public class DMethod {
  public static void main(String[] args) {
      Animal d = new Dog();
      ((Animal)d).breed("dog");
      ((Animal)d).display();
      d = new Cat();
      ((Animal)d).breed("cat");
      ((Animal)d).display();
  }
}