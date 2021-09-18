/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavideojuegogkj;

/**
 *
 * @author compu
 */
public class Videojuego {
    
    
    private String nombreJuego;
    private String nombreDispositivo;
    private double precio;
    
    public Videojuego(String nombreJuego1, String nombreDispositivo, double precio ){
        
        this.nombreDispositivo=nombreDispositivo;
        this.nombreJuego=nombreJuego1;
        this.precio=precio;
    
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
