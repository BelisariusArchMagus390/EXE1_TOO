package atividade1too;

import javax.swing.*;
public class Paciente extends Pessoa{
    private int codPaciente;
    private String senhaPaciente;
    
    public int getCodPaciente(){
        return this.codPaciente;
    }
    
    public void setCodPaciente(int codPaciente){
        this.codPaciente = codPaciente;
    }
    
    public String getSenhaPaciente(){
        return this.senhaPaciente;
    }
    
    public void setSenhaPaciente(String senhaPaciente){
        this.senhaPaciente = senhaPaciente;
    }
    
    @Override
    public boolean logar(String senhaPaciente){
        if (this.senhaPaciente == senhaPaciente){
            return true;
        }else{
            return false;
        }
    }
}
