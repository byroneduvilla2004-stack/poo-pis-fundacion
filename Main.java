//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Imprima con ciclos anidados una matriz de 4 pasillos × 5 estantes con el código de ubicación de
cada estante (por ejemplo, P2-E3).*/
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("P" + i + "-E" + j + "  ");
            }
            System.out.println();
        }

    }
}