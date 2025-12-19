package admin;

import javax.swing.*;

public class AdminDashboard extends JFrame {

    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton userBtn = new JButton("User Management");
        JButton securityBtn = new JButton("Financial Data Security");
        JButton settingsBtn = new JButton("System Settings");

        JPanel panel = new JPanel();
        panel.add(userBtn);
        panel.add(securityBtn);
        panel.add(settingsBtn);
        add(panel);

        userBtn.addActionListener(e -> new UserManagementFrame());
        securityBtn.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Security updated successfully"));
        settingsBtn.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "System settings saved"));

        setVisible(true);
    }
}
