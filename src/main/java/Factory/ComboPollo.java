
package Factory;


    public class ComboPollo implements ComboBase {
    public Combo crearComboBase() {
        Combo combo = new Combo();
        combo.setTipoBase("Pollo");
        combo.setBebida("Sin bebida");
        combo.setAcompanamiento("Sin acompañamiento");
        combo.setExtra("Sin extra");
        return combo;
    }

    }
