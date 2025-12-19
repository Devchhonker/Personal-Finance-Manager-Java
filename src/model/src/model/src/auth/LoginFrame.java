package auth;

import javax.swing.*;
import admin.AdminDashboard;
import user.UserDashboard;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Finance Manager - Login");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField username = new JTextField(15);
        JComboBox<String> roleBox = new JComboBox<>(new String[]{"Admin", "User"});
        JButton loginBtn = new JButton("Login");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Username:"));
        panel.add(username);
        panel.add(new JLabel("Role:"));
        panel.add(roleBox);
        panel.add(loginBtn);
        add(panel);

        loginBtn.addActionListener(e -> {
            if (username.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username required");
                return;
            }
            dispose();
            if (roleBox.getSelectedItem().equals("Admin"))
                new AdminDashboard();
            else
                new UserDashboard();
        });

        setVisible(true);
    }
}
