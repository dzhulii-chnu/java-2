public class Conus {
    private double h, r, l;
    public Conus(double h, double r){
        this.h = h;
        this.r = r;
        this.l = Math.sqrt(r * r + h * h);
    }
    public double getH(){return h;}
    public double getR(){return r;}
    public double getL(){ return l;}
    public double S(){ return Math.PI * r *l;}
    public double V(){return (1.0 / 3.0) * Math.PI * h * ( r * r) ;}

    @Override
    public String toString() {
        return "Hight = " + h + "; " + "Radius =" + r + ";" + " Len = " + l;
    }
}
