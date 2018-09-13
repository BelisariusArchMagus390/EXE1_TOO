package atividade1too;

import javax.swing.*;
public class Enfermeiro extends Pessoa{
    private int corem;
    private double salario;
    private String senhaEnfermeiro;
    
    public int getCorem(){
        return this.corem;
    }
    
    public void setCorem(int corem){
        this.corem = corem;
    }
    
    @Override
    public boolean logar(String senhaEnfermeiro){
        boolean password;
        if (this.senhaEnfermeiro == senhaEnfermeiro){
            return true;
        }else{
            return false;
        }
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getSenhaEnfermeiro(){
        return this.senhaEnfermeiro;
    }
    
    public void setSenhaEnfermeiro(String senhaEnfermeiro){
        this.senhaEnfermeiro = senhaEnfermeiro;
    }
}
