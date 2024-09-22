import java.awt.*;
import javax.swing.*;

public class Layout {
  public static void main(String[] args){
    JFrame frame = new JFrame("User Information Form");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600,300);
    frame.setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5,5,5,5);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.anchor = GridBagConstraints.WEST;

    //firstname
    JLabel firstNameLabel = new JLabel("First Name:");
    gbc.gridx = 0;
    gbc.gridy = 0;
    frame.add(firstNameLabel,gbc);

    JTextField firstNameField = new JTextField(15);
    gbc.gridx = 1;
    gbc.gridy = 0;
    frame.add(firstNameField,gbc);

    //lastname
    JLabel lastNamLabel = new JLabel("Last Name:");
    gbc.gridx = 0;
    gbc.gridy = 1;
    frame.add(lastNamLabel,gbc);

    JTextField lastNamField = new JTextField(15);
    gbc.gridx = 1;
    gbc.gridy = 1;
    frame.add(lastNamField,gbc);

    //gender
    JLabel genderLabel = new JLabel("Gender:");
    gbc.gridx = 0;
    gbc.gridy= 2;
    frame.add(genderLabel,gbc);

    // String[] genderOptions = {,,};
    JRadioButton maleCheckBox = new JRadioButton("Male");
    gbc.gridx = 1;
    gbc.gridy = 2;
    frame.add(maleCheckBox,gbc);

    JRadioButton femaleCheckBox = new JRadioButton("Female");
    gbc.gridx = 2;
    gbc.gridy = 2;
    frame.add(femaleCheckBox,gbc);

    // JCheckBox otherCheckBox = new JCheckBox("Other");
    // gbc.gridx = 3;
    // gbc.gridy = 2;
    // frame.add(otherCheckBox,gbc);

    //birthdate
    JLabel birthdateLabel = new JLabel("Birthdate:");
    gbc.gridx = 0;
    gbc.gridy = 3;
    frame.add(birthdateLabel,gbc);


    String[] months = {"Choose a Month","January","Februrary","March","April","May","June","July","August","September","October","November","December"};
    JComboBox<String>  b = new JComboBox<>(months);
    gbc.gridx = 1;
    gbc.gridy = 3;
    frame.add(b,gbc);

    Integer[] bday = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
    JComboBox<Integer> day = new JComboBox<>(bday);
    gbc.gridx = 2;
    gbc.gridy = 3;
    frame.add(day,gbc);    

    JTextField year = new JTextField(15);
    gbc.gridx = 3;
    gbc.gridy = 3;
    frame.add(year,gbc);

    //timeZone
    JLabel timezonLabel = new JLabel("Time Zone:");
    gbc.gridx = 0;
    gbc.gridy = 4;
    frame.add(timezonLabel,gbc);

    String[] timeZones = {"Choose one","UTC-12:00", "UTC-11:00",  "UTC-10:00", "UTC-09:00", "UTC-08:00", 
     "UTC-07:00", "UTC-06:00", "UTC-05:00", "UTC-04:00", "UTC-03:00", "UTC-02:00", "UTC-01:00", "UTC±00:00", "UTC+01:00", "UTC+02:00", "UTC+03:00", "UTC+04:00", "UTC+05:00", "UTC+06:00", "UTC+07:00", "UTC+08:00", "UTC+09:00", "UTC+10:00", "UTC+11:00", "UTC+12:00"};

    JComboBox<String> timeZoneComboBox = new JComboBox<>(timeZones);
    gbc.gridx = 1;
    gbc.gridy = 4;
    frame.add(timeZoneComboBox,gbc);

    //occupation
    JLabel occupationLabel = new JLabel("Occupation:");
    gbc.gridx = 0;
    gbc.gridy = 5;
    frame.add(occupationLabel, gbc);

    String[] occ = {"Choose One","Doctor","Engineer","Pilot"};
    JComboBox<String> occComboBox = new JComboBox<>(occ);
    // JTextField occupationField = new JTextField(15);
    gbc.gridx = 1;
    gbc.gridy = 5;
    frame.add(occComboBox, gbc);

    // Submit Button
    JButton submitButton = new JButton("Submit");
    gbc.gridx = 1;
    gbc.gridy = 6;
    gbc.anchor = GridBagConstraints.CENTER;
    frame.add(submitButton, gbc);

    // Display the frame
    frame.setVisible(true);
  }
}
