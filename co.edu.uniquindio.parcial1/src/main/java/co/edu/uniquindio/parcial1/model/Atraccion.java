package co.edu.uniquindio.parcial1.model;

public class Atraccion {
   private String nombre;
   private String horario;
   private String descripcion;
   private int rangoEdadMinima;
   private int rangoEdadMaxima;
   private String nivelPeligro;
   private double pesoMaximo;

   /*Constructor*/
   public Atraccion(){

   }
   public Atraccion(String nombre, String horario, String descripcion, int rangoEdadMinima, int rangoEdadMaxima, String nivelPeligro, double pesoMaximo) {
      this.nombre = nombre;
      this.horario = horario;
      this.descripcion = descripcion;
      this.rangoEdadMinima = rangoEdadMinima;
      this.rangoEdadMaxima = rangoEdadMaxima;
      this.nivelPeligro = nivelPeligro;
      this.pesoMaximo = pesoMaximo;
   }

   /*Getters and Setters*/

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getHorario() {
      return horario;
   }

   public void setHorario(String horario) {
      this.horario = horario;
   }

   public String getDescripcion() {
      return descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

   public int getRangoEdadMinima() {
      return rangoEdadMinima;
   }

   public void setRangoEdadMinima(int rangoEdadMinima) {
      this.rangoEdadMinima = rangoEdadMinima;
   }

   public int getRangoEdadMaxima() {
      return rangoEdadMaxima;
   }

   public void setRangoEdadMaxima(int rangoEdadMaxima) {
      this.rangoEdadMaxima = rangoEdadMaxima;
   }

   public String getNivelPeligro() {
      return nivelPeligro;
   }

   public void setNivelPeligro(String nivelPeligro) {
      this.nivelPeligro = nivelPeligro;
   }

   public double getPesoMaximo() {
      return pesoMaximo;
   }

   public void setPesoMaximo(double pesoMaximo) {
      this.pesoMaximo = pesoMaximo;
   }
}
