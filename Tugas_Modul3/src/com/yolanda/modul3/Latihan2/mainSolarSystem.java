package com.yolanda.modul3.Latihan2;

import java.util.ArrayList;
import java.util.List;

public class mainSolarSystem {
    public static void main(String[] args) {
        //objek planet
        List<Planet> planet = new ArrayList<>();

        Planet planet1 = new Planet(101,1,"Merkurius");
        Planet planet2 = new Planet(102,2,"Venus");
        Planet planet3 = new Planet(103,3,"Bumi");
        Planet planet4 = new Planet(104,4,"Mars");
        Planet planet5 = new Planet(105,5,"Jupiter");
        Planet planet6 = new Planet(106,6,"Saturnus");
        Planet planet7 = new Planet(107,7,"Uranus");
        Planet planet8 = new Planet(108, 8, "Neptunus");
        //objek solar system
        SolarSystem solarSystem= new SolarSystem("S01","Solar System");

        //tambah data
        planet.add(planet1);
        planet.add(planet2);
        planet.add(planet3);
        planet.add(planet4);
        planet.add(planet5);
        planet.add(planet6);
        planet.add(planet7);
        planet.add(planet8);

        solarSystem.setPlanets(planet);
        //output
        solarSystem.getData();
    }
}
