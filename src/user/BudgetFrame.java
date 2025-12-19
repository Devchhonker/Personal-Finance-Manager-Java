package user;

import javax.swing.*;
import model.Budget;

public class BudgetFrame extends JFrame {

    public BudgetFrame() {
        setTitle("Budget Creation");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JTextField category = new JTextField(10);
        JTextField limit = new JTextField(10);
        JButton save = new JButton("Create Budget");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Category:"));
        panel.add(category);
        panel.add(new JLabel("Limit:"));
        panel.add(limit);
        panel.add(save);
        add(panel);

        save.addActionListener(e -> {
            try {
                double lim = Double.parseDouble(limit.getText());
                UserDashboard.budgets.add(new Budget(category.getText(), lim));
                JOptionPane.showMessageDialog(this, "Budget created");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid limit");
            }
        });

        setVisible(true);
    }
}
