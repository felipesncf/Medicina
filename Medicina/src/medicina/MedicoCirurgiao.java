/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicina;

/**
 *
 * @author pioca_000
 */
public class MedicoCirurgiao extends Medico {
    @Override
    public boolean MedicoAposentado(){
       if(this.idade>=50){ 
           return true;
       }
       else{
           return false;
       }
    }
    
    @Override
    public double valorAposentadoria(){
        return super.valorAposentadoria()+800;
    }
}
