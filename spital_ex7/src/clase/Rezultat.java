package clase;

public class Rezultat implements IRezultat {
    private String text;

    public Rezultat(String text) {
        this.text = text;
    }


    @Override
    public void printeazaRezultat() {
        System.out.println("Rezultat: " + text);
    }
}
