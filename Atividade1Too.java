package atividade1too;

import javax.swing.*;
public class Atividade1Too {

    public static void main(String[] args) {
        System.out.println("                                                                                                                                                              \n" +
"\033[31m        ,--,                                                                                                                                                  \n\033[0m" +
"\033[31m      ,--.'|                                           ___                 ,--,             .--.--.                          ___                       ____   \n\033[0m" +
"\033[31m   ,--,  | :                      ,-.----.    ,--,   ,--.'|_             ,--.'|            /  /    '.                      ,--.'|_                   ,'  , `. \n\033[0m" +
"\033[31m,---.'|  : '   ,---.              \\    /  \\ ,--.'|   |  | :,'            |  | :           |  :  /`. /                      |  | :,'               ,-+-,.' _ | \n\033[0m" +
"\033[31m|   | : _' |  '   ,'\\   .--.--.   |   :    ||  |,    :  : ' :            :  : '           ;  |  |--`             .--.--.   :  : ' :            ,-+-. ;   , || \n\033[0m" +
"\033[31m:   : |.'  | /   /   | /  /    '  |   | .\\ :`--'_  .;__,'  /    ,--.--.  |  ' |           |  :  ;_         .--, /  /    '.;__,'  /     ,---.  ,--.'|'   |  || \n\033[0m" +
"\033[31m|   ' '  ; :.   ; ,. :|  :  /`./  .   : |: |,' ,'| |  |   |    /       \\ '  | |            \\  \\    `.    /_ ./||  :  /`./|  |   |     /     \\|   |  ,', |  |, \n\033[0m" +
"\033[31m'   |  .'. |'   | |: :|  :  ;_    |   |  \\ :'  | | :__,'| :   .--.  .-. ||  | :             `----.   \\, ' , ' :|  :  ;_  :__,'| :    /    /  |   | /  | |--'  \n\033[0m" +
"\033[31m|   | :  | ''   | .; : \\  \\    `. |   : .  ||  | :   '  : |__  \\__\\/: . .'  : |__           __ \\  \\  /___/ \\: | \\  \\    `. '  : |__ .    ' / |   : |  | ,     \n\033[0m" +
"\033[31m'   : |  : ;|   :    |  `----.   \\:     |`-''  : |__ |  | '.'| ,\" .--.; ||  | '.'|         /  /`--'  /.  \\  ' |  `----.   \\|  | '.'|'   ;   /|   : |  |/      \n\033[0m" +
"\033[31m|   | '  ,/  \\   \\  /  /  /`--'  /:   : :   |  | '.'|;  :    ;/  /  ,.  |;  :    ;        '--'.     /  \\  ;   : /  /`--'  /;  :    ;'   |  / |   | |`-'       \n\033[0m" +
"\033[31m;   : ;--'    `----'  '--'.     / |   | :   ;  :    ;|  ,   /;  :   .'   \\  ,   /           `--'---'    \\  \\  ;'--'.     / |  ,   / |   :    |   ;/           \n\033[0m" +
"\033[31m|   ,/                  `--'---'  `---'.|   |  ,   /  ---`-' |  ,     .-./---`-'                         :  \\  \\ `--'---'   ---`-'   \\   \\  /'---'            \n\033[0m" +
"\033[31m'---'                               `---`    ---`-'           `--`---'                                    \\  ' ;                      `----'                  \n\033[0m" +
"\033[31m                                                                                                           `--`                                               \033[0m");
        
        System.out.println("\033[31m##### ENFERMEIRO #####\033[0m");
        
        Enfermeiro e = new Enfermeiro();
        
        e.setNome("Cleyton");
        e.setSobrenome("Rodrigues");
        e.setCpf("112.222.111-12");
        e.setRg("12.892.921-8");
        e.setCorem(2921);
        e.setSalario(1400.00);
        e.setSenhaEnfermeiro("123");
        
        if(e.logar("123")){
            System.out.println("Nome: "+e.getNome()+"\nSobrenome: "+e.getSobrenome()+"\nCPf: "+e.getCpf()+"\nRG: "+e.getRg()+"\nCorem: "+e.getCorem()+"Salário: "+e.getSalario());
        }else{
            JOptionPane.showMessageDialog(null, "Senha inválida!", "ERRO", 0);
        }
        
        System.out.println("\n------------------------------------------\n");
        System.out.println("\033[33m##### MEDICO #####\n\n");
        
        Medico m = new Medico();
        
        m.setNome("Claudio");
        m.setSobrenome("Santos");
        m.setCpf("123.809.212-21");
        m.setRg("43.892.892-1");
        m.setEspecialidades("Otorrinolaringologista");
        m.setCrm(22222);
        m.setSalario(7975.02);
        m.setSenhaMedico("123");
        
        if(m.logar("123")){
            System.out.println("Nome: "+m.getNome()+"\nSobrenome: "+m.getSobrenome()+"\nCPf: "+m.getCpf()+"\nRG: "+m.getRg()+"\nEspecialidades: "+m.getEspecialidades()+"\nCRM: "+m.getCrm()+"Salario: "+m.getSalario());
        }else{
            JOptionPane.showMessageDialog(null, "Senha inválida!", "ERRO", 0);
         }
        
        System.out.println("\n------------------------------------------\n");
        System.out.println("\033[34m##### PACIENTE #####\n\n");
        
        Paciente p = new Paciente();
        
        p.setNome("Amanda");
        p.setSobrenome("Lima");
        p.setCpf("281.210.801-34");
        p.setRg("21.789.980-9");
        p.setCodPaciente(2);
        p.setSenhaPaciente("123");
        
        if(m.logar("123")){
            System.out.println("Nome: "+p.getNome()+"\nSobrenome: "+p.getSobrenome()+"\nCPf: "+p.getCpf()+"\nRG: "+p.getRg()+"\nCod. do Paciente: "+p.getCodPaciente());
        }else{
            JOptionPane.showMessageDialog(null, "Senha inválida!", "ERRO", 0);
        }
    }
    
    
    
}
