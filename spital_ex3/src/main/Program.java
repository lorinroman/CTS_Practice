package main;

import clase.*;

public class Program {

    public static void main(String[] args) {
        PersonalSpitalFactory factory_medic = new PersonalMedicFactory();
        PersonalSpitalFactory factory_asistent = new PersonalAsistentFactory();
        PersonalSpitalFactory factory_brancardier = new PersonalBrancardierFactory();

        PersonalSpital medic = factory_medic.getPersonalSpital("Andrei");
        PersonalSpital asistent = factory_asistent.getPersonalSpital("Mihaela");
        PersonalSpital brancardier = factory_brancardier.getPersonalSpital("Alex");

        System.out.println(medic.toString());
        System.out.println(asistent.toString());
        System.out.println(brancardier.toString());
    }
}
