package intitutoinnova;

import java.util.ArrayList;
import java.util.List;

public class ControladorAlumno {

    private List<Alumno> listaAlumnos;

    public ControladorAlumno() {
        listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
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