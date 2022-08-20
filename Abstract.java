/*Author:Pazhani Muthu
Title:abstract
Question:Write the program display staff and student details using abstract & inheritance.
*/
abstract class person // parent class
{
	abstract void Detail1(); //abstract method.
	abstract void Detail2(); //abstract method.
	abstract int getsalary(); //getmethod using in abstract.
	
    void Detail() 
	{	// method for parent class test.	
			System.out.println("Staff and Student details ");
	}
}
abstract class staff extends person  // child class staff  is extended from person.
{                    
	     @Override
	void Detail1() 
	{		// parent class method of test1 is override in child class.
			System.out.println("Staff Name Sarala");
	}
	 @Override
	void Detail2() 
	{		// parent class method of test2 is override in child class.
            System.out.println("Staff Address");
			System.out.println("No:35 123  st,redhills ch-52.");
	}
	 @Override
	public int getsalary() 
	 { // parent class getter method override in child class.                  
		return 30000;
	 }
}
class student extends staff{ // abstract of the staff class extended  in student class.
	void Detail4() 
	{  // student class method .
		System.out.println("Student  Name Muthu");
		System.out.println("Student Address");
	}
	void Detail5() 
	{		// student class method .
			System.out.println("No:145/2 grandline, redhills chennai -52. ");
	}
	void Detail6() 
	{		// student class method .
			System.out.println("Student Fees Structure");
	}
	void Detail7( int a , int b,int c ,int d,int e) // student class method 
	{		
	System.out.println("Registration  Fees = "+a);
	System.out.println("Admisstion Fees  = "+b);
	System.out.println("Tution Fees  = "+c);
	System.out.println("Transportation = "+d);
	System.out.println("Mess fees  = "+e);
    System.out.println("Total Amount = "+(a+b+c+d+e));
	}
}
public class Abstract{
	public static void main(String[] args) 
	{
			
		student objstudent = new student();	// create the object in Abstract class	
		objstudent.Detail(); // using the objstudent  in abstract person  class 
		objstudent.Detail1();   //using the objstudent  in abstract person  class 
		objstudent.Detail2();	//using the objstudent  in abstract person  class 
		System.out.println("Salary = " +objstudent.getsalary()); // print the statement to get the salary of  staff 
		objstudent.Detail4(); //using the objstudent  in abstract student  class 
		objstudent.Detail5(); //using the objstudent  in abstract student class 
		objstudent.Detail6(); // using the objstudent  in abstract student  class 
		objstudent.Detail7(500,2000,40000,10000,10000);
    
	}

}