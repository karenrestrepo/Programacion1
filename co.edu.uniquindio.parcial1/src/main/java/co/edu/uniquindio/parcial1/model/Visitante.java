package co.edu.uniquindio.parcial1.model;

public class Visitante {
    private String nombres;
    private String apellidos;
    private int edad;
    private int numeroIdentificacion;
    private String tipovisitante;
    private String sexo;
    private int peso;

    /*Constructor*/

    public Visitante(){

    }
    public Visitante(String nombres, String apellidos, int edad, int numeroIdentificacion, String tipovisitante, String sexo, int peso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipovisitante = tipovisitante;
        this.sexo = sexo;
        this.peso = peso;
    }

    /*Getters and Setters*/

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTipovisitante() {
        return tipovisitante;
    }

    public void setTipovisitante(String tipovisitante) {
        this.tipovisitante = tipovisitante;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
