package clase;

public abstract class DecoratorAbstract implements IRezultat {

    private IRezultat rezultat;

    public DecoratorAbstract(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void printeazaRezultat() {
        rezultat.printeazaRezultat();
    }

    public abstract void afisareOnline();
}
