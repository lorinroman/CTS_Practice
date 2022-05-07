package clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta {

    private Map<String,Double> solutiiFolosite;

    public Reteta(Map<String, Double> solutiiFolosite) {
        this.solutiiFolosite = solutiiFolosite;
    }

    @Override
    public IReteta copy() throws CloneNotSupportedException {
        return (IReteta) this.clone();
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutiiFolosite=" + solutiiFolosite +
                '}';
    }
}
