/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicina;

import javax.swing.JOptionPane;

/**
 *
 * @author pioca_000
 */
public class Medicina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MedicoAuxiliar med1 = new MedicoAuxiliar();
        MedicoCirurgiao med2 = new MedicoCirurgiao();
        
        
        med1.setNome("Luiza");
        med1.setIdade(59);
        med1.setCRM("12345");
        med1.setSalario(11000);
        
        med2.setNome("Gabriela");
        med2.setIdade(50);
        med2.setCRM("678910");
        med2.setSalario(15000);
        
        
        if(med1.MedicoAposentado()){
            JOptionPane.showMessageDialog(null,"Voce se aposentou");
        }
        else{
            JOptionPane.showMessageDialog(null,"Pode continuar trabalhando");
        }
        
        if(med2.MedicoAposentado()){
            JOptionPane.showMessageDialog(null,"Voce se aposentou");
        }
        else{
            JOptionPane.showMessageDialog(null,"Pode continuar trabalhando");
        }
        
        JOptionPane.showMessageDialog(null,"O da aposentadoria do 2 eh: "+med2.valorAposentadoria());
    }
    
}
