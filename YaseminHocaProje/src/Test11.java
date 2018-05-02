
import java.util.Scanner;


public class Test11 {
    public static void main(String[] args){
       
        Advertisement advert1=new Advertisement();
        
        Client client1=new Client();
        
        Scanner kullanici=new Scanner(System.in);
        
        
        System.out.println("Şirket ismini giriniz");
        String companyName=kullanici.nextLine();
        
        
        System.out.println("Şirket adresi giriniz");
        String companyAdress=kullanici.nextLine();
        
        System.out.println("Şirket mail Adress");
        String companyEmail=kullanici.nextLine();
        
        
        System.out.println("reklam gunun giriniz");
        int advertgun=kullanici.nextInt();
       
        
        System.out.println("reklam suresini giriniz");
        int advertsure=kullanici.nextInt();
        
        int toplam=advertgun+advertsure;
        
        
        do{
             toplam=toplam-30; }
                
                while(toplam>=30);{
          
           System.out.println("yayın zamani:"+toplam);
    }
        
           System.out.println("yayın zamani:"+toplam);
        
        
        
  }
}
    

