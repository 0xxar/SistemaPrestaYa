package logica;

import javax.swing.*;
import interfaces.*;

public class LogicLoginAdminClient {

   public String nickName="hola", passWord="",tipe_User,status_User;


    public void ProcesoLogin(){
       //String nickname="";
       // String password="";
        if(nickName != "" && passWord != ""){

            if(tipe_User=="Admin" && status_User=="Active"){
                new LoginAdminClients().dispose();
                new InterfaceMainAdmin().setVisible(true);

            } else if(tipe_User=="Client" && status_User=="Active"){
                new InterfaceMainClient().setVisible(true);

            }else{

                JOptionPane.showMessageDialog(null,"Usuario inactivo o no registrado, por favor comunicarse con el administrador");
            }


        }else if(nickName != "" && passWord ==""){

            JOptionPane.showMessageDialog(null,"Por favor, ingrese la contrasena");

        }else if(nickName == "" && passWord !=""){

            JOptionPane.showMessageDialog(null,"Por favor, ingrese su Nickname");

        }else{

            JOptionPane.showMessageDialog(null," por favor comunicarse con el administrador");
        }
    }
}
