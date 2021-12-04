package Backend;

import java.awt.Component;
import javax.swing.JOptionPane;


public class Calculo {
    
    public void Juros(){
        int c;
        int n;  
   n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor total"));
   c = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de dias atrasados"));
   float j = (float) (n * 0.50);
   float t = j * c;
   
        Component parentComponent = null;
    JOptionPane.showMessageDialog(parentComponent,"O juros é de R$ "+t);
    
    }
    
    public void Multa(){
        int c;
        int n;  
   n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor total"));
     
   double valortotal = n;
    double percentual = 2.0 / 100.0; 

    double m = (percentual * valortotal);
   
   
        Component parentComponent = null;
    JOptionPane.showMessageDialog(parentComponent,"A multa é de R$ "+m);
    }
    
    public void ICMS(){
        int c;
        int n; 
        int r;
   Component parentComponent = null;
        
        r = Integer.parseInt(JOptionPane.showInputDialog("Escolha qaul operação quer fazer:"
                + " 1 = Adiçaõ,"
                + " 2 =  Divisão,"
                + " 3 = Porcentagem "));
        if(r ==1){
           n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor "));
           c = Integer.parseInt(JOptionPane.showInputDialog("Insira outro valor "));    
           int t = n+c;
           JOptionPane.showMessageDialog(parentComponent, t);
        }if(r==2){
           n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor "));
           c = Integer.parseInt(JOptionPane.showInputDialog("Insira outro valor "));    
           int t = n/c;
           JOptionPane.showMessageDialog(parentComponent, t); 
        }if(r==3){
            n = (int) Double.parseDouble(JOptionPane.showInputDialog("Insira o valor "));
           c = (int) Double.parseDouble(JOptionPane.showInputDialog("Insira a porcentagem "));
           double percentual = c / 100.0; 
           double t = percentual*n;
           JOptionPane.showMessageDialog(parentComponent, t);
        }
       }
}
