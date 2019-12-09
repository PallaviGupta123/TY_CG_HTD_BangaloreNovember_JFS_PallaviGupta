package com.tyss.tyss.typecasting.pack1;

public class TestAnimal 
{
    public static void main(String args[])
{
  Animal a1=new Animal();
  a1.eat();// Type Matching
  System.out.println("-------------");
  
  Animal a2=new Dog();
  a2.eat();
  System.out.println("-------------");
  
  Dog d1=(Dog)a2;
  d1.eat();
  d1.walk();
  
  System.out.println("-------------");
  Animal a3=new Lion();
  Lion l1=(Lion) a3;
  l1.eat();
  l1.run();
  
}
   }
