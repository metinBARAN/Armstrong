import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
       int number=inp.nextInt();
       int basNumber=0;
       int tempNumber=number;
       int basValue;
       int basPow;
       int result=0;

        tempNumber=number;
       while(tempNumber != 0){
           tempNumber /= 10;
           basNumber++;

       }
       tempNumber=number;
       while (tempNumber != 0){

           basValue =tempNumber%10;
           //1*1*1*1=1^4
           basPow=1;
           for (int i=1;i<=basNumber;i++){
               basPow *=basValue;
           }
           result+=basPow;
           tempNumber /= 10;

       }
     if(result==number){
         System.out.println(result+" bu bir armstrong sayisidir.");

     }else{
         System.out.println("Bu bir armstrong sayisi degildir.");
     }





    }
}
