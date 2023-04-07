package Scr;
class NineToFiver extends LocalResource {//should extend LocalResource

    private int starthour, endhour;
    private int numWorkDays;
    private double hourlyRate;
    private double taxRate;
    

    public NineToFiver(String dob, String sector,
    int starthour, int endhour, int numWorkDays, 
    double hourlyRate, double taxRate)
    {
        super(dob,sector);
        String[] parts = dob.split("/");
        super.setDob(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2]));
        this.starthour= starthour;
        this.endhour = endhour;
        this.numWorkDays=numWorkDays;
        this.hourlyRate=hourlyRate;

    }

    public double getPay()
    {

        return (1 - taxRate)*hourlyRate*(endhour-starthour)*numWorkDays ;
    }

    public String getContact()
    {
        //UNCOMMENT BELOW AFTER IMPLEMENTING LOCALRESOURCE
        return "Local Employee #"+getId();
    }
}