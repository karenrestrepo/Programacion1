package co.edu.uniquindio.parcial1.ejercicio2;

import co.edu.uniquindio.parcial1.model.Atraccion;
import co.edu.uniquindio.parcial1.model.Visitante;

public class mainejercicio2 {
    public static void main(String[] args) {
        crearVisitanteAtraccion();


    }
    private static void crearVisitanteAtraccion() {
        Visitante visitante1 = new Visitante();
        visitante1.setNombres("Karen Vanessa");
        visitante1.setApellidos("Restrepo Morales");
        visitante1.setEdad(20);
        visitante1.setNumeroIdentificacion(1005134065);
        visitante1.setTipovisitante("Adulto");
        visitante1.setSexo("Femenino");
        visitante1.setPeso(53);

        Visitante visitante2 = new Visitante();
        visitante2.setNombres("Juan Esteban");
        visitante2.setApellidos("Moreno Garcia");
        visitante2.setEdad(19);
        visitante2.setNumeroIdentificacion(1005144065);
        visitante2.setTipovisitante("Adulto");
        visitante2.setSexo("Masculino");
        visitante2.setPeso(63);

        Visitante visitante3 = new Visitante();
        visitante3.setNombres("Steven");
        visitante3.setApellidos("Severino Garcia");
        visitante3.setEdad(17);
        visitante3.setNumeroIdentificacion(1005112365);
        visitante3.setTipovisitante("Adolescente");
        visitante3.setSexo("Masculino");
        visitante3.setPeso(56);

        Atraccion atraccion1 = new Atraccion();
        atraccion1.setNombre("Montaña Rusa");
        atraccion1.setHorario("9:00 am a 5:00 pm");
        atraccion1.setDescripcion("Recorre una distancia de 1,5 km");
        atraccion1.setRangoEdadMinima(12);
        atraccion1.setRangoEdadMaxima(50);
        atraccion1.setNivelPeligro("Medio");
        atraccion1.setPesoMaximo(800);

        Atraccion atraccion2 = new Atraccion();
        atraccion2.setNombre("Cumbre");
        atraccion2.setHorario("9:00 am a 5:00 pm");
        atraccion2.setDescripcion("En su punto máximo está a 30m");
        atraccion2.setRangoEdadMinima(15);
        atraccion2.setRangoEdadMaxima(45);
        atraccion2.setNivelPeligro("Alto");
        atraccion2.setPesoMaximo(800);

        Atraccion atraccion3 = new Atraccion();
        atraccion3.setNombre("Carrusel");
        atraccion3.setHorario("9:00 am a 5:00 pm");
        atraccion3.setDescripcion("Para toda la familia");
        atraccion3.setRangoEdadMinima(1);
        atraccion3.setRangoEdadMaxima(70);
        atraccion3.setNivelPeligro("Bajo");
        atraccion3.setPesoMaximo(500);

        /*Verificar a que atracciones puede subir*/
        verificarEdadSubir(visitante1, visitante2, visitante3, atraccion1, atraccion2, atraccion3);
        /*Obtener atracciones para niños y su información*/
        obtenerAtraccionesniños(atraccion1, atraccion2, atraccion3);
        /*Obtener visitante adulto con mayor edad*/
        ObtenerMayorAdulto(visitante1, visitante2, visitante3);
        /*Obtener visitante adolescente con mayor edad*/
        ObtenerMayorAdolescente(visitante1, visitante2, visitante3);
        /*Obtener visitante niño con mayor edad*/
        ObtenerMayorNiño(visitante1, visitante2, visitante3);
        /*Obtener visitante adolescente con menor edad*/
        ObtenerMenorAdolescente(visitante1, visitante2, visitante3);
    }


