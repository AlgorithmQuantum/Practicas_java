public class Main {
    public static void main(String[] args) {

        Base base = new Base("Carlos", 20);
        Ala ala = new Ala("Miguel", 21);
        Poste poste = new Poste("Luis", 22);
        Suplente suplente = new Suplente("Jorge", 19);

        Equipo equipo = new Equipo(base, ala, poste, suplente);

        equipo.mostrarEquipo();
    }
}
