import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class arith extends JFrame {
    private JTextField inputField1, inputField2, outputField;

    public arith() {
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel
        JPanel panel = new JPanel();

        // Create input fields
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);

        // Create output field
        outputField = new JTextField(10);
        outputField.setEditable(false); // Make output field read-only

        // Create buttons
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");

        // Add action listeners to the buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performAddition();
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSubtraction();
            }
        });

        // Add components to the panel
        panel.add(new JLabel("Input 1: "));
        panel.add(inputField1);
        panel.add(new JLabel("Input 2: "));
        panel.add(inputField2);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(new JLabel("Result: "));
        panel.add(outputField);

        // Add the panel to the frame
        add(panel);

        // Set the frame visibility
        setVisible(true);
    }

    public void performAddition() {
        try {
            int num1 = Integer.parseInt(inputField1.getText());
            int num2 = Integer.parseInt(inputField2.getText());
            int result = num1 + num2;
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            outputField.setText("Invalid input");
        }
    }

    public void performSubtraction() {
        try {
            int num1 = Integer.parseInt(inputField1.getText());
            int num2 = Integer.parseInt(inputField2.getText());
            int result = num1 - num2;
            outputField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            outputField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the calculator GUI
        new arith();
    }
}