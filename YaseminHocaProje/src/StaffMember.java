
public class StaffMember {
    private int staffno;
    private String staffname;
    private String mailaddres;
    private int staffmaas;
    private int staffisgunu;

    public StaffMember(int staffno, String staffname, String mailaddres) {
        this.staffno = staffno;
        this.staffname = staffname;
        this.mailaddres = mailaddres;
    }

    StaffMember() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    public int getStaffno() {
        return staffno;
    }

   
    public void setStaffno(int staffno) {
        this.staffno = staffno;
    }

    
    public String getStaffname() {
        return staffname;
    }

  
    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

  
    public String getMailaddres() {
        return mailaddres;
    }

   
    public void setMailaddres(String mailaddres) {
        this.mailaddres = mailaddres;
    }
  
   
    public int getStaffmaas() {
        return staffmaas;
    }

    public void setStaffmaas(int staffmaas) {
        this.staffmaas = staffmaas;
    }

   
    public int getStaffisgunu() {
        return staffisgunu;
    }

 
    public void setStaffisgunu(int staffisgunu) {
        this.staffisgunu = staffisgunu;
    }

    public void record_information(){
   System.out.println("Çalışan bilgileri");
   System.out.println("ad"+staffname);
   System.out.println("staffmail"+mailaddres);
   }
   

}
