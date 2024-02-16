/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author anglloiba2
 */
public class Circuit {

    String nombre;
    String pais;
    String ciutat;
    double longuitut;
    int numVoltes;
    int record;

    public Circuit(String nombre, String pais, String ciutat, double longuitut, int numVoltes) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciutat = ciutat;
        this.longuitut = longuitut;
        this.numVoltes = numVoltes;
        this.record = record;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getCiutat() {
        return ciutat;
    }

    public double getLonguitut() {
        return longuitut;
    }

    public int getNumVoltes() {
        return numVoltes;
    }

    public int getRecord() {
        return record;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public void setLonguitut(double longuitut) {
        this.longuitut = longuitut;
    }

    public void setNumVoltes(int numVoltes) {
        this.numVoltes = numVoltes;
    }

    public void setRecord(int record) {
        this.record = record;
    }
    

}
