public class Participante {

    int victorias;
    int derrotas;
    String nombre;

    public Participante(int victorias, int derrotas, String nombre) {
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.nombre = nombre;
    }

    public Participante() {
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String datosParticipante() {
        String dumpdatos = "El participante " + getNombre() + " lleva " + getVictorias() + " victorias y " + getDerrotas() + " derrotas";
        System.out.println(dumpdatos);
        return (dumpdatos);
    }
}

