public class Kolo extends Figura{
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double getPole() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double getObw() {
        return 2*Math.PI*r;
    }
}
