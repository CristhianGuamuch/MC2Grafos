
package Principal;

import Ventanas.Pantalla;
import javax.swing.JOptionPane;

public class ProyectoGrafos {
    public static void main(String[] args) {
        new Pantalla().setVisible(true);
        JOptionPane.showMessageDialog(null, "Para crear nodos haga click sobre la pantalla celeste."
                + "\n\nPara unir dos nodos haga click sobre los nodos"
                + "\nque desea unir."
                + "\n\nPara buscar el camino más corto haga click en la"
                + "\npestaña archivo y click en: Camino mas Corto");
 }
}
