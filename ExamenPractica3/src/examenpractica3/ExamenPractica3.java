
package examenpractica3;
import Controlador.ListaCoches;

import java.time.LocalDate;
import javax.swing.SwingUtilities;
import Modelo.Coche;
import Vista.JFramePrincipal;
import Vista.PanelVisualizar;

/**
 *
 * @author alumno
 */
public class ExamenPractica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SwingUtilities.invokeLater(() -> {
            ListaCoches lista = new ListaCoches();
            lista.anadirCoche(new Coche("3875gva", LocalDate.of(1990, 5, 14), 2736));
            lista.anadirCoche(new Coche("8172ett", LocalDate.of(2005, 3, 23), 12902));
            lista.anadirCoche(new Coche("6543aad", LocalDate.of(1975, 8, 21), 3404));
            lista.anadirCoche(new Coche("8493jik", LocalDate.of(2014, 7, 4), 5000));

            JFramePrincipal ventana = new JFramePrincipal();

            ventana.setVisible(true);
            
            
            lista.irAlPrimero();   // anadirCliente deja el actual en el ultimo añadido

    //});
     
        
}
}
