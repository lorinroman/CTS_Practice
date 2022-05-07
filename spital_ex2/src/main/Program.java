package main;

import clase.Factory;
import clase.PersonalSpital;
import clase.TipPersonal;

public class Program {
    public static void main(String[] args) {
        PersonalSpital brancardier = new Factory().getPersonalSpital(TipPersonal.BRANCARDIER,"Mihai");
        PersonalSpital medic = new Factory().getPersonalSpital(TipPersonal.MEDIC,"Andrei");
        PersonalSpital asistent = new Factory().getPersonalSpital(TipPersonal.ASISTENT,"Maria");

        System.out.println(brancardier.toString());
        System.out.println(medic.toString());
        System.out.println(asistent.toString());
    }
}
