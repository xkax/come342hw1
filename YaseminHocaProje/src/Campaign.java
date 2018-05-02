
public class Campaign {
   private String title;
   private int campaignstartdate;
   private int campaignfinishdate;
  
    public Campaign() {
       
    }
   
   
   
   
   
   
   public void setTitle(String title){
     
       
       this.title=title;
  }
   public String getTitle(){
   
   return this.title;
   
   }

    
    public int getCampaignstartdate() {
        return campaignstartdate;
    }

    
    public void setCampaignstartdate(int campaignstartdate) {
        this.campaignstartdate = campaignstartdate;
    }

   
    public int getCampaignfinishdate() {
        return campaignfinishdate;
    }

    
    public void setCampaignfinishdate(int campaignfinishdate) {
        this.campaignfinishdate = campaignfinishdate;
    }
}
