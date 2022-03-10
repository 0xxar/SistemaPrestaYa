package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.*;

public class LoginAdminClients extends JFrame implements ActionListener {



    public JTextField txt_nick_name_user;
    public JPasswordField txt_pass_user;
    public JButton bt_show_session,bt_register;
    public JCheckBox checkbox_pass;
    public JLabel label_title,label_txt_nickname,label_password;

    public LoginAdminClients(){
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
        bt_show_session.addActionListener(this);
        add(bt_show_session);

        bt_register = new JButton("Register");
        bt_register.setBounds(100,270,200,40);
        bt_register.setFont(new Font("Andale Mono",1,12));
        bt_register.setHorizontalAlignment(JButton.CENTER);
        bt_register.addActionListener(this);
        add(bt_register);


    }

    public static void main(String args[]) {
        InterfaceAdmin face = new InterfaceAdmin();
        face.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nickName, passWord;
        nickName = txt_nick_name_user.getText().toString();
        passWord = txt_pass_user.getText().toString();
        if(e.getSource() == bt_show_session){

           LogicLoginAdminClient user = new LogicLoginAdminClient();
           if(nickName == user.nickName && passWord == user.passWord){

           }
           txt_nick_name_user.setText(user.nickName);


        }

    }
}
