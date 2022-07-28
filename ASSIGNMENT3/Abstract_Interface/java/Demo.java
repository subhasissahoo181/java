package Abstract_Interface.java;

//public class Demo {

//}

interface AnimalEat {
    void eat();
 }
 interface AnimalMove {
    void move();
 }
 class Animal implements AnimalEat, AnimalMove {
    public void eat() {
       System.out.println("Animal is eating");
    }
    public void move() {
       System.out.println("Animal is moving");
    }
 }
 public class Demo {
    public static void main(String args[]) {
       Animal a = new Animal();
       a.eat();
       a.move();
    }
 }

