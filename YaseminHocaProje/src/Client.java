
public class Client {
    
    private String companyName;
    
    private String companyAdress;
    
    private String companyEmail;
    
    private int companypay;
    
    private int paydate;

    public Client() {
      
    }

   public void setCompanyName(String companyName){
    
             this.companyName=companyName; }
    
    public String getCompanyName(){
           return this.companyName;
        }

   
    public String getCompanyAdress() {
        return companyAdress;
    }

    
    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

   
    public String getCompanyEmail() {
        return companyEmail;
    }

  
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

   
    public int getCompanypay() {
        return companypay;
    }

    
    public void setCompanypay(int companypay) {
        this.companypay = companypay;
    }

    /**
     * @return the paydate
     */
    public int getPaydate() {
        return paydate;
    }

    /**
     * @param paydate the paydate to set
     */
    public void setPaydate(int paydate) {
        this.paydate = paydate;
    }
 }


