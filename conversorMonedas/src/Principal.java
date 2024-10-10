
import Monedas.ConsultaDivisa;
import Monedas.Divisa;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaDivisa consulta = new Monedas.ConsultaDivisa();
        System.out.println("Escriba el número de la divisa que quiere consultar:");

        var consulta =1
        int salir = 1;
        while (salir != 0) {
            System.out.println("Pesos Argentinos");
            double consulta = Double.valueOf(lectura.next());

            System.out.println("Pesos mexicanos ");
            double consulta = Double.valueOf(lectura.next());

            System.out.println("Euros ");
            double consulta = Double.valueOf(lectura.next());

            System.out.println("Dolares ");
            double consulta = Double.valueOf(lectura.next());

        }


        try {
            var numeroDeDivisa = Integer.valueOf(lectura.nextLine());
            Divisa divisa = ((Monedas.ConsultaDivisa) consulta).buscaDivisa(numeroDeDivisa);
            System.out.println(divisa);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(divisa);
        } catch (NumberFormatException e) {
            System.out.println("Número no encontrado " + e.getMessage());
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }
    }
}


