# Ejercicio 4: InscripcionCurso

## Explicación Lógica
1. **Propagación en la Pila (Stack Unwinding):** El método `verificarDisponibilidad()` lanza `CupoAgotadoException`, `inscribirEstudiante()` la propaga declarando `throws`, y finalmente el bloque `try-catch` del `main` la captura.
2. **Separación de Capas:** Mantiene limpia la lógica interna delegando el tratamiento visual del error a la capa cliente.