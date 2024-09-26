package lab5;

import javax.swing.*;
import java.awt.*;

public class UserForm extends JFrame {

    private JTextField nameFld = new JTextField(20), phoneFld = new JTextField(20);
    private JTextArea addrFld = new JTextArea(5, 20), outFld = new JTextArea(10, 30);
    private JRadioButton maleRb = new JRadioButton("Male"), femaleRb = new JRadioButton("Female");
    private JComboBox<String> countryCmb = new JComboBox<>(new String[]{"Select Country", "Nepal", "China", "India"});
    private JCheckBox musicCb = new JCheckBox("Music"), sportsCb = new JCheckBox("Sports");
    private JButton submitBtn = new JButton("Submit");

    public UserForm() {
        setTitle("User Form");
        setSize(600, 600);  // Increased size of the frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRb);
        genderGroup.add(femaleRb);

        // Add form components using helper method to reduce repetition
        addComp(new JLabel("*Name:"), 0, 0, gbc);
        addComp(nameFld, 1, 0, gbc);
        addComp(new JLabel("*Phone:"), 0, 1, gbc);
        addComp(phoneFld, 1, 1, gbc);
        addComp(new JLabel("Address:"), 0, 2, gbc);
        addComp(new JScrollPane(addrFld), 1, 2, gbc);
        addComp(new JLabel("Gender:"), 0, 3, gbc);
        addComp(createPanel(maleRb, femaleRb), 1, 3, gbc);
        addComp(new JLabel("Country:"), 0, 4, gbc);
        addComp(countryCmb, 1, 4, gbc);
        addComp(new JLabel("Hobbies:"), 0, 5, gbc);
        addComp(createPanel(musicCb, sportsCb), 1, 5, gbc);
        addComp(submitBtn, 1, 6, gbc);
        gbc.gridwidth = 2;
        gbc.gridy = 7;
        add(new JScrollPane(outFld), gbc);
        outFld.setEditable(false);

        // Increased the dimensions of the text area
        outFld.setPreferredSize(new Dimension(500, 150));

        // Submit button logic
        submitBtn.addActionListener(e -> handleSubmit());

        setVisible(true);
    }

    // Helper method to simplify component addition to GridBagLayout
    private void addComp(JComponent comp, int x, int y, GridBagConstraints gbc) {
        gbc.gridx = x;
        gbc.gridy = y;
        add(comp, gbc);
    }

    // Method to create a panel for grouping components
    private JPanel createPanel(JComponent... comps) {
        JPanel panel = new JPanel();
        for (JComponent comp : comps) panel.add(comp);
        return panel;
    }

    // Form submission and validation
    private void handleSubmit() {
        if (nameFld.getText().trim().isEmpty() || phoneFld.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name and Phone are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String gender = maleRb.isSelected() ? "Male" : femaleRb.isSelected() ? "Female" : "Not specified";
        String hobbies = (musicCb.isSelected() ? "Music " : "") +
                (sportsCb.isSelected() ? "Sports " : "");
        outFld.setText(String.format("Name: %s\nPhone: %s\nAddress: %s\nGender: %s\nCountry: %s\nHobbies: %s",
                nameFld.getText(), phoneFld.getText(), addrFld.getText(),
                gender, countryCmb.getSelectedItem(), hobbies.trim()));
    }

    public static void main(String[] args) {
        new UserForm();
    }
}