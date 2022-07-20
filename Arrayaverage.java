class Arrayaverage
{
           public static void main(String[]args){
            int []num={6,17,18,9,31};
            int sum=0;
            for(int i=0;i<num.length;i++){
                sum +=num[i];
            }
            int average=sum/num.length;
            System.out.println(average);
        }
}