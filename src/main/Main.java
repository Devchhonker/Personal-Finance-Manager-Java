package main;

import javax.swing.SwingUtilities;
import auth.LoginFrame;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
}
