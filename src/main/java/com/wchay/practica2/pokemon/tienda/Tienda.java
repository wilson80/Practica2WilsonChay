
package com.wchay.practica2.pokemon.tienda;

import com.wchay.practica2.pokemon.pokemons.Blastoise;
import com.wchay.practica2.pokemon.pokemons.Bulbasaur;
import com.wchay.practica2.pokemon.pokemons.Caterpie;
import com.wchay.practica2.pokemon.pokemons.Charizard;
import com.wchay.practica2.pokemon.pokemons.Charmander;
import com.wchay.practica2.pokemon.pokemons.Charmeleon;
import com.wchay.practica2.pokemon.pokemons.Ivysaur;
import com.wchay.practica2.pokemon.pokemons.Pokemon;
import com.wchay.practica2.pokemon.pokemons.Squirtle;
import com.wchay.practica2.pokemon.pokemons.Venusaur;
import com.wchay.practica2.pokemon.pokemons.Wartortle;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jonwil
 */
public class Tienda {
    
    private int precioMascota=50;
    private Pokemon[] pokemonsA_BAtalla;
    private Pokemon[] pokemonsA_BAtallaPareja;
    private Pokemon[] cartasBAtalla;
    
    private int numeroPokemon;
    private int cantidadParejas=5;
    private int cantidadCartas=cantidadParejas*2;
    private int [] numerosGenerados = new int[cantidadParejas+1];
    private int contador=0;
    private JFrame frameBatalla;
    private JPanel panelBatalla;
    
    
    public Tienda() {
        pokemonsA_BAtalla = new Pokemon[11];
        pokemonsA_BAtallaPareja = new Pokemon[152];
        cartasBAtalla = new Pokemon[cantidadCartas+1];
        inicializarPokemonsBatalla();
        frameBatalla = new JFrame();
        panelBatalla = new JPanel();
    }

    
    
    
    public void inicializarPokemonsBatalla() {
        pokemonsA_BAtalla[1]= new Bulbasaur();
        pokemonsA_BAtalla[2]= new Ivysaur();
        pokemonsA_BAtalla[3]= new Venusaur();
        pokemonsA_BAtalla[4]= new Charmander();
        pokemonsA_BAtalla[5]= new Charmeleon();
        pokemonsA_BAtalla[6]= new Charizard();
        pokemonsA_BAtalla[7]= new Squirtle();
        pokemonsA_BAtalla[8]= new Wartortle();
        pokemonsA_BAtalla[9]= new Blastoise();
        pokemonsA_BAtalla[10]= new Caterpie();
        pokemonsA_BAtallaPareja[1]= new Bulbasaur();
        pokemonsA_BAtallaPareja[2]= new Ivysaur();
        pokemonsA_BAtallaPareja[3]= new Venusaur();
        pokemonsA_BAtallaPareja[4]= new Charmander();
        pokemonsA_BAtallaPareja[5]= new Charmeleon();
        pokemonsA_BAtallaPareja[6]= new Charizard();
        pokemonsA_BAtallaPareja[7]= new Squirtle();
        pokemonsA_BAtallaPareja[8]= new Wartortle();
        pokemonsA_BAtallaPareja[9]= new Blastoise();
        pokemonsA_BAtallaPareja[10]= new Caterpie();
        
        
    }
    

    
    public void llenarJuegoBatalla() {                  //llena el arreglo Cartas Batalla de Pokemons
        for (int i = 1; i <= cantidadParejas; i++) {
            cartasBAtalla[i] = crearCartasBatalla();    
            int ii=i+cantidadParejas;  
            cartasBAtalla[ii]=pokemonsA_BAtallaPareja[numeroPokemon];
        }
        revolverCartas();
        
    }
   
    public void generarNumeroPokemon(){
        Random random = new Random();
        numeroPokemon = random.nextInt(10)+1;
        System.out.println(numeroPokemon);
    }
    
    public Pokemon generarMascotaPokemon(){
        return crearCartasBatalla();
    }
    
    public Pokemon crearCartasBatalla() {
        contador++;
        boolean repetido = false;
        do{repetido=false;                  //verifica que no se generen cartasRepetidas 
            generarNumeroPokemon();
            for (int i = 1; i <numerosGenerados.length; i++){
                if(numeroPokemon==numerosGenerados[i]){
                    repetido = true;
                }
            }
        }while(repetido==true);
            numerosGenerados[contador]=numeroPokemon;
            pokemonsA_BAtalla[numeroPokemon].setImagen();
        return pokemonsA_BAtalla[numeroPokemon];
    }
    
    
    public void revolverCartas(){
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            int pokemon_Cambiar=random.nextInt(cantidadCartas)+1;
            int posicionA_Cambiar=random.nextInt(cantidadCartas)+1;
            Pokemon poke1=cartasBAtalla[pokemon_Cambiar];
                Pokemon poke2=cartasBAtalla[posicionA_Cambiar];
            cartasBAtalla[posicionA_Cambiar]=poke1;
            cartasBAtalla[pokemon_Cambiar]=poke2;
        }
        
    }
    

    public Pokemon[] getCartasBAtalla() {
        return cartasBAtalla;
    }

    public int getCantidadCartas() {
        return cantidadCartas;
    }

    public Pokemon[] getPokemonsA_BAtalla() {
        return pokemonsA_BAtalla;
    }
    
    
    
    
    
}
