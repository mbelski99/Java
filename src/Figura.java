
public abstract class Figura {
    private String rodzaj;
    public abstract double getPole();
    public abstract double getObw();
    protected setRodzaj(String rodzaj){
        this.rodzaj=rodzaj;
    }
    public String getRodzaj(){
        return rodzaj;
    }

}
