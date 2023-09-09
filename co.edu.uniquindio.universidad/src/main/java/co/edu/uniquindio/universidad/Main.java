package co.edu.uniquindio.universidad;
import co.edu.uniquindio.universidad.model.Estudiante;
import co.edu.uniquindio.universidad.model.Profesor;
import co.edu.uniquindio.universidad.model.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso = inicializaDatosPrueba();

        /*Solicita datos de cada estudiante*/
        curso.mostrarInformacionEstudiantes();

        /*Solicitar promedio del curso*/
        double promedioCurso = curso.obtenerPromedioCurso();
        System.out.println("El promedio del curso es: "+ promedioCurso);
    }

    private static Curso inicializaDatosPrueba() {
        Estudiante estudiante1 = crearEstudiante("Jose", 17, "juan@mail.com", 3, 3, 3.5, 4.5);
        Estudiante estudiante2 = crearEstudiante("Maria", 15, "pepita@mail.com", 1, 2, 2.5, 4.5);
        Estudiante estudiante3 = crearEstudiante("Pepe", 20, "pepe@mail.com", 4, 4, 2.5, 4.5);
        Profesor profesor = crearProfesor("Jhon", 34, "jhon@uniquindio.ecu.co");
        Curso curso = new Curso("Programación 1", 2, "2N", 3, "Nocturna");
        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);
        curso.setProfesor(profesor);

        return curso;
    }

    private static Estudiante crearEstudiante(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setEdad(edad);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);

        return estudiante;
    }

    private static Profesor crearProfesor(String nombre, int edad, String correo) {
        Profesor profesor = new Profesor();
        profesor.setNombre(nombre);
        profesor.setEdad(edad);
        profesor.setCorreo(correo);

        return profesor;
    }

}