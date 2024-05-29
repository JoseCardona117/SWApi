import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escribe el número de la película de Star Wars que quiere consultar:");
        try{
            var numeroDePelicuca = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscaPelicula(1);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);
        } catch (NumberFormatException e) {
            System.out.println("Número no encontrada"+e.getMessage());
        }
        catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizó la aplicación.");
        }
    }
}