    private static void verificarEdadSubir(Visitante visitante1, Visitante visitante2, Visitante visitante3, Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccion3) {
        String mensajeVisitante1 = "";
        String mensajeVisitante2 = "";
        String mensajeVisitante3 = "";
        if (visitante1.getEdad() >= atraccion1.getRangoEdadMinima() && visitante1.getEdad() <= atraccion1.getRangoEdadMaxima()) {
            mensajeVisitante1 = atraccion1.getNombre();
        }
        if (visitante1.getEdad() >= atraccion2.getRangoEdadMinima() && visitante1.getEdad() <= atraccion2.getRangoEdadMaxima()) {
            mensajeVisitante1 += ", " + atraccion2.getNombre();
        }
        if (visitante1.getEdad() >= atraccion3.getRangoEdadMinima() && visitante1.getEdad() <= atraccion3.getRangoEdadMaxima()) {
            mensajeVisitante1 += ", " + atraccion3.getNombre();
        }
        System.out.println("El visitante " + visitante1.getNombres() + " puede subir a estas atracciones: " +"\n" + mensajeVisitante1);
        if (visitante2.getEdad() >= atraccion1.getRangoEdadMinima() && visitante2.getEdad() <= atraccion1.getRangoEdadMaxima()) {
            mensajeVisitante2 = atraccion1.getNombre();
        }
        if (visitante2.getEdad() >= atraccion2.getRangoEdadMinima() && visitante2.getEdad() <= atraccion2.getRangoEdadMaxima()) {
            mensajeVisitante2 += ", " + atraccion2.getNombre();
        }
        if (visitante2.getEdad() >= atraccion3.getRangoEdadMinima() && visitante2.getEdad() <= atraccion3.getRangoEdadMaxima()) {
            mensajeVisitante2 += ", " + atraccion3.getNombre();
        }
        System.out.println("El visitante " + visitante2.getNombres() + " puede subir a estas atracciones: " +"\n" + mensajeVisitante2);
        if (visitante3.getEdad() >= atraccion1.getRangoEdadMinima() && visitante3.getEdad() <= atraccion1.getRangoEdadMaxima()) {
            mensajeVisitante3 = atraccion1.getNombre();
        }
        if (visitante3.getEdad() >= atraccion2.getRangoEdadMinima() && visitante3.getEdad() <= atraccion2.getRangoEdadMaxima()) {
            mensajeVisitante3 += ", " + atraccion2.getNombre();
        }
        if (visitante3.getEdad() >= atraccion3.getRangoEdadMinima() && visitante3.getEdad() <= atraccion3.getRangoEdadMaxima()) {
            mensajeVisitante3 += ", " + atraccion3.getNombre();
        }
        System.out.println("El visitante " + visitante3.getNombres() + " puede subir a estas atracciones: " +"\n" + mensajeVisitante3);
    }

    private static void obtenerAtraccionesniños(Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccion3) {
        double atraccionesNiños = 0.0;
        String informacionAtracciones = "";
        if (atraccion1.getRangoEdadMinima() <= 10) {
            atraccionesNiños++;
            informacionAtracciones = informacionAtracciones +
                    "Nombre: " + atraccion1.getNombre() + "\n" +
                    "Horario de operación: " + atraccion1.getHorario() + "\n" +
                    "Descripción: " + atraccion1.getDescripcion() + "\n" +
                    "Rango de edad: " + atraccion1.getRangoEdadMinima() + "-" + atraccion1.getRangoEdadMaxima() + " años " + "\n" +
                    "Nivel de peligro: " + atraccion1.getNivelPeligro() + "\n" +
                    "Peso maximo: " + atraccion1.getPesoMaximo() + "\n";
        }
        if (atraccion2.getRangoEdadMinima() <= 10) {
            atraccionesNiños++;
            informacionAtracciones = informacionAtracciones +
                    "Nombre: " + atraccion2.getNombre() + "\n" +
                    "Horario de operación: " + atraccion2.getHorario() + "\n" +
                    "Descripción: " + atraccion2.getDescripcion() + "\n" +
                    "Rango de edad: " + atraccion2.getRangoEdadMinima() + "-" + atraccion2.getRangoEdadMaxima() + " años " + "\n" +
                    "Nivel de peligro: " + atraccion2.getNivelPeligro() + "\n" +
                    "Peso maximo: " + atraccion2.getPesoMaximo() + "\n";
        }
        if (atraccion3.getRangoEdadMinima() <= 10) {
            atraccionesNiños++;
            informacionAtracciones = informacionAtracciones +
                    "Nombre: " + atraccion3.getNombre() + "\n" +
                    "Horario de operación: " + atraccion3.getHorario() + "\n" +
                    "Descripción: " + atraccion3.getDescripcion() + "\n" +
                    "Rango de edad: " + atraccion3.getRangoEdadMinima() + "-" + atraccion3.getRangoEdadMaxima() + " años " + "\n" +
                    "Nivel de peligro: " + atraccion3.getNivelPeligro() + "\n" +
                    "Peso maximo: " + atraccion3.getPesoMaximo() + "\n";
        }
        System.out.println("Hay " + atraccionesNiños +" atracciones para ninos, aquí está su información: " +"\n" +
                informacionAtracciones);
    }
    private static void ObtenerMayorAdulto(Visitante visitante1, Visitante visitante2, Visitante visitante3) {
        double adulto = 0.0;
        String mayorAdulto = "";
        if(visitante1.getEdad()>= 18 && visitante1.getEdad()>= adulto){
            adulto = visitante1.getEdad();
            mayorAdulto = visitante1.getNombres();
        }
        if(visitante2.getEdad()>= 18 && visitante2.getEdad()>= adulto) {
            adulto = visitante2.getEdad();
            mayorAdulto = visitante2.getNombres();
        }
        if(visitante3.getEdad()>= 18 && visitante3.getEdad()>= adulto) {
            adulto = visitante3.getEdad();
            mayorAdulto = visitante3.getNombres();
        }
        System.out.println("El visitante con mayor edad y que sea adulto es: " + mayorAdulto);
    }

