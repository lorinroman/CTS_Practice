package clase;

public class Pacient {
    private String nume;
    private String telefon;
    private String adresa;
    private long cnp;
    public static int nrPacienti = 0;

    public Pacient(String nume, String telefon, String adresa, long cnp) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
        this.cnp = cnp;
        nrPacienti++;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adresa='" + adresa + '\'' +
                ", cnp=" + cnp +
                '}';
    }
}
