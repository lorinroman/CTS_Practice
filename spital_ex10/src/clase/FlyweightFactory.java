package clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static final Map<Long, Pacient> pacientiMap = new HashMap<>();

    public static Pacient getPacient(long cnp, String nume, String telefon, String adresa) {
        Pacient pacient = pacientiMap.get(cnp);
        if(pacient == null){
            pacient = new Pacient(nume, telefon, adresa, cnp);
            pacientiMap.put(cnp,pacient);
            return pacient;
        }else{
            return pacient;
        }
    }
}
