package intitutoinnova;

import java.util.Scanner;

public class IntitutoInnova {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ControladorAlumno controlador = new ControladorAlumno();

        int opcion = 0;

        do {

            System.out.println("\n===== INSTITUTO INNOVA =====");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:

                        try {

                            System.out.print("Nombre: ");
                            String nombre = sc.nextLine();

                            System.out.print(
                                    "Tipo de documento (DNI/CRT): ");
                            String tipoDocumento = sc.nextLine();

                            System.out.print(
                                    "Número de documento: ");
                            String numeroDocumento = sc.nextLine();

                            System.out.print(
                                    "Nivel socioeconómico (A/B/C): ");
                            char nivel = sc.nextLine()
                                    .toUpperCase()
                                    .charAt(0);

                            System.out.print(
                                    "Tipo de beca "
                                    + "(Ninguna/Parcial/Total): ");
                            String tipoBeca = sc.nextLine();

                            Alumno alumno = new Alumno(
                                    nombre,
                                    tipoDocumento,
                                    numeroDocumento,
                                    nivel,
                                    tipoBeca
                            );

                            controlador.agregarAlumno(alumno);

                            System.out.println(
                                    "Alumno registrado correctamente.");

                        } catch (IllegalArgumentException e) {

                            System.out.println(
                                    "Error: " + e.getMessage());
                        }

                        break;

                    case 2:

                        System.out.println(
                                "\n===== ALUMNOS REGISTRADOS =====");

                        controlador.listarAlumnos();

                        break;

                    case 3:

                        System.out.println(
                                "Programa finalizado.");

                        break;

                    default:

                        System.out.println(
                                "Opción no válida.");
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Debe ingresar un número válido.");

                opcion = 0;
            }

        } while (opcion != 3);

        sc.close();
    }
}