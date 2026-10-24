import java.util.*;
public class BodegaFundacion {
  String[] nombres ={"Leche","Toallas higienicas","Atún","Paracetamol","Manzanas"};
  char[] categorias={'A','R','A','M','A'};
  int[] cantidades= {25,100,23,67,45};
  int [] caducidad = {30,-1,126,100,8};

  public void ListarProducots(){
  for (int i=0;i<5;i++) {
    System.out.printf("Producto %s , Categoria %c , Cantidad %d , Caducidad %d\n",nombres[i],categorias[i],cantidades[i],caducidad[i]);
  }
  }
  public void mostrarIngreso(){
    Scanner sc=new Scanner(System.in);
    int opcionIngreso;
    int cantidad;
    do{
      System.out.println("Para ingresar el producto, elige una opción: ");
      System.out.println("0. Ingresar una unidad de : " + nombres[0]);
      System.out.println("1. Ingresar una unidad de: " + nombres[1]);
      System.out.println("2. Ingresa una unidad de: " + nombres[2]);
      System.out.println("3. Ingresa una unidad de: " + nombres[3]);
      System.out.println("4. Ingresa una unidad de:" + nombres[4]);
      opcionIngreso=sc.nextInt();
    } while (opcionIngreso < 0 || opcionIngreso > 4);
    System.out.println("Ingresa un número valido");
      do{
        System.out.println("Ingresa la cantidad a sumar:");
        cantidad=sc.nextInt();
      }while (cantidad<=0);
    System.out.println("Ingresa un número valido");
      cantidades[opcionIngreso]=cantidades[opcionIngreso]+cantidad;
    System.out.println("El nuevo stock es: " + cantidades[opcionIngreso]);

    }
  public void mostrarRetiro(){
    Scanner sc= new Scanner(System.in);
    int opcionRetiro;
    int cantidad;
    do{
      System.out.println("Para ingresar el producto, elige una opción: ");
      System.out.println("0. Ingresar una unidad de : " + nombres[0]);
      System.out.println("1. Ingresar una unidad de: " + nombres[1]);
      System.out.println("2. Ingresa una unidad de: " + nombres[2]);
      System.out.println("3. Ingresa una unidad de: " + nombres[3]);
      System.out.println("4. Ingresa una unidad de:" + nombres[4]);
      opcionRetiro=sc.nextInt();
    } while (opcionRetiro < 0 || opcionRetiro > 4);
    System.out.println("Ingresa un número valido");
    do{
      System.out.println("Ingrese la cantidad a retirar:");
      cantidad=sc.nextInt();
    }while (cantidad <= 0 || cantidad > cantidades[opcionRetiro]);
    System.out.println("Ingresa un número valido");
    cantidades[opcionRetiro]=cantidades[opcionRetiro]-cantidad;
    System.out.println("El nuevo stock es: " + cantidades[opcionRetiro]);
    }
    public void mostrarAlerta(){
    for (int i=0;i<5;i++){
      int diasUtiles=switch (categorias[i]){
        case 'A'->7;
        case 'M' ->180;
        case 'R' ->0;
        default -> 0;
      };
      if (caducidad[i] != -1 && caducidad[i] <= diasUtiles) {
        System.out.println("El producto: " + nombres[i] + " caduca en " + caducidad[i] + " días.");
      }
    }
    }
    public void mostrarSalida(){
    int totalUnidades=0;
    int cantidadMaxima=-1;
    int productoCritico=0;
    String productoMayor="";
    for (int i=0;i<5;i++){
      totalUnidades = totalUnidades + cantidades[i];
      if (cantidades[i]>cantidadMaxima){
        productoMayor=nombres[i];
        cantidadMaxima = cantidades[i];
      }
      if (caducidad[i] != -1 && caducidad[i] <= 7) {
        productoCritico++;
      }
    }
      System.out.println("Los productos totales son: " + totalUnidades);
      System.out.println("El producto con más unidades es: " + productoMayor);
      System.out.println("Los productos en estado críticos son: " + productoCritico);
    }
  }
