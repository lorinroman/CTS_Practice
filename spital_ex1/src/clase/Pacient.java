package clase;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatInterior;

    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciDeCamera, boolean areHalatInterior) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalatInterior = areHalatInterior;
    }


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    public void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    public void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }


    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejunInclus=" + areMicDejunInclus +
                ", arePapuciDeCamera=" + arePapuciDeCamera +
                ", areHalatInterior=" + areHalatInterior +
                '}';
    }
}
