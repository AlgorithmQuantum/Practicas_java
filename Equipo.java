public class Equipo {

    private Base base;
    private Ala ala;
    private Poste poste;
    private Suplente suplente;

    public Equipo(Base base, Ala ala, Poste poste, Suplente suplente) {
        this.base = base;
        this.ala = ala;
        this.poste = poste;
        this.suplente = suplente;
    }

    public void mostrarEquipo() {
        System.out.println("\n--- Datos del Equipo ---");
        System.out.print("Base: "); base.mostrarDatos();
        System.out.print("Ala: "); ala.mostrarDatos();
        System.out.print("Poste: "); poste.mostrarDatos();
        System.out.print("Suplente: "); suplente.mostrarDatos();
    }
}
