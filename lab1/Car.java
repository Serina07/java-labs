package lab1;
//create a class car with fields: model, color, price, milage.
//create two objects of the class with all value initialized and non value initialized.
public class Car {
  String model;
  String color;
  int price;
  double milage;
  public Car(String model, String color, int price, double milage){
    this.model = model;
    this.color = color;
    this.price = price;
    this.milage = milage;
  }
  public Car(){
  //   this.model = null;
  //   this.color = null;
  //   this.price = 0;
  //   this.milage = 0.0;
  }

  public void display(){
    System.out.println("Model: "+model);
    System.out.println("Color: "+ color);
    System.out.println("Price: "+price+ "$");
    System.out.println("Milage: "+milage+"kmpl");
  }

  public static void main(String[] args)
  {
    Car car1 = new Car("Hyundai Santa Fe", "Black", 15000, 10.42);
    Car car2 = new Car();

    System.out.println("Car details for all value initialized: ");
    car1.display();

    System.out.println("Car details for all non-value initialized: ");
    car2.display();
  }
}
