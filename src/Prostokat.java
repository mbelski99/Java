public class Prostokat extends Figura{
    private double szer,wys;

    public Prostokat(double szer,double wys) {
        super();
        this.szer = szer;
        this.wys = wys;
    }
    @Override
    public double getPole() {
        return szer*wys;
    }
    @Override
    public double getObw() {
        return wys+wys+szer+szer;
    }
}
