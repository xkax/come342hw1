
public class Advertisement {
  
    private String advertitle;
    private int advertgun;
    private int advertsure;

    public Advertisement() {
       
    }

    
    
   public void setAdvertitle(String advertitle){
    
    this.advertitle=advertitle;
    
    }
   public String getAdvertitle(){
   return this.advertitle;
   }

   
    public int getAdvertgun() {
        return advertgun;
    }

   
    public void setAdvertgun(int advertgun) {
        
        if(advertgun<0){System.out.println("hatali giriş yaptiniz");}
        else{
        this.advertgun = advertgun;}
    }

  
    public int getAdvertsure() {
        
        return advertsure;
    }

    
    public void setAdvertsure(int advertsure) {
        
        if(advertsure<0){System.out.println("hatali giriş yaptiniz");}
        
        else{
            this.advertsure = advertsure;}
    }
}
