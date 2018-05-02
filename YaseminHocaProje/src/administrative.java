
public class administrative extends StaffMember {
    
   
   
    public administrative(int staffno, String staffname, String mailaddres) {
        super(staffno, staffname, mailaddres);
        
    }

    @Override
    public void record_information() {
        super.record_information(); 
        System.out.println("Kayitlar hala sürüyor");
    }

    
    }
    

