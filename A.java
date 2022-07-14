class A
{
    public static void main(String[]args){
    int k[]={10,20,30,333,40,70,7,99};

    int min = k[0];
    int max = k[0];
    for (int i=0;i<k.length;i++){
        if(k[i] < min){
            min = k[i];
        }
        if(k[i] > max){
           max = k[i];
        }
    }
    System.out.println("Minimum value is"+ min);
    System.out.println("Maximum value is"+ max);
    }
}


