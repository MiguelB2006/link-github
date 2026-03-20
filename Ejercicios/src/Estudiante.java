import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombreEstudiante;
    private List<Float> notas = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombreEstudiante = nombre;
    }

    public void agregarNotas(List<Float> nota) {
        notas.stream().forEach(notas::add);
    }

    public void calcularPromedio() {

        if (notas.size() < 2) {
            System.out.println("Error: debe haber al menos 2 notas");
            return;
        }

        if (notas.stream().anyMatch(notas -> !(notas > 0 && notas <= 5.0))) {
            System.out.println("Notas invalidas, tienen que ser mayor a 0 y menor a 5.0");
            return;
        }

        double promedio = notas.stream().mapToDouble(n -> n).average().orElse(0);

        if (promedio > 3.0) {
            System.out.printf("El estudiante: %s \n Promedio: %.1f \n Resultado: Aprobado", nombreEstudiante, promedio);
        } else {
            System.out.printf("El estudiante: %s \n Promedio: %.1f \n Resultado: Reprobado", nombreEstudiante,
                    promedio);
        }
    }

}
