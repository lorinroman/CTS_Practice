package clase;

public class Decorator extends DecoratorAbstract{


    public Decorator(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afisareOnline() {
        System.out.println("Rezultat afisat online:");
        super.printeazaRezultat();
    }
}
