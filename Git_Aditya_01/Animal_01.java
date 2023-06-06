package java_demo;

//Abstract class Animal
abstract class Animal 
{
 String name;
 int age;
 
 public Animal(String name, int age) 
 {
     this.name = name;
     this.age = age;
 }
 
 abstract void makeSound();
}

//Subclass Dog
class Dog extends Animal 
{
 public Dog(String name, int age) 
 {
     super(name, age);
 }
 
 @Override
 void makeSound() 
 {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat
class Cat extends Animal 
{
 public Cat(String name, int age) 
 {
     super(name, age);
 }
 
 @Override
 void makeSound() 
 {
     System.out.println("The cat meows.");
 }
}

//Main class
public class Animal_01 
{
 public static void main(String[] args) 
 {
     Dog dog = new Dog("Buddy", 3);
     Cat cat = new Cat("Whiskers", 5);
     
     dog.makeSound();
     cat.makeSound();
 }
}
