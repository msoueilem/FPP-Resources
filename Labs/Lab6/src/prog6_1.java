import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class prog6_1 extends JFrame {
        private JLabel lInput, lOutput;
        private JTextField tInput, tOutput;
        private JPanel leftPanel;
        private JPanel topRightPanel;
        private JPanel bottomRightPanel;
        private JButton countLetters;
        private JButton reverseLetters;
        private JButton removeDuplicate;

        public prog6_1(){
            initializeWindow();
            leftPanel = new JPanel();
            topRightPanel = new JPanel();
            bottomRightPanel = new JPanel();
            defineLeftPanel();
            defineRightPanel();
            JPanel rightPanel = new JPanel(new BorderLayout());
            rightPanel.add(topRightPanel, BorderLayout.NORTH);
            rightPanel.add(bottomRightPanel, BorderLayout.CENTER);
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new FlowLayout());
            mainPanel.add(leftPanel);
            mainPanel.add(rightPanel);
            getContentPane().add(mainPanel);
        }

        public static void centerFrameOnDesktop(Component f) {
            final int SHIFT_AMOUNT = 0;
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            int height = toolkit.getScreenSize().height;
            int width = toolkit.getScreenSize().width;
            int frameHeight = f.getSize().height;
            int frameWidth = f.getSize().width;
            f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
        }
        private void initializeWindow() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("String Utility");
            centerFrameOnDesktop(this);
            setSize(720, 200);
            setResizable(false);

        }

        private void defineLeftPanel() {

            tOutput = new JTextField(10);
            lOutput = new JLabel("Output :");
            bottomRightPanel.setLayout(new BorderLayout());
            bottomRightPanel.add(lOutput, BorderLayout.NORTH);
            bottomRightPanel.add(tOutput, BorderLayout.CENTER);

            tInput = new JTextField(10);
            lInput = new JLabel("Input :");
            topRightPanel.setLayout(new BorderLayout());
            topRightPanel.add(lInput, BorderLayout.NORTH);
            topRightPanel.add(tInput, BorderLayout.CENTER);

        }


        private void defineRightPanel() {
            leftPanel.setLayout(new BorderLayout());

            countLetters = new JButton("Count Letters");
            countLetters.addActionListener(new countLettersListener());
            leftPanel.add(countLetters,BorderLayout.NORTH);

            reverseLetters = new JButton("Reverse Letters");
            reverseLetters.addActionListener(new reverseLettersListener());
            leftPanel.add(reverseLetters,BorderLayout.CENTER);

            removeDuplicate = new JButton("Remove Duplicate");
            removeDuplicate.addActionListener(new removeDuplicateListener());
            leftPanel.add(removeDuplicate,BorderLayout.SOUTH);
        }

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    prog6_1 main = new prog6_1();
                    main.setVisible(true);
                }
            });
        }

    private class countLettersListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String input = tInput.getText();
            String output = input.length()+"";
            tOutput.setText(output);
        }
    }

    private class reverseLettersListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String input = tInput.getText();
            String output = "";
            for (int i = input.length() - 1; i >= 0; i--){
                output = output + input.charAt(i);
            }
            tOutput.setText(output);
        }
    }

    private class removeDuplicateListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String input = tInput.getText();
            String output = "";
            char str[] = input.toCharArray();
            int n = str.length;
            output = removeDuplicate(str,n);
            tOutput.setText(output);
        }
    }
    static String removeDuplicate(char str[], int n)
    {
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
}
