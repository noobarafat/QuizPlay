import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 100, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>" +

                        "1. Eligibility: The quiz is open to all participants who meet the specified criteria."
                        + "<br><br>" +
                        "2. Registration: Participants may be required to register for the quiz by providing accurate and complete information, such as name, email address, etc."
                        + "<br><br>" +
                        "3. Timing: The quiz will be conducted within a specified time period. Late entries may not be accepted."
                        + "<br><br>" +
                        "4. Answers: Participants must submit their answers within the given time limit. Once submitted, answers cannot be changed."
                        + "<br><br>" +
                        "5. Technical Issues: In case of any technical glitches or connectivity problems, the organizers will make a fair judgment to resolve the issue."
                        + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing wrong "
                        + "<br><br>" +
                        "7. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}