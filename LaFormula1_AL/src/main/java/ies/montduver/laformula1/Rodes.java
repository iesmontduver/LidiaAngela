/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.montduver.laformula1;

/**
 *
 * @author jasb
 */
public class Rodes {

    private int numero;
    private String marca;
    private int tipo_neumatic; //1-Blando, 2-Medio , 3- Duro, 4- Lluvia, 5-Lluvia extrema

    public Rodes(String marca) {
        this.marca = marca;
        this.numero = 4;
        this.tipo_neumatic = (int) (Math.random() * 4) + 1;;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   
    public String getTipo_neumatic() {
        
        String tiporodes; 
        
        switch (tipo_neumatic) {
            case 1: 
                tiporodes = "BLANES"; 
                break; 
            case 2: 
                tiporodes = "MITGES";
                break; 
            case 3: 
                tiporodes = "DURES"; 
                break;
            case 4: 
                tiporodes = "DE PUTJA";
                break;
            case 5: 
                tiporodes = "DE PUTJA EXTREMA";
                break;
            default: 
                tiporodes = "DESCONEGUDES";
                
        }

        return tiporodes;
    }

    public void setTipo_neumatic(int tipo_neumatic) {
        this.tipo_neumatic = tipo_neumatic;
    }
}
