package main;

import clase.IReteta;
import clase.Reteta;


import java.util.HashMap;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        HashMap<String,Double> map = new HashMap<>();
        map.put("dexametazona",10.);
        map.put("triciclina",15.4);

        IReteta reteta = new Reteta(map);
        IReteta reteta_copy = reteta.copy();

        System.out.println(reteta);
        System.out.println(reteta_copy);
    }
}
