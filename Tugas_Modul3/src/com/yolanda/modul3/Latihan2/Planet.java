package com.yolanda.modul3.Latihan2;

public class Planet {
    public int idPlanet;
    public int urutanPlanet;
    public String namaPlanet;

    public Planet(int idPlanet, int urutanPlanet, String namaPlanet) {
        this.idPlanet = idPlanet;
        this.urutanPlanet = urutanPlanet;
        this.namaPlanet = namaPlanet;
    }

    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    public void setUrutanPlanet(int urutanPlanet) {
        this.urutanPlanet = urutanPlanet;
    }

    public void setNamaPlanet(String namaPlanet) {
        this.namaPlanet = namaPlanet;
    }

    public int getIdPlanet() {
        return idPlanet;
    }

    public int getUrutanPlanet() {
        return urutanPlanet;
    }

    public String getNamaPlanet() {
        return namaPlanet;
    }
}
