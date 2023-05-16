package Java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame {

    private JTextField num1Field, num2Field ,sumField;
    private JButton calculateButton, closeButton;
    

    public Calc() {
        setTitle("Sum Calculator");
       setSize(300 , 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
       panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Number 1:"));
        num1Field = new JTextField();
        panel.add(num1Field);

        panel.add(new JLabel("Number 2:"));
        num2Field = new JTextField();
        panel.add(num2Field);

        panel.add(new JLabel("Sum:"));
        sumField = new JTextField();
        panel.add(sumField);

        calculateButton = new JButton("Sum");
        panel.add(calculateButton);

        closeButton = new JButton("Close");
        panel.add(closeButton);


        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result= num1 + num2;
                
                sumField.setText(""+result);
            }
        });
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // dispose();
                System.exit(0);
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        Calc calculator = new Calc();
        calculator.setVisible(true);
    }
}