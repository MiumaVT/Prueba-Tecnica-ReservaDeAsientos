import java.sql.SQLOutput;
import java.util.Scanner;

public class ReservarAsiento {

    public static void main(String[] args) {

        //Declaracion de variables
        char asientos [][] = new char[10][10];
        boolean bandera = false; //Sentinela. Funciona como controlador para ciclos.
        Scanner teclado = new Scanner(System.in); //Scanner. Funciona para capturar datos escritos con el teclado.
        int fila = 0, asiento = 0;
        String respuesta;
        String verMapa;

        //Cargar matriz de asientos
        for (int f=0; f<10; f++){
           for (int c=0; c<10; c++){
               asientos[f][c] = 'L';
           }
        }

        //Bievenido al sistema
        System.out.println("-----BIENVENIDO AL SISTEMA DE RESERVA-----");

        //Reserva de asientos
        while (bandera!=true){
            //Visualizacion del mapa
            System.out.println("Desea ver los asientos disponibles? S: Si. Cualquier otra letra: No");
            verMapa = teclado.next(); //varaibleDeScanner.next indica que el Scanner capturara la palabra o letra escrita en consola

            if (verMapa.equalsIgnoreCase("S")){ //IgnoreCase indica que ignorara si lo escrito es mayuscula o miniscula
                dibujarMapa(asientos);
            }
            //Reserva
            boolean ok = false;
            while (ok!= true) {
                System.out.println("\n Ingrese Fila y Asiento a reservar");
                System.out.println("Fila (entre 0 y 9): ");
                fila = teclado.nextInt(); //variableDeScanner.nextInt indica que el Scanner capturara el numero ENTERO escrita en consola

                System.out.println("Asiento (entre 0 y 9): ");
                asiento = teclado.nextInt();

                if (fila <= 9 && fila >= 0) {
                    if (asiento <= 9 && asiento >= 0) {
                        ok = true;
                    } else {
                        System.out.println("El numero de asiento no es valido");
                    }
                } else {
                    System.out.println("El numero de fila no es valido");
                }
            }

            if (asientos[fila][asiento] == 'L'){
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente");
            }
            else {
                System.out.println("El asiento esta ocupado. Por favor elija otro");
            }

            System.out.println("Desea finalizar la reserva? S: Si. Cualquier otra letra: No");
            respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase("S")){
                bandera = true;
            }
        }
    }

    private static void dibujarMapa(char[][] asientos) {
        for (int f=0; f<10; f++){
            System.out.print(f + "");
            for (int c=0; c<10; c++){
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println("");
        }
    }
}
