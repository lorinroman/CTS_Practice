package clase;

public class Internare {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;
    private Pacient pacient;

    public Internare(Pacient pacient, int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
        this.pacient = pacient;
    }

    public int getNumarSalon() {
        return numarSalon;
    }

    public void setNumarSalon(int numarSalon) {
        this.numarSalon = numarSalon;
    }

    public int getNumarPat() {
        return numarPat;
    }

    public void setNumarPat(int numarPat) {
        this.numarPat = numarPat;
    }

    public int getNumarZileSpitalizare() {
        return numarZileSpitalizare;
    }

    public void setNumarZileSpitalizare(int numarZileSpitalizare) {
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public String toString() {
        return "Internare{" +
                "numarSalon=" + numarSalon +
                ", numarPat=" + numarPat +
                ", numarZileSpitalizare=" + numarZileSpitalizare +
                ", pacient=" + pacient +
                '}';
    }
}
