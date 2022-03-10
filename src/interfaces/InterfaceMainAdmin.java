package interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMainAdmin extends JFrame implements ActionListener {

    public JButton bt_status_clients,bt_edit_perfil;

    public InterfaceMainAdmin(){
        setLayout(null);
        setSize(600,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Main Principal Admin");


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new InterfaceMainAdmin().setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
