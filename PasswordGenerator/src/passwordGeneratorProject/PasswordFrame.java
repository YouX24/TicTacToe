package passwordGeneratorProject;

import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class PasswordFrame extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton generateButton = new JButton();
	JCheckBox lowerCaseLetters = new JCheckBox();
	JCheckBox upperCaseLetters = new JCheckBox();
	JCheckBox numbers = new JCheckBox();
	JCheckBox special = new JCheckBox();
	JTextField length = new JTextField();
	
	PasswordFrame() {
		
		this.setLayout(new GridLayout(7,1));
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
		
		lowerCaseLetters.setText("a-z");
		upperCaseLetters.setText("A-Z");
		numbers.setText("0-9");
		special.setText("Special Charaters");
		
		
		// TITLE SECTION
		JLabel titleLabel = new JLabel("Password Generator");
		titleLabel.setFont(new Font("Verdana", Font.BOLD, 25));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setVerticalAlignment(JLabel.CENTER);
		
		
		// LENGTH SECTION
//		JSpiinerJSpinner spin = new JSpinner();
		JPanel lengthPanel = new JPanel();
		lengthPanel.setLayout(new BorderLayout());
		
		JLabel lengthText = new JLabel("Length: ");
		lengthText.setHorizontalAlignment(JLabel.CENTER);
		
		lengthPanel.add(lengthText, BorderLayout.WEST);
		lengthPanel.add(length);
		
		
		// GENERATE BUTTON SECTION
		generateButton.setText("Generate");
		generateButton.setFocusable(false);
		generateButton.addActionListener(this);
		
		
		// ADD TO FRAME
		this.add(titleLabel);
		this.add(lowerCaseLetters);
		this.add(upperCaseLetters);
		this.add(numbers);
		this.add(special);
		this.add(lengthPanel);
		this.add(generateButton);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == generateButton) {
			generatePasswordConditions();
		}
		
	}
	
	public void generatePasswordConditions() {
		
		int len = 0;
		boolean lowerLetterSelected = false;
		boolean upperLetterSelected = false;
		boolean numberSelected = false;
		boolean specialSelected = false;
		
		if (lowerCaseLetters.isSelected()) {
			lowerLetterSelected = true;
		}
		if (upperCaseLetters.isSelected()) {
			upperLetterSelected = true;
		}
		if (numbers.isSelected()) {
			numberSelected = true;
		}
		if (special.isSelected()) {
			specialSelected = true;
		}
		if (!length.getText().equals("")) {
			try {
				len = Integer.parseInt(length.getText());
				try {
					passwordGenerator(lowerLetterSelected, upperLetterSelected, numberSelected, specialSelected, len);
				}
				catch (Exception e) {
					JOptionPane.showOptionDialog(null, "Please Have at Least One Option Selcted.", "!!!ERROR!!!", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, null, 0);
				}
			}
			catch (Exception e){
				JOptionPane.showOptionDialog(null, "Please Enter a Number in \"Length\" Section.", "!!!ERROR!!!", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, null, 0);
				
			}
		}
		else {
			JOptionPane.showOptionDialog(null, "Please Enter a Number in \"Length\" Section.", "!!!noting!!!", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, null, 0);
		}

	}
	
	public void passwordGenerator(boolean lowLetters, boolean uppLetters, boolean numbers, boolean special, int passLength) {
		
		char[] lowerCaseAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] upperCaseAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char[] special_characters = {'~', '\'', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '{', '}', '[', ']', '|', '\\', '/', ':', ';', '"', '\'', '<', '>', ',', '.', '?'};
		int[] numbersArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		String generatedPass = "";
		
		Random rand = new Random();
		
		ArrayList<Integer> randomSelect = new ArrayList<>();
		
		// 1 = true letters
		// 2 = true numbers
		// 3 = true special
		
		if (lowLetters == true) {
			randomSelect.add(1);
		}
		if (uppLetters == true) {
			randomSelect.add(2);
		}
		if (numbers == true) {
			randomSelect.add(3);
		}
		if (special == true) {
			randomSelect.add(4);
		}
		
		for (int i = 0; i < passLength; i++) {
			int n = randomSelect.get(rand.nextInt(randomSelect.size()));
			System.out.println(n);
			if (n == 1) {
				generatedPass += lowerCaseAlphabet[rand.nextInt(lowerCaseAlphabet.length)];
			}
			if (n == 2) {
				generatedPass += upperCaseAlphabet[rand.nextInt(upperCaseAlphabet.length)];
			}
			if (n == 3) {
				generatedPass += numbersArray[rand.nextInt(numbersArray.length)];
			}
			if (n == 4) {
				generatedPass += special_characters[rand.nextInt(special_characters.length)];
			}
		}
		
		JTextArea textArea = new JTextArea(generatedPass);
		textArea.setEditable(false);
		
		JOptionPane.showOptionDialog(null, textArea, "Password", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 0);
	}
}
