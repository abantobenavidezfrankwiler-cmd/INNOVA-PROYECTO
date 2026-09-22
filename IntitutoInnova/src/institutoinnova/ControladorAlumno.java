package institutoinnova;

import java.util.ArrayList;

public class ControladorAlumno {

    private ArrayList<Alumno> listaAlumnos;

    public ControladorAlumno() {
        listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {

        for (Alumno a : listaAlumnos) {

            if (a.getNumeroDocumento()
                    .equals(alumno.getNumeroDocumento())) {

                throw new IllegalArgumentException(
                        "Ya existe un alumno con ese documento.");
            }
        }

        listaAlumnos.add(alumno);
    }

    public void listarAlumnos() {

        if (listaAlumnos.isEmpty()) {
            System.out.println("No existen alumnos registrados.");
            return;
        }

        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}