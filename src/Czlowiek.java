import java.util.Objects;

public class Czlowiek {
    private String imie, nazwisko;
    private int wiek;
    //private String miejscUr="Lublin";
    private String miejscUr;

    {
        miejscUr="Lublin";
    }

    public Czlowiek(String imie, String nazwisko, int liczbalat){
        this.imie=imie;
        this.nazwisko=nazwisko;
        wiek=liczbalat;
    }
    public Czlowiek(String imie, String nazwisko, int liczbalat,String miejscUr){
        this.imie=imie;
        this.nazwisko=nazwisko;
        wiek=liczbalat;
        this.miejscUr=miejscUr;
    }

    public Czlowiek(String imie,String nazwisko){
    //    this.imie=imie;
    //    this.nazwisko=nazwisko;
    //    wiek=0;
        this(imie,nazwisko,0);
    }

    public int getWiek() {
        return wiek;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Czlowiek{" +
                "imie ='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", miejscUr='" + miejscUr + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)
            return true;

        if (this==null)
            return false;

        if (this.getClass()!=obj.getClass())
            return false;

        Czlowiek otherObject=(Czlowiek)obj;
        return this.getImie().equals(otherObject.getImie()) && this.getNazwisko().equals(otherObject.getNazwisko());

    }
    @Override
    public int hashCode(){
        return Objects.hash(imie,nazwisko,wiek);
    }
}
