/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wchay.practica2.pokemon.backend.jugador;

import com.wchay.practica2.pokemon.pokemons.Pokemon;

/**
 *
 * @author Jonwil
 */
public class Jugador {
    private int monedasInciales=150;
    private Pokemon [] misMascotas;
    private int mascotasCompradas=0;

    public Jugador() {
        misMascotas = new Pokemon[11];
        
    }

    
    
    public Pokemon[] getMisMascotas() {
        return misMascotas;
    }

    public void setMisMascotas(Pokemon[] misMascotas) {
        this.misMascotas = misMascotas;
    }
    

    public int getMonedasInciales() {
        return monedasInciales;
    }
    
    public void comprarMascotas(Pokemon pokemon, int posicionInsertar){
        monedasInciales-=50;
        misMascotas[posicionInsertar] = pokemon;
        
    }

    
    public int getMascotasCompradas() {
        return mascotasCompradas;
    }

    public void setMascotasCompradas() {
        this.mascotasCompradas++;
    }
    
    
    
}
