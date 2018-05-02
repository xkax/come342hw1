
public class Departman {
    
    private String depname;
    private int depid;

    public Departman(String depname, int depid) {
        this.depname = depname;
        this.depid = depid;
    }
    
    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public int getDepid() {
        return depid;
    }

  
    public void setDepid(int depid) {
        this.depid = depid;
    }
  
}
