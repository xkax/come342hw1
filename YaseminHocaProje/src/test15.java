
import java.util.Scanner;


public class test15 {
    public static void main(String[]args){
    
    StaffMember newstaff=new StaffMember();
    Company     newcompanyy=new Company();
    
    
     Scanner kullanicii=new Scanner(System.in);
     
     System.out.println("personel id girin");
     int staffno=kullanicii.nextInt();
    
    System.out.println("personel maaşı giriniz");
    int staffmaas=kullanicii.nextInt();
    
    System.out.println("personel çalıştıgı gun sayisi girin");
    int staffisgunu=kullanicii.nextInt();
    
    System.out.println("sirketin yillik kar miktari");
    double ckar=kullanicii.nextDouble();
    
    int toplamm=staffmaas+staffisgunu;
    
    System.out.println("Yillik prim:"+(toplamm/ckar)*0.05);
    }
}
