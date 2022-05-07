package clase;

public class Pacient {
    private boolean gravitate;
    private boolean confirmatMedic;

    public Pacient(boolean gravitate, boolean confirmatMedic) {
        this.gravitate = gravitate;
        this.confirmatMedic = confirmatMedic;
    }

    public boolean isGravitate() {
        return gravitate;
    }

    public boolean isConfirmatMedic() {
        return confirmatMedic;
    }
}
