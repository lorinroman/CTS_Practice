package main;

import clase.Facade;
import clase.Pacient;
import clase.Salon;

public class Program {
    public static void main(String[] args) {
        Pacient pacient = new Pacient(false,true);
        int[] paturi = new int[]{0,0,0,1,0};
        Salon salon = new Salon(paturi);

        Facade facade = new Facade();
        facade.verificaInternarePacient(pacient,salon);
    }
}
