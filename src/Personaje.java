import java.lang.reflect.Array;
import java.util.ArrayList;

public class Personaje {

    //ATRIBUTOS

    private String nombre;
    private int vida;
    private int fuerza;
    private int velocidad;
    private int defensa;
    private String[] inventario = new String[4];


    /*Lady Bugs poderes:
        -Ataque plano
        -Ataque con yoyo
        - Transformación den Dragon Bug
        - Uso de amuleto
    */

    //CONSTRUCTORES

    public Personaje() {
        this.nombre = "Lady Bug";
        this.vida = 100;
        this.fuerza = 10;
        this.velocidad = 15;
        this.defensa = 10;
        this.inventario = new String[] {"Ataque plano", "Ataque con yoyo", "Transformación de Dragon Bug", "Uso de amuleto"};

    }

    public Personaje (String nombre, int vida, int fuerza, int velocidad, int defensa) {
        this.nombre = "Lady Bug";
        this.vida = vida;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.defensa = defensa;

    }



    //GETERS

    public String getNombre() {
        return this.nombre;
    }

    public int getVida() {
        return this.vida;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public int getVelocidad () {
        return this.velocidad;
    }

    public int getDefensa() {
        return this.defensa;
    }


    //SETERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }




    //METODOS VARIOS



}
