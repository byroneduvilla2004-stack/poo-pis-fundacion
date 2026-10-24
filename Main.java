import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BodegaFundacion bodega=new BodegaFundacion();
        int opciones ;
        do {
            System.out.println("1. Listar");
            System.out.println("2. Ingresar");
            System.out.println("3. Despachar");
            System.out.println("4. Alertas");
            System.out.println("5. Salir");
            opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    bodega.ListarProducots();
                    break;
                case 2:
                    bodega.mostrarIngreso();
                    break;
                case 3:
                    bodega.mostrarRetiro();
                    break;
                case 4:
                    bodega.mostrarAlerta();
                    break;
                case 5:
                    bodega.mostrarSalida();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            System.out.println();
        }while (opciones!=5);
    }
}