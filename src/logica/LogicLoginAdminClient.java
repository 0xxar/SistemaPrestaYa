package logica;

import javax.swing.*;
import interfaces.*;

public class LogicLoginAdminClient {

    public String nickName, passWord,tipe_User,status_User;


    public void ProcesoLogin(){
        String nickname="";
        String password="";
        if(nickName != "" && passWord !=""){

            if(tipe_User=="Admin" && status_User=="Ative"){
                new InterfasMainAdmin().setVisible(true);

            } else if(tipe_User=="Client" && status_User=="Ative"){
                new InterfaceMainClient().setVisible(true);

            }else{

                JOptionPane.showMessageDialog(null,"Usuario inactivo o no registrado, por favor comunicarse con el administrador");
            }




        }if(nickName != "" && passWord ==""){

            JOptionPane.showMessageDialog(null,"Por favor, ingrese la contrasena");

        }if(nickName == "" && passWord !=""){

            JOptionPane.showMessageDialog(null,"Por favor, ingrese su Nickname");

        }
    }
}
