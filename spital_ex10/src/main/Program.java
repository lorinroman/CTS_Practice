package main;

import clase.FlyweightFactory;
import clase.Internare;
import clase.Pacient;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Internare> internari = new ArrayList<>();

        internari.add(new Internare(
                FlyweightFactory.getPacient(123L, "a", "072", "str a"),
                1,
                1,
                1));

        internari.add(new Internare(
                FlyweightFactory.getPacient(567L, "a", "072", "str a"),
                1,
                1,
                1));

        internari.add(new Internare(
                FlyweightFactory.getPacient(123L, "a", "072", "str a"),
                1,
                1,
                1));

        internari.add(new Internare(
                FlyweightFactory.getPacient(123L, "a", "072", "str a"),
                1,
                1,
                1));

        System.out.printf("Au fost creati %d pacienti diferiti%n", Pacient.nrPacienti);
        System.out.printf("Au fost realizate %d internari diferite", internari.size());
    }
}
