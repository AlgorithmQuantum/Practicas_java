public class Jugador {

    private String nombre;
    private int numero;
    private int edad;


    public Jugador(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNumero() {
        return numero;
    }
    public int getEdad() {
        return edad;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Numero: " + numero);
    }

}