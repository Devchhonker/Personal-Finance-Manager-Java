package user;

import javax.swing.*;
import model.Goal;

public class GoalFrame extends JFrame {

    public GoalFrame() {
        setTitle("Financial Goals");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JTextField goal = new JTextField(10);
        JTextField amount = new JTextField(10);
        JButton save = new JButton("Save Goal");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Goal:"));
        panel.add(goal);
        panel.add(new JLabel("Target Amount:"));
        panel.add(amount);
        panel.add(save);
        add(panel);

        save.addActionListener(e -> {
            try {
                double amt = Double.parseDouble(amount.getText());
                UserDashboard.goals.add(new Goal(goal.getText(), amt));
                JOptionPane.showMessageDialog(this, "Goal saved");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid amount");
            }
        });

        setVisible(true);
    }
}