    private static void ObtenerMayorAdolescente(Visitante visitante1, Visitante visitante2, Visitante visitante3) {
        double adolescente = 0.0;
        String mayorAdolescente = "";
        if(visitante1.getEdad()>= 11 && visitante1.getEdad()<= 17 && visitante1.getEdad()>= adolescente){
            adolescente = visitante1.getEdad();
            mayorAdolescente = visitante1.getNombres();
        }
        if(visitante2.getEdad()>= 11 && visitante2.getEdad()<= 17 && visitante2.getEdad()>= adolescente) {
            adolescente = visitante2.getEdad();
            mayorAdolescente = visitante2.getNombres();
        }
        if(visitante3.getEdad()>= 11 && visitante3.getEdad()<= 17 && visitante3.getEdad()>= adolescente) {
            adolescente = visitante3.getEdad();
            mayorAdolescente = visitante3.getNombres();
        }
        System.out.println("El visitante con mayor edad y que sea adolescente es: " + mayorAdolescente);
    }

    private static void ObtenerMayorNiño(Visitante visitante1, Visitante visitante2, Visitante visitante3) {
        double niño = 0.0;
        String mayorNiño = "Ninguno";
        if(visitante1.getEdad()>= 3 && visitante1.getEdad()<= 10 && visitante1.getEdad()>= niño){
            niño = visitante1.getEdad();
            mayorNiño = visitante1.getNombres();
        }
        if(visitante2.getEdad()>= 3 && visitante2.getEdad()<= 10 && visitante2.getEdad()>= niño) {
            niño = visitante2.getEdad();
            mayorNiño = visitante2.getNombres();
        }
        if(visitante3.getEdad()>= 3 && visitante3.getEdad()<= 10 && visitante3.getEdad()>= niño) {
            niño = visitante3.getEdad();
            mayorNiño = visitante3.getNombres();
        }
        System.out.println("El visitante con mayor edad y que sea niño es: " + mayorNiño);
    }

    private static void ObtenerMenorAdolescente(Visitante visitante1, Visitante visitante2, Visitante visitante3) {
        double adolescente = 0.0;
        String mayorAdolescente = "";
        if(visitante1.getEdad()>= 11 && visitante1.getEdad()<= 17 && visitante1.getEdad()>= adolescente){
            adolescente = visitante1.getEdad();
            mayorAdolescente = visitante1.getNombres();
        }
        if(visitante2.getEdad()>= 11 && visitante2.getEdad()<= 17 && visitante2.getEdad()<= adolescente) {
            adolescente = visitante2.getEdad();
            mayorAdolescente = visitante2.getNombres();
        }
        if(visitante3.getEdad()>= 11 && visitante3.getEdad()<= 17 && visitante3.getEdad()<= adolescente) {
            adolescente = visitante3.getEdad();
            mayorAdolescente = visitante3.getNombres();
        }
        System.out.println("El visitante con mayor edad y que sea adolescente es: " + mayorAdolescente);
    }


}
