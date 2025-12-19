package user;

import javax.swing.*;
import java.util.ArrayList;
import model.*;

public class UserDashboard extends JFrame {

    public static ArrayList<Expense> expenses = new ArrayList<>();
    public static ArrayList<Budget> budgets = new ArrayList<>();
    public static ArrayList<Goal> goals = new ArrayList<>();

    public UserDashboard() {
        setTitle("User Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton expenseBtn = new JButton("Expense Tracking");
        JButton budgetBtn = new JButton("Budget Creation");
        JButton goalBtn = new JButton("Financial Goals");

        JPanel panel = new JPanel();
        panel.add(expenseBtn);
        panel.add(budgetBtn);
        panel.add(goalBtn);
        add(panel);

        expenseBtn.addActionListener(e -> new ExpenseFrame());
        budgetBtn.addActionListener(e -> new BudgetFrame());
        goalBtn.addActionListener(e -> new GoalFrame());

        setVisible(true);
    }
}
