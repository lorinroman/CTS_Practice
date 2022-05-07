package clase;

public class PacientBuilder implements Builder{

    private Pacient pacient;

    public PacientBuilder() {
        this.pacient = new Pacient("Nume",false,false,false,false);
    }

    @Override
    public Pacient build() {
        return this.pacient;
    }

    public PacientBuilder setNume(String nume){
        this.pacient.setNume(nume);
        return this;
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil){
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAreMicDejunInclus(boolean areMicDejunInclus){
        this.pacient.setAreMicDejunInclus(areMicDejunInclus);
        return this;
    }

    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera){
        this.pacient.setArePapuciDeCamera(arePapuciDeCamera);
        return this;
    }

    public PacientBuilder setAreHalatInterior(boolean areHalatInterior){
        this.pacient.setAreHalatInterior(areHalatInterior);
        return this;
    }
}
