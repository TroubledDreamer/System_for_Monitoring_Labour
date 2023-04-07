package Scr;
class LocalResource extends Person implements Citizen{
    
    private String dob;
    private String sector;
    protected int id;
    private int sumer = 100000000;
    protected String TRN;
    private static int m;
    
    
    LocalResource(String dob, String sector){
        this.dob = dob;

        this.sector = sector;
        id=m;
        m++;
      
        
    }
    
    private int idUp(){
        id = m;
        m++;
        return id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public String getSector()
    {
        return this.sector;
    }
    
    public String getTRN(){
        this.TRN = Integer.toString(this.sumer + this.id);
        return TRN;
    }
    
    public String getContact()
    {
        return "Reg. Expatriate#"+id;
    }
    
    public double getPay()
    {
        return 22;
    }
    
}