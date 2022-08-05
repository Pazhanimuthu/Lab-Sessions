/*
@author : Pazhani Muthu
Title : Employee salary.
Qns:Employee current salary and increment salary print? */

import java.util.Scanner;

public class Employee

 {
    int id;
    String name;
    String salary;
    float incrementsalary;
    static int numberofobjects=0;

    Employee(){
    id=0;
    name="";
    salary="";
    incrementsalary=0;
    }
    Employee(int id,String name,String salary,float incrementsalary ){
        this.id=id;
        this.name=name;
        this.incrementsalary=incrementsalary;
        this.salary=salary;
        numberofobjects++;
        }
    public void display(){
        System.out.println("Employee Id :"+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee Salary :"+salary);
        System.out.println("Employee increment salary :"+incrementsalary);
        }
    public static void main(String[] args){
        int n=0;
        Scanner sc=new Scanner(System.in);
            System.out.print("How many employees you want to enter :");
        n=sc.nextInt();
        Employee[] ob=new Employee[n];
        for(int i=0;i<n;i++){
        sc= new Scanner(System.in);
            System.out.println("Enter Id of employee "+(i+1)+" :");
        int id=sc.nextInt();
            System.out.println("Enter Name of employee "+(i+1)+" :");
        sc.nextLine();
        String name= sc.nextLine();
            System.out.println("Enter salary of employee "+(i+1)+" :");
        String salary=sc.nextLine();
            System.out.println("Enter employee increment salary "+(i+1)+" :");
        float incrementsalary = sc.nextFloat();
        ob[i]=new Employee(id,name,salary,incrementsalary);
            System.out.println("\nNumber of Objects : "+numberofobjects);

        }
        for(int i=0;i<n;i++)
        {
        ob[i].display();
        }
  }
}