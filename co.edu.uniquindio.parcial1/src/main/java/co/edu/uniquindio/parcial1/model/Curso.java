package co.edu.uniquindio.parcial1.model;

public class Curso {
    private String nombre;
    private int semestre;
    private String grupo;
    private int creditos;
    private String jornada;
    private Estudiante estudiante1;
    private Estudiante estudiante2;
    private Estudiante estudiante3;
    private Profesor profesor;

    /*Constructor*/

    public Curso(String nombre, int semestre, String grupo, int creditos, String jornada) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.grupo = grupo;
        this.creditos = creditos;
        this.jornada = jornada;
    }



    /*Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Estudiante getEstudiante1() {
        return estudiante1;
    }

    public void setEstudiante1(Estudiante estudiante1) {
        this.estudiante1 = estudiante1;
    }

    public Estudiante getEstudiante2() {
        return estudiante2;
    }

    public void setEstudiante2(Estudiante estudiante2) {
        this.estudiante2 = estudiante2;
    }

    public Estudiante getEstudiante3() {
        return estudiante3;
    }

    public void setEstudiante3(Estudiante estudiante3) {
        this.estudiante3 = estudiante3;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void mostrarInformacionEstudiantes() {
        String informacionEstudiante1 = getEstudiante1().obtenerInformacion();
        String informacionEstudiante2 = getEstudiante2().obtenerInformacion();
        String informacionEstudiante3 = getEstudiante3().obtenerInformacion();
        System.out.println("Información estudiante 1: " + informacionEstudiante1);
        System.out.println("Información estudiante 2: " + informacionEstudiante2);
        System.out.println("Información estudiante 3: " + informacionEstudiante3);
    }

    public double obtenerPromedioCurso() {
        double promedioEstudiante1 = 0.0;
        double promedioEstudiante2 = 0.0;
        double promedioEstudiante3 = 0.0;
        double promedioCurso= 0.0;
        promedioEstudiante1 = getEstudiante1().calcularPromedio();
        promedioEstudiante2 = getEstudiante2().calcularPromedio();
        promedioEstudiante3 = getEstudiante3().calcularPromedio();
        promedioCurso = (promedioEstudiante1 + promedioEstudiante2 + promedioEstudiante3) / 3;

        return  promedioCurso;
    }
}
