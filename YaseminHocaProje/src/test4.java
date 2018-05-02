
import java.util.Scanner;


public class test4 {
   public static void main(String[] args){
   
   Campaign campaign=new Campaign();
   Client client1=new Client();
   
   Scanner kullaniciii=new Scanner(System.in);
   
   System.out.println("şirket ödeme tarihini gün olarak giriniz");
   int paydate=kullaniciii.nextInt();
   
   System.out.println("şirket ödeme tutarini giriniz");
   int companypay=kullaniciii.nextInt();
   
   
   
   int campaignstartdate=10;
   int campaignfinishdate=20;
   
   
   if( campaignstartdate<=paydate  && paydate<=campaignfinishdate){
   
           System.out.println("Ödeme bilgisi indirimli şelilde kaydedildi" +(companypay/2));
   
   
   }
   
  
   
            }
   
   
   
   
   }

