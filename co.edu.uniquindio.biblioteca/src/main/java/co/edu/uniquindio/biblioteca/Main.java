package co.edu.uniquindio.biblioteca;
import co.edu.uniquindio.biblioteca.libro;

public abstract class Main {
    public static void main(String[] args) {
        System.out.println("Hola a todos");

        crearLibros();
    }
// Creacion de libros

    private static void crearLibros() {
        libro libro11 = new libro();
        libro11.setTitulo("Los hombres son de marte, las mujeres son de venus");
        libro11.setGenero("Autoayuda");
        libro11.setAniopublicacion(1992);
        libro11.setEditorial("Oceano");
        libro11.setNumeropaginas(344);
        libro11.setAutor("John Gray");

        libro libro12 = new libro();
        libro12.setTitulo("La oportunista");
        libro12.setGenero("Novela rosa, ficcion");
        libro12.setAniopublicacion(2012);
        libro12.setEditorial("Plataforma");
        libro12.setNumeropaginas(236);
        libro12.setAutor("Tarryn fisher");

        libro libro13 = new libro();
        libro13.setTitulo("El ladron");
        libro13.setGenero("Novela rosa, ficcion");
        libro13.setAniopublicacion(2013);
        libro13.setEditorial("Plataforma");
        libro13.setNumeropaginas(308);
        libro13.setAutor("Tarryn Fisher");

        libro libro14 = new libro();
        libro14.setTitulo("La ciencia del lenguaje positivo");
        libro14.setGenero("Psicologia");
        libro14.setAniopublicacion(2016);
        libro14.setEditorial("Paidos iberica");
        libro14.setNumeropaginas(332);
        libro14.setAutor("Diana Yoldi, jose Hidalgo, Luis Castellanos");

        libro libro15 = new libro();
        libro15.setTitulo("Las 48 leyes del poder");
        libro15.setGenero("Psicologia");
        libro15.setAniopublicacion(1998);
        libro15.setEditorial("Viking press");
        libro15.setNumeropaginas(452);
        libro15.setAutor("Robert Grene");


        //Contador de vocales y consonantes
        int calcularVocal = 0;
        int calcularConsonante = 0;
        if (contarVocal(libro11.getTitulo().charAt(0))) {
            calcularVocal += 1;
        } else {
            calcularConsonante += 1;
        }

        if (contarVocal(libro12.getTitulo().charAt(0))) {
            calcularVocal += 1;
        } else {
            calcularConsonante += 1;
        }

        if (contarVocal(libro13.getTitulo().charAt(0))) {
            calcularVocal += 1;
        } else {
            calcularConsonante += 1;
        }

        if (contarVocal(libro14.getTitulo().charAt(0))) {
            calcularVocal += 1;
        } else {
            calcularConsonante += 1;
        }

        if (contarVocal(libro15.getTitulo().charAt(0))) {
            calcularVocal += 1;
        } else {
            calcularConsonante += 1;
        }

        System.out.println("La cantidad de vocales es:" + calcularVocal);
        System.out.println("La cantidad de consonantes es:" + calcularConsonante);

        //Cambio titulo
        String tituloInicial = "Calculo integral";
        String tituloFinal = "Calculo integral y diferencial";

        if(libro11.getTitulo().equalsIgnoreCase(tituloInicial)){
            libro11.setTitulo(tituloFinal);
            System.out.println("Titulo:" +libro11.getTitulo());
        }

        if(libro12.getTitulo().equalsIgnoreCase(tituloInicial)){
            libro12.setTitulo(tituloFinal);
            System.out.println("Titulo:" +libro12.getTitulo());
        }

        if(libro13.getTitulo().equalsIgnoreCase(tituloInicial)){
            libro13.setTitulo(tituloFinal);
            System.out.println("Tutulo:" +libro13.getTitulo());
        }

        if(libro14.getTitulo().equalsIgnoreCase(tituloInicial)){
            libro14.setTitulo(tituloFinal);
            System.out.println("Titulo:" +libro14.getTitulo());
        }

        if(libro15.getTitulo().equalsIgnoreCase(tituloInicial)){
            libro15.setTitulo(tituloFinal);
            System.out.println("Titulo:" +libro15.getTitulo());
        }

        // Contador de genero
        int calcularGeneroPsicologia = 0;

        if(libro11.getGenero().equalsIgnoreCase("Psicologia")){
            calcularGeneroPsicologia += 1;
        }

        if(libro12.getGenero().equalsIgnoreCase("Psicologia")){
            calcularGeneroPsicologia += 1;
        }

        if(libro13.getGenero().equalsIgnoreCase("Psicologia")){
            calcularGeneroPsicologia += 1;
        }

        if(libro14.getGenero().equalsIgnoreCase("Psicologia")){
            calcularGeneroPsicologia += 1;
        }

        if(libro15.getGenero().equalsIgnoreCase("Psicologia")){
            calcularGeneroPsicologia += 1;
        }

        System.out.println("Los libros que tienen por genero psicologia son:" +calcularGeneroPsicologia);

        // ¿Tiene mas de 200 paginas?
        if(libro11.getNumeropaginas() >= 200){
            System.out.println("El libro tiene mas de 200 paginas");
        } else {
            System.out.println("El libro tiene menos de 200 paginas");
        }

        if(libro12.getNumeropaginas() >= 200) {
            System.out.println("El libro tiene mas de 200 paginas");
        } else {
            System.out.println("El libro tiene menos de 200 paginas");
        }

        if(libro13.getNumeropaginas() >= 200) {
            System.out.println("El libro tiene mas de 200 paginas");
        } else {
            System.out.println("El libro tiene menos de 200 paginas");
        }

        if(libro14.getNumeropaginas() >= 200) {
            System.out.println("El libro tiene mas de 200 paginas");
        } else {
            System.out.println("El libro tiene menos de 200 paginas");
        }

        if(libro15.getNumeropaginas() >= 200) {
            System.out.println("El libro tiene mas de 200 paginas");
        } else {
            System.out.println("El libro tiene menos de 200 paginas");
        }
    }
    private static boolean contarVocal(char caracter){
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            return true;
        } else {
            return false;
        }
    }

}