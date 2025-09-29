
package Controller;


public class ComboController {
private ComboView view;
    private Combo combo;
    public ComboController(ComboView view) {
        this.view = view;
    }    
}
public void iniciarPedido() {
        // 1. Pedir tipo de combo base
        String tipo = view.pedirTipoCombo();
 // 2. Crear combo base con Factory
        ComboBase comboBase = ComboFactory.getComboBase(tipo);
        if (comboBase == null) {
            System.out.println("Tipo de combo no válido.");
            return;
        }
        combo = comboBase.crearComboBase();
// 3. Personalizar con Builder
        ComboBuilder builder = new ComboBuilder(combo);
String bebida = view.pedirBebida();
        builder.agregarBebida(bebida);
 String acompanamiento = view.pedirAcompanamiento();
        builder.agregarAcompanamiento(acompanamiento);
tring extra = view.pedirExtra();
        builder.agregarExtra(extra);
        combo = builder.build();
}

