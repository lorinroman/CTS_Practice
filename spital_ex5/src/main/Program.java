package main;

import adapter_clase.AdapterFarmacie;
import spital.IMedicament;

public class Program {
    public static void achizitioneazaMedicament(IMedicament medicament){
        medicament.achizitioneazaMedicament();
    }

    public static void prezintaReteta(IMedicament medicament){
        medicament.prezintaReteta();
    }

    public static void main(String[] args) {
        AdapterFarmacie adapterFarmacie = new AdapterFarmacie();
        achizitioneazaMedicament(adapterFarmacie);
        adapterFarmacie.achizitioneazaMedicament();
    }
}
