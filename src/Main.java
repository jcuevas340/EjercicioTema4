import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Llama a la funcion para saber si un numero es positivo, negativo o cero.
        System.out.println(positivoNegativo());

        //Llama a la funcion que imprime un numero mientras este sea menor a 3
        menorATres();

        //Llama a la funcion doWhile que usa la misma estructura que menorATres pero se ejecuta minimo una vez
        doWhile();

        //Llama a la funcion bucleFor que incrementa una variable hasta que sea igual a 3
        bucleFor();

        //Llama a la funcion estaciones que devuelve la estacion con un switchCase
        estaciones();

    }

    public static String positivoNegativo(){
        System.out.print("Ingresa un numero: ");
        int numeroIf = scanner.nextInt();
        String resultado;

        if(numeroIf > 0){
            resultado = "El numero es positivo.";
        } else if(numeroIf < 0){
            resultado = "El numero es negativo.";
        } else {
            resultado = "El numero es cero.";
        }

        return resultado;
    }

    public static void menorATres(){
        System.out.print("Ingresa un numero: ");
        int numeroWhile = scanner.nextInt();

        if(numeroWhile >= 3){
            System.out.println("El numero es mayor o igual a 3");
        } else {
            while(numeroWhile < 3){
                System.out.println(numeroWhile);
                numeroWhile++;
            }
        }
    }

    public static void doWhile(){
        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();

        do {
            numero++;
        }while (numero < 3);

        System.out.println(numero);
    }

    public static void bucleFor(){
        int numeroFor;
        for(numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

    }

    public static void estaciones(){
        System.out.print("Ingresa una estacion: ");
        String estacion = scanner.nextLine();
        estacion = estacion.toLowerCase();

        switch (estacion) {
            case "primavera" -> System.out.println("Es primavera.");
            case "verano" -> System.out.println("Es en verano.");
            case "otono" -> System.out.println("Es otono.");
            case "invierno" -> System.out.println("Es invierno.");
            default -> System.out.println("Opcion invalida.");
        }
    }
}