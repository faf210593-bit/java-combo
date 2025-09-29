
package Factory;


public class ComboVegetariano implements ComboBase { 
    public Combo crearComboBase() {
        Combo combo = new Combo();
        combo.setTipoBase("Vegetariano");
        combo.setBebida("Sin bebida");
        combo.setAcompanamiento("Sin acompañamiento");
        combo.setExtra("Sin extra");
        return combo;
    }
}    

