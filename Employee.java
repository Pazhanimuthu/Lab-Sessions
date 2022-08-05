/*
@author : Pazhani Muthu
Title : Employee salary.
Qns:Employee current salary and increment salary print? */
public class Employee 
{
	private String firstName; // instance variable that stores the first name
	private String lastName; // instance variable that stores the last name
	private double monthlySalary; // instance variable
	
	// constructor initializes firstName, lastName and monthlySalary with String and double supplied as argument
	public Employee (String fname, String lname, double msalary)
	{
		firstName = fname; // initialize firstName
		lastName = lname; // initialize lastName
		monthlySalary = msalary; // initialize monthlySalary
		
		// if the monthly salary is not positive, set it to 0.0.
		if (msalary < 0.0)
			monthlySalary = 0.0;
	} // end constructor
	
	// method to set the first name
	public void setFirstName (String fname)
	{
		firstName = fname;	// store the first name
		
	} // end method setFirstName
	
	// method to retrieve first name
	public String getFirstName ()
	{
		return firstName;
	} // end method getFirstName
	
	// method to set the last name
	public void setLastName (String lname)
	{
		lastName = lname;	// store the last name
	} // end method setLastName
	
	// method to retrieve last name
	public String getLastName ()
	{
		return lastName;
	} // end method getLastName
	
	// method to set the monthly salary
	public void setMonthlySalary (double msalary)
	{
		monthlySalary = msalary;	// store the monthly salary
		

	} // end method setMonthlySalary
	
	// method to retrieve monthly salary
	public double getMonthlySalary ()
	{
		return monthlySalary;
	} // end method getMonthlySalary
	
	// method to retrieve yearly salary
	public double getYearlySalary()
	{
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	} // end method getYearlySalary
	
	// method to retrieve yearly salary after giving 10% raise
	public double getRaiseSalary()
	{
		double raise =  monthlySalary * 0.1 ;
		double raiseSalary = ( monthlySalary + raise ) * 12;
		return raiseSalary;
	} // end method getRaiseSalary
	
} // end class Employee

class EmployeeTest 
{
	// main method begins program execution
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee( "Raj", "Kumar", 5000.00 );
		Employee emp2 = new Employee( "Ranjith", "K", 8000.00 );
		
		// display employee's initial yearly salary
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary() );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary() );
		
		System.out.println();
		
		// display employee's salary after giving 10% raise
		System.out.println( "** Giving 10% raise for each employee **" );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getRaiseSalary() );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getRaiseSalary() );
	} // end method main
} // end EmployeeTest