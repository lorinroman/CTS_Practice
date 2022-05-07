package main;

import clase.Pacient;
import clase.PacientBuilder;

public class Program {

    public static void main(String[] args) {
        Pacient p1 = new PacientBuilder().setNume("Andrei").setAreHalatInterior(true).setAreMicDejunInclus(true).build();
        System.out.println(p1);
    }
}
