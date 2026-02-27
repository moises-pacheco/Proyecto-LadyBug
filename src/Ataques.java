public class Ataques {

    //ATRIBUTOS

    private String nombre;
    private int potencia;
    private int usos;



    //CONSTRUCTORES

    public Ataques() {
        this.nombre = "Puñetazo";
        this.potencia = 10;
        this.usos = 5;

    }

    public Ataques(String nombre, int potencia, int usos) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.usos = usos;
    }


    //GETERS

    public String getNombre() {
        return this.nombre;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public int getUsos() {
        return this.usos;
    }


    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setUsos(int usos) {
        this.usos = usos;
    }




    //METODOS VARIOS
}
