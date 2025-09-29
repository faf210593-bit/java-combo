
package Comboview;
import java.util.Scanner;

public class ComboView {
private Scanner scanner = new Scanner(System.in);
    public String pedirTipoCombo() {
        System.out.println("Seleccione el tipo de combo base (hamburguesa, pollo, vegetariano):");
        return scanner.nextLine();
    }
    public String pedirBebida() {
        System.out.println("Seleccione una bebida (Coca, Agua, Jugo):");
        return scanner.nextLine();
    }
    public String pedirAcompanamiento() {
        System.out.println("Seleccione un acompañamiento (Papas, Ensalada, Arroz):");
        return scanner.nextLine();
    }
    public String pedirExtra() {
        System.out.println("Seleccione un extra (Queso, Tocino, Nada):");
        return scanner.nextLine();
    }
    public void mostrarResumen(Combo combo) {
        System.out.println("\nResumen del pedido:");
        System.out.println(combo);
    }   
}
