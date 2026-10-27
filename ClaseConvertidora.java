import java.util.*; /*Importa las bibliotecas requeridas de Java*/
public class ClaseConvertidora {
    public void mostrarCase1() { /*Aquí se hace el ejercicio de conversión y se lo guarda en un public void que será mostrado en el menú.
    Lo mismo se hace con case2,case3 y case4.*/
        Scanner sc = new Scanner(System.in);
        double libras;
        double kgConvertidos;
        do { /*Repite la solicitud de datos si el usuario ingresa un valor negativo*/
            System.out.println("Ingresa la cantidad de libras:");
            libras = sc.nextDouble();
            if (libras < 0) {
                System.out.println("Ingresa un valor valido");
            } else {
                kgConvertidos = (libras / 2.2046);
                System.out.printf("%.2f lb son: %.2f kg.%n", libras, kgConvertidos); /*Se uso un printlf para imprimir un valor solo con dos decimales. Use el %.2f*/

            }
        } while (libras < 0);
    }

    public void mostrarCase2() {
        Scanner sc = new Scanner(System.in);
        double kilogramos;
        double lbConvertidas;
        do {
            System.out.println("Ingrese la cantidad en kilogramos:");
            kilogramos = sc.nextDouble();
            if (kilogramos < 0) {
                System.out.println("Ingresa un valor valido");
            } else {
                lbConvertidas = (kilogramos * 2.2046);
                System.out.printf("%.2f kg son: %.2f lb.%n", kilogramos, lbConvertidas);
            }
        } while (kilogramos < 0);
    }

    public void mostrarCase3() {
        Scanner sc = new Scanner(System.in);
        double galones;
        double litrosConvertidos;
        do {
            System.out.println("Ingresa la canridad en galones:");
            galones = sc.nextDouble();
            if (galones < 0) {
                System.out.println("Ingresa un valor valido");
            } else {
                litrosConvertidos = (galones * 3.785);
                System.out.printf("%.2f galones son: %.2f litros.%n", galones, litrosConvertidos);

            }
        } while (galones < 0);
    }

    public void mostrarCase4() {
        Scanner sc = new Scanner(System.in);
        double litros;
        double galonesConvertidos;
        do {
            System.out.println("Ingresa la canridad en litros:");
            litros = sc.nextDouble();
            if (litros < 0) {
                System.out.println("Ingresa un valor valido");
            } else {
                galonesConvertidos = (litros / 3.785);
                System.out.printf("%.2f litros son: %.2f galones.%n", litros, galonesConvertidos);

            }
        } while (litros < 0);

    }
}
