package hello;

import java.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("The current local time is: " + LocalTime.now());
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}