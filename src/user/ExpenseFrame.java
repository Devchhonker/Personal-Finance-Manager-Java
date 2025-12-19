package user;

import javax.swing.*;
import model.Expense;

public class ExpenseFrame extends JFrame {

    public ExpenseFrame() {
        setTitle("Expense Tracking");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JTextField amount = new JTextField(10);
        JTextField category = new JTextField(10);
        JButton save = new JButton("Save Expense");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Amount:"));
        panel.add(amount);
        panel.add(new JLabel("Category:"));
        panel.add(category);
        panel.add(save);
        add(panel);

        save.addActionListener(e -> {
            try {
                double amt = Double.parseDouble(amount.getText());
                UserDashboard.expenses.add(new Expense(amt, category.getText()));
                JOptionPane.showMessageDialog(this, "Expense saved");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid amount");
            }
        });

        setVisible(true);
    }
}
