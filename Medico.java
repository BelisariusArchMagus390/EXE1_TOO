package atividade1too;

import javax.swing.*;
public class Medico extends Pessoa {
    private String especialidades;
    private int crm;
    private String senhaMedico; 
    private double salario;
    
    public String getEspecialidades(){
        return this.especialidades;
    }
    
    public void setEspecialidades(String especialidades){
        this.especialidades = especialidades;
    }
    
    public int getCrm(){
        return this.crm;
    }
    
    public void setCrm(int crm){
        this.crm = crm;
    }
    
    public String getSenhaMedico(){
        return this.senhaMedico;
    }
    
    public void setSenhaMedico(String senhaMedico){
        this.senhaMedico = senhaMedico;
    }
    
    public double getSalario(){
        return this.salario;
    } 
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    @Override
    public boolean logar(String senhaMedico){
        boolean password;
        if (this.senhaMedico == senhaMedico){
            return true;
        }else{
            return false;
        }
    }
}
