package adapter_clase;

import farmacie.IMedicamentFarmacie;
import farmacie.MedicamentFarmacie;
import spital.IMedicament;

public class AdapterFarmacie extends MedicamentFarmacie implements IMedicament {


    @Override
    public void achizitioneazaMedicament() {
        super.cumparaMedicament();
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Reteta prezentata.");
    }
}
