/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author jasb
 */
public class Cotxe {

    private final Rodes rodes;
    private final motor motor;
    private final Xasis xasis;
    private Escuderia escuderia;
    private Pilot pilot;
    private double tempsCarrera;
    
    public Cotxe(Escuderia escuderia, Rodes rodes, motor motor, Xasis xasis) {
        this.escuderia = escuderia;
        this.rodes = rodes;
        this.motor = motor;
        this.xasis = xasis;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public double getTempsCarrera() {
        return tempsCarrera;
    }

    public void setTempsCarrera(double tempsCarrera) {
        this.tempsCarrera = tempsCarrera;
    }

    public Rodes getRodes() {
        return rodes;
    }
    

    public void ferEixida() {

        int n = (int) (Math.random() * 3) + 1;
        switch (n) {
            case 1:
                System.out.println(this.pilot.getNom() + " ha fet una eixida FANTÀSTICA i adelanta al cotxe de davant");
                break;
            case 2:
                System.out.println(this.pilot.getNom() + " ha fet una eixida LENTA i ha sigut adelantat");
                break;
            default:
                System.out.println(this.pilot.getNom() + " ha fet l'eixida MANTENINT la seua posició");
                break;

        }
    }

    public void arrancarMotors() {
        System.out.println(pilot + " ha arrancat el seu motor " + escuderia + " montat amb rodes " + rodes);
        tempsCarrera = 0.0;
    }

    public void accident() {
        System.out.println(pilot + " ha tingut un accident i ha d'abandonar la carrera. ");
        tempsCarrera = 0.0;
    }

}
