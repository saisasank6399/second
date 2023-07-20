class happy{
  public static void main(String args []){
   int num=91;
   while(num>9){
     int sum=0;
   while(num>0){
    int d=num%10;
       sum=sum+d*d;
       num=num/10;
     }
    num=sum;
     }
    if(num==1){
     System.out.println("happy number");
        }
}
}