package main;

import clase.Pacient;
import clase.Spital;
import clase.SpitalProxy;

public class Program {

    public static void main(String[] args) {
        Pacient pacient = new Pacient("Vlad", false);

        Spital spital = new Spital();
        spital.internarePacient(pacient);

        SpitalProxy spitalProxy = new SpitalProxy(spital);
        spitalProxy.internarePacient(pacient);
    }
}
