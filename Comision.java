public class Comision {
    private int capacidadMaxima;
    private int alumnosInscriptos;

    public Comision(int capacidadMaxima, int alumnosInscriptos) {
        this.capacidadMaxima = capacidadMaxima;
        this.alumnosInscriptos = alumnosInscriptos;
    }

    private void verificarDisponibilidad() throws CupoAgotadoException {
        if (alumnosInscriptos >= capacidadMaxima) {
            throw new CupoAgotadoException("Cupo agotado. Capacidad máxima: " + capacidadMaxima + " alumnos.");
        }
    }

    public void inscribirEstudiante() throws CupoAgotadoException {
        verificarDisponibilidad();
        alumnosInscriptos++;
        System.out.println("Estudiante inscripto exitosamente. Total inscriptos: " + alumnosInscriptos);
    }

    public static void main(String[] args) {
        Comision comision = new Comision(30, 30); // Comisión llena

        try {
            System.out.println("Intentando inscribir estudiante en comisión completa...");
            comision.inscribirEstudiante();
        } catch (CupoAgotadoException e) {
            System.err.println("Inscripción fallida: " + e.getMessage());
        }
    }
}