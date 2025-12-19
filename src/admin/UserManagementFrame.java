package admin;

import javax.swing.*;

public class UserManagementFrame extends JFrame {

    public UserManagementFrame() {
        setTitle("User Management");
        setSize(350, 250);
        setLocationRelativeTo(null);

        JTextField name = new JTextField(10);
        JTextField email = new JTextField(10);
        JComboBox<String> role = new JComboBox<>(new String[]{"Admin", "User"});
        JButton addBtn = new JButton("Add User");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        panel.add(name);
        panel.add(new JLabel("Email:"));
        panel.add(email);
        panel.add(new JLabel("Role:"));
        panel.add(role);
        panel.add(addBtn);
        add(panel);

        addBtn.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "User added successfully"));

        setVisible(true);
    }
}
