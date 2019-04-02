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
public class Medico {
    protected String CRM;
    protected String nome;
    protected int idade;
    protected double salario;
    
    public String getCRM(){
        return CRM;
    }
    public void setCRM(String CRM){
        this.CRM=CRM;
    }
    
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    
    
   public int getIdade(){
       return idade;
   }
   public void setIdade(int idade){
       this.idade=idade;
   }
   
   
   public double getSalario(){
       return salario;
   }
   public void setSalario(double salario){
       this.salario=salario;
   }
   
   
   public boolean MedicoAposentado(){
       if(this.idade>55){
           return true;
       }
       else{
           return false;
       }
   }
   
   
   public double valorAposentadoria(){
       return this.salario*1.8;
   }
    
    
}
