import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog6_2 extends JFrame {
    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel buttomPanel;
    private JTextField tName,tStreet,tCity, tState, tZip;
    private JLabel lName,lStreet,lCity, lState, lZip;
    private JButton bSubmit;

    public prog6_2(){
        initializeWindow();
        topPanel = new JPanel();
        middlePanel = new JPanel();
        buttomPanel = new JPanel();
        defineTopPanel();
        defineMiddlePanel();
        defineButtonPanel();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(middlePanel, BorderLayout.CENTER);
        mainPanel.add(buttomPanel, BorderLayout.SOUTH);
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
        setTitle("Address Form");
        centerFrameOnDesktop(this);
        setSize(720, 200);
        setResizable(false);

    }

    private void defineTopPanel() {

        topPanel.setLayout(new FlowLayout());
        tName = new JTextField(10);
        lName = new JLabel("Name :");
        JPanel namePanel = new JPanel();
        namePanel.setLayout(new BorderLayout());
        namePanel.add(lName, BorderLayout.NORTH);
        namePanel.add(tName, BorderLayout.CENTER);
        topPanel.add(namePanel);

        tStreet = new JTextField(10);
        lStreet = new JLabel("Street :");
        JPanel streetPanel = new JPanel();
        streetPanel.setLayout(new BorderLayout());
        streetPanel.add(lStreet, BorderLayout.NORTH);
        streetPanel.add(tStreet, BorderLayout.CENTER);
        topPanel.add(streetPanel);

        tCity = new JTextField(10);
        lCity = new JLabel("City :");
        JPanel cityPanel = new JPanel();
        cityPanel.setLayout(new BorderLayout());
        cityPanel.add(lCity, BorderLayout.NORTH);
        cityPanel.add(tCity, BorderLayout.CENTER);
        topPanel.add(cityPanel);
    }

    private void defineMiddlePanel() {

        middlePanel.setLayout(new FlowLayout());
        tState = new JTextField(10);
        lState = new JLabel("State :");
        JPanel statePanel = new JPanel();
        statePanel.setLayout(new BorderLayout());
        statePanel.add(lState, BorderLayout.NORTH);
        statePanel.add(tState, BorderLayout.CENTER);
        middlePanel.add(statePanel);

        tZip = new JTextField(10);
        lZip = new JLabel("Zip :");
        JPanel zipPanel = new JPanel();
        zipPanel.setLayout(new BorderLayout());
        zipPanel.add(lZip, BorderLayout.NORTH);
        zipPanel.add(tZip, BorderLayout.CENTER);
        middlePanel.add(zipPanel);
    }


    private void defineButtonPanel() {
        buttomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        bSubmit = new JButton("Submit");
        bSubmit.addActionListener(new MyButtonListener());
        buttomPanel.add(bSubmit);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                prog6_2 main = new prog6_2();
                main.setVisible(true);
            }
        });
    }
    class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String name = tName.getText();
            String street = tStreet.getText();
            String city = tCity.getText();
            String state = tState.getText();
            String zip = tZip.getText();
            final String error = "type here...";
            if (name.isEmpty()) {
                tName.setText(error);
                System.out.println("Name is empty, please "+error);
            }
            if (street.isEmpty()) {
                tStreet.setText(error);
                System.out.println("Street is empty, please "+error);
            }
            if (city.isEmpty()) {
                tCity.setText(error);
                System.out.println("City is empty, please "+error);
            }
            if (state.isEmpty()) {
                tState.setText(error);
                System.out.println("State is empty, please "+error);
            }
            if (zip.isEmpty()) {
                tZip.setText(error);
                System.out.println("Zip is empty, please "+error);
            }
            else {
                String format = "%s\n" +
                        "%s\n" +
                        "%s, %s %s";
                String result = String.format(format,name,street,city,state,zip);
                System.out.println("Address Form\n\n"+result);
            }
        }
    }
}
