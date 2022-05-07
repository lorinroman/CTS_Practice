package main;

import clase.Decorator;
import clase.DecoratorAbstract;
import clase.IRezultat;
import clase.Rezultat;

public class Program {
    public static void main(String[] args) {
        IRezultat rezultat = new Rezultat("test covid pozitiv");
        rezultat.printeazaRezultat();

        DecoratorAbstract decorator = new Decorator(rezultat);
        decorator.afisareOnline();
    }
}
