public class Fertilizer {
    //Attributes
    //Amounts of Fertilizer in millilitres
    private double nitrate ;
    private double phosphate;
    private double potassium;
    private double iron;

    //Methods
    //Constructor
    public Fertilizer(double n, double p, double k, double fe){
        this.nitrate = n;
        this.phosphate = p;
        this.potassium = k;
        this.iron = fe;
    }

    //Getter & Setter for attributes
    //NITRATE
    public double getNitrate() {
        return nitrate;
    }
    public void setNitrate(double nitrate) {
        this.nitrate = nitrate;
    }

    //PHOSPHATE
    public double getPhosphate() {
        return phosphate;
    }
    public void setPhosphate(double phosphate) {
        this.phosphate = phosphate;
    }

    //POTASSIUM
    public double getPotassium() {
        return potassium;
    }
    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }

    //IRON
    public double getIron() {
        return iron;
    }
    public void setIron(double iron) {
        this.iron = iron;
    }
}
