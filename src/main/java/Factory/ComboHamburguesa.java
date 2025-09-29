
package Factory;


public class ComboHamburguesa implements ComboBase {
    public Combo crearComboBase() {
        Combo combo = new Combo();
        combo.setTipoBase("Hamburguesa");
        // Por defecto, sin personalización
        combo.setBebida("Sin bebida");
        combo.setAcompanamiento("Sin acompañamiento");
        combo.setExtra("Sin extra");
        return combo;
    }
}

