package interfaces;

import javax.swing.*;
import java.awt.*;

public class InterfaceAdmin extends JFrame {

   public JTextField txt_nick_name_user;
   public JPasswordField txt_pass_user;
   public JButton bt_show_session,bt_register;
   public JCheckBox checkbox_pass;
   public JLabel label_title,label_txt_nickname,label_password;

    public InterfaceAdmin(){
        setLayout(null);
        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(155,200,120));
        setTitle("Presta YaCash!");
        FaceImage();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public void FaceImage(){

        label_title = new JLabel("Presta YaCash!");
        label_title.setFont(new Font("Bell Sans FB",1,18));
        label_title.setBounds(130,20,150,40);
        add(label_title);

        txt_nick_name_user = new JTextField("");
        txt_nick_name_user.setBounds(90,70,220,40);
        txt_nick_name_user.setHorizontalAlignment(JTextField.CENTER);
        add(txt_nick_name_user);

        txt_pass_user = new JPasswordField("");
        txt_pass_user.setBounds(90,140,220,40);
        txt_pass_user.setHorizontalAlignment(JTextField.CENTER);
        add(txt_pass_user);

        bt_show_session = new JButton("Iniciar");
        bt_show_session.setBounds(100,210,200,40);
        bt_show_session.setFont(new Font("Tw Cen MT",1,12));
        bt_show_session.setHorizontalAlignment(JButton.CENTER);
        add(bt_show_session);

        bt_register = new JButton("Register");
        bt_register.setBounds(100,270,200,40);
        bt_register.setFont(new Font("Andale Mono",1,12));
        bt_register.setHorizontalAlignment(JButton.CENTER);
        add(bt_register);


    }

    public static void main(String args[]) {
        InterfaceAdmin face = new InterfaceAdmin();
        face.setVisible(true);

    }
}
