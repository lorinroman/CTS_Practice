package clase;

public class SpitalProxy implements ISpital{

    private Spital spital;

    public SpitalProxy(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void internarePacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            System.out.println("Pacientul " + pacient.getNume() + " a fost internat.");
        }else{
            System.out.println("Pacientul " + pacient.getNume() + " nu a fost internat.");
        }
    }
}
