package main;

import clase.Departament;
import clase.Sectie;
import clase.Subdepartament;

public class Program {

    public static void main(String[] args) {
        Sectie s1 = new Sectie("sectia 1");
        Sectie s2 = new Sectie("sectia 2");
        Subdepartament sd1 = new Subdepartament("subdepartament 1");
        Subdepartament sd2 = new Subdepartament("subdepartament 2");

        Departament departament = new Departament("Departament");
        try{
            departament.adaugaItem(s1);
            departament.adaugaItem(s2);
            departament.adaugaItem(sd1);
            departament.adaugaItem(sd2);

            departament.descriereItem();
        }catch(Exception ex){
            ex.printStackTrace();
        }


    }
}
