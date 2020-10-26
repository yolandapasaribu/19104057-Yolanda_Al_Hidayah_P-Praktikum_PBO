package com.yolanda.modul3.Latihan2;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    public String id;
    public String nama;
    public List<Planet> planets = new ArrayList<>();

    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getTotalMember() {
        return planets.size();
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    //cetak data
    public void getData() {
        System.out.println("Nama Solar System\t: " + getNama());
        System.out.println("ID Solar System\t\t: " + getId());
        System.out.println("Jumlah Planet\t\t: " + getTotalMember());
        System.out.println("List Planet\t: ");
        for (Planet planet : planets) {
            System.out.println("Nama\t: " + planet.getNamaPlanet());
            System.out.println("ID\t\t: " + planet.getIdPlanet());
            System.out.println("Urutan\t: " + planet.getUrutanPlanet());
            System.out.println();
        }
    }
}
