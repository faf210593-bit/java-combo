
package Factory;


public class ComboFcatory {
 public static ComboBase getComboBase(String tipo) {
        if (tipo == null) {
            return null;
        }
        switch (tipo.toLowerCase()) {
            case "hamburguesa":
                return new ComboHamburguesa();
            case "pollo":
                return new ComboPollo();
            case "vegetariano":
                return new ComboVegetariano();
            default:
                return null;
        }
    }
}   
