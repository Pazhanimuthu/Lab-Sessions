/* Author: @Pazhani Muthu
 Print The Table Using Thread Concept
*/
class Table{
    synchronized void printTable(int n){
        for(int i=1;i<=10;i++)
        System.out.println(n + "*" + i + "=" + i*n);
    }
}
class Mythread_1 extends Thread{
    Table table = new Table();
    int number;
    Mythread_1(Table table,int number){
        this.table=table;
        this.number=number;
    }
    public void run(){
        table.printTable(number);
    }
}
class Mythread_2 extends Thread{
    Table table = new Table();
    int number;
    Mythread_2(Table table,int number){
        this.table=table;
        this.number=number;
    }
    public void run(){
        table.printTable(number);
    }
}
public class ExampleThread{
    public static void main(String[]args){
        Table table=new Table();
        Mythread_1 thread_1 = new Mythread_1(table, 5);
        Mythread_2 thread_2 = new Mythread_2(table, 10);
        thread_1.start();
        thread_2.start();
    }
}