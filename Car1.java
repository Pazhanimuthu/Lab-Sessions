/*
@author : Pazhani Muthu
Title : this keyword using Constructor type.
Qns: Bought a new car And Car models ? */

public class Car1{
    
    String name;
    int price;
    String model;
    String color;

    public Car1(String name,int price,String model,String colorName){
        this.name=name;
        this.price=price;
        this.model=model;
        color=colorName;
    }

//default constructor:
public Car1(String name){    //0th parameter constructor
   System.out.println("I have bought new CAR");
   System.out.println("I have choose my models");
}
public Car1(String name,int i){   //1st parameter constructor
   System.out.println("1st Choice Car");
   System.out.println("AUDI CAR "+2020);
   }
public Car1(String name1,String name2,int i){  //2nd parameter constructor
   System.out.println("2nd Choice Car");
   System.out.println("MARUTHI SUZUKI "+"&  TOYOTA "+2019);
   }

   public static void main(String[]args){
    Car1 c=new Car1("SWIFT CAR");
    Car1 c1=new Car1("AUDI CAR", 2020);
    Car1 c2=new Car1("MARUTHI SUZUKI","  TOYOTA", 2019);

    Car1 obj1=new Car1("Audi ",50," A7"," RED");
    Car1 obj2=new Car1("BMW ",40," BMW 520d"," Black");
    Car1 obj3=new Car1("Honda ",20," Civic"," White");
     System.out.println(obj1.name+""+obj1.price+""+obj1.model+""+obj1.color);
     System.out.println(obj2.name+""+obj2.price+""+obj2.model+""+obj2.color);
     System.out.println(obj3.name+""+obj3.price+""+obj3.model+""+obj3.color);
   }

}
