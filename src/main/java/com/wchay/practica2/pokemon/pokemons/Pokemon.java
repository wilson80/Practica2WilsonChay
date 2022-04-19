/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wchay.practica2.pokemon.pokemons;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonwil
 */
public class Pokemon extends JButton implements Runnable{
    private String nombre;
    private String noPokemon;
    protected static final String IMAGES_ROOT_PATH = "/com/wchay/practica2/pokemon/imagenesPokemon/";
    private static final String EXTENSION_IMAGEN=".png";
    private ImageIcon imagenPokemon; 
    private ImageIcon imagenPokemonIncognita; 
    private int width=180;
    private int height=180;
    private int nivelPokemon=1;
    private int tiempoVida;
    private int tiempoComer=10000;
    private int tiempoPasear=10000;
    private int cantidadComer=0;
     
    

    public Pokemon() {
        this.setSize(width, height);
        establecerImagenIncognita();
        
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            tiemposAcciones(tiempoComer);
        comer();
        tiemposAcciones(tiempoPasear);
        pasear();
            
        }
        
    }
    
    public void tiemposAcciones(int tiempos){
        try{
            Thread.sleep(tiempos);
        } catch (InterruptedException ex){
            Logger.getLogger(Pokemon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void comer(){
        JOptionPane.showMessageDialog(null, "Pokemon:" +getInfoMascota() + "Tiene hambre");
        
    }
    public void ensuciar(){
        JOptionPane.showMessageDialog(null, "Pokemon: " +getInfoMascota() + "necesita Ser Limpiado");
    }
    public void enfermarse(){
        JOptionPane.showMessageDialog(null, "Pokemon: " +getInfoMascota() + "Se ha Enfermado");
    }
    
    public void pasear(){
        JOptionPane.showMessageDialog(null, "Pokemon: " +getInfoMascota() + "Quiere ir a Pasear");
    }



    
    public String getInfoMascota(){
        return "No. "+noPokemon+ " "+nombre;
    }
    
    
    
    public void establecerImagen() {
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButtonActionPerformed();
            }
        });
                
    }
    
    public void establecerImagenIncognita() {
        ImageIcon imagenPokemonSinAjuste1 = new ImageIcon(getClass().getResource(IMAGES_ROOT_PATH+"0"+EXTENSION_IMAGEN));
        imagenPokemonIncognita = new ImageIcon(imagenPokemonSinAjuste1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        setIcon(imagenPokemonIncognita);
    }

        
    public void jButtonActionPerformed() {  
        setIcon(imagenPokemon);
    }
    
    public void setImagen(){
        ImageIcon imagenPokemonSinAjuste = new ImageIcon(getClass().getResource(IMAGES_ROOT_PATH+noPokemon+EXTENSION_IMAGEN));
        imagenPokemon = new ImageIcon(imagenPokemonSinAjuste.getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT));
    }

    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoPokemon(String noPokemon) {
        this.noPokemon = noPokemon;
    }

    public ImageIcon getImagenPokemon() {
        return imagenPokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setImagenPokemon(ImageIcon imagenPokemon) {
        this.imagenPokemon = imagenPokemon;
    }

    public void aumentarNinvelPokemon(int nivelPokemon) {
        this.nivelPokemon = nivelPokemon;
    }

    public String getNoPokemon() {
        return noPokemon;
    }

    public void setCantidadComer() {
        this.cantidadComer++;
    }
    
    
    
    

    
    
}
