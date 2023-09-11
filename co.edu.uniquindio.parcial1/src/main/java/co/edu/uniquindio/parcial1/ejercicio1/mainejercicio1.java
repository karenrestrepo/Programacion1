package co.edu.uniquindio.parcial1.ejercicio1;
import co.edu.uniquindio.parcial1.model.Curso;
import co.edu.uniquindio.parcial1.model.Estudiante;
import co.edu.uniquindio.parcial1.model.Profesor;

public class mainejercicio1 {
    public static void main(String[] args) {
        Curso curso = inicializarDatosPrueba();

        /*Solicitar información estudiantes*/
        curso.mostrarInformacionEstudiantes();

        /*Obtener promedio curso*/
        double promedioCurso = curso.obtenerPromedioCurso();
        System.out.println("El promedio del curso es: " + promedioCurso);
    }

    private static Curso inicializarDatosPrueba() {
        Estudiante estudiante1 = crearEstudiante("Jose", 17, "juan@mail.com", 3, 3, 3.5, 4.5);
        Estudiante estudiante2 = crearEstudiante("Maria", 15, "pepita@mail.com", 1, 2, 2.5, 4.5);
        Estudiante estudiante3 = crearEstudiante("Pepe", 20, "pep@mail.com", 4, 4, 2.5, 4.5);
        Profesor profesor = new Profesor("Jhon", 34, "jhon@uniquindio.edu.co");
        Curso curso = new Curso("Programacion 1", 2, "2N", 3, "Nocturna");
        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);
        return curso;
    }

    private static Estudiante crearEstudiante(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3){
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
}
