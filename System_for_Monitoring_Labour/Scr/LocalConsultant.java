package Scr;
class LocalConsultant extends LocalResource implements Citizen, Consultant{
    private double skillPrice;
    private double taxRate;
    private double permitTax;
    private double pay;
    
    
    public LocalConsultant(String dob, String sector, double skillPrice, double taxRate)
    {
        super(dob,sector);
        String[] parts = dob.split("/");
        super.setDob(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]));
        this.taxRate = taxRate;
        this.skillPrice = skillPrice;
        this.permitTax = skillPrice * taxRate;
        
        
    }

    public double earnFromSkill()
    {
        return this.skillPrice;
    }
    
    public String getContact()
    {
        return "LocalConsultant#" + id;
    }
    
    public double getPay()
    {
        this.pay = permitTax - skillPrice;
        return pay * -1;
    }
    
    public String getTRN()
    {
        return TRN;
    }
}


