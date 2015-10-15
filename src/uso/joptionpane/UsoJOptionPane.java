
package uso.joptionpane;

import javax.swing.JOptionPane;


public class UsoJOptionPane {

   
    public static void main(String[] args) {
        
        // Programa de uso JOptionPane
        float base, altura;
         
    String resposta = JOptionPane.showInputDialog("Base=");
    base= Float.parseFloat(resposta);
    JOptionPane.showMessageDialog(null,"Base="+base);
    
    String resposta1= JOptionPane.showInputDialog("Altura=");
    altura= Float.parseFloat(resposta1);
    JOptionPane.showMessageDialog(null,"Altura="+altura);
    
    JOptionPane.showMessageDialog(null,"Area="+base*altura/2);
    
    System.out.println("CAMBIO");
    /* Este es un comentario sin sentido alguno*/
    }
    
}
