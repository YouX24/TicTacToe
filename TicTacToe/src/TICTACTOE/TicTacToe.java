package TICTACTOE;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe {

	static ImageIcon icon = new ImageIcon("tictactoe.png");
	static String xo = "X";
	static String[] options = {"Yes", "No"};
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setIconImage(icon.getImage());
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(3, 3));
		frame.setLocationRelativeTo(null);
		
		JButton first = new JButton("");
		JButton second = new JButton("");
		JButton third = new JButton("");
		JButton fourth = new JButton("");
		JButton fifth = new JButton("");
		JButton sixth = new JButton("");
		JButton seventh = new JButton("");
		JButton eighth = new JButton("");
		JButton ninth = new JButton("");
		
		frame.add(first);
		frame.add(second);
		frame.add(third);
		frame.add(fourth);
		frame.add(fifth);
		frame.add(sixth);
		frame.add(seventh);
		frame.add(eighth);
		frame.add(ninth);
		
		first.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	buttonWhenPressed(first, xo);
		    	if (xo.equals("X")) {
		    		xo = "O";
		    	}
		    	else {
		    		xo = "X";
		    	}
		    	winCondition(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, frame);
		    }
		   
		});
		
		second.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	buttonWhenPressed(second, xo);
		    	if (xo.equals("X")) {
		    		xo = "O";
		    	}
		    	else {
		    		xo = "X";
		    	}
		    	winCondition(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, frame);
		    }
		});
		
		third.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	buttonWhenPressed(third, xo);
		    	if (xo.equals("X")) {
		    		xo = "O";
		    	}
		    	else {
		    		xo = "X";
		    	}
		    	winCondition(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, frame);
		    }
		});
		
		fourth.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	buttonWhenPressed(fourth, xo);
		    	if (xo.equals("X")) {
		    		xo = "O";
		    	}
		    	else {
		    		xo = "X";
		    	}
		    	winCondition(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, frame);
		    }
		});
		
		fifth.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	buttonWhenPressed(fifth, xo);
		    	if (xo.equals("X")) {
		    		xo = "O";
		    	}
		    	else {
		    		xo = "X";
		    	}
		    	winCondition(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, frame);
		    }
		});

		sixth.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	buttonWhenPressed(sixth, xo);
		    	if (xo.equals("X")) {
		    		xo = "O";
		    	}
		    	else {
		    		xo = "X";
		    	}
		    	winCondition(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, frame);
		    }
		});
		
		
		seventh.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	buttonWhenPressed(seventh, xo);
		    	if (xo.equals("X")) {
		    		xo = "O";
		    	}
		    	else {
		    		xo = "X";
		    	}
		    	winCondition(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, frame);
		    }
		});
		
		eighth.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	buttonWhenPressed(eighth, xo);
		    	if (xo.equals("X")) {
		    		xo = "O";
		    	}
		    	else {
		    		xo = "X";
		    	}
		    	winCondition(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, frame);
		    }
		});
		
		ninth.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	buttonWhenPressed(ninth, xo);
		    	if (xo.equals("X")) {
		    		xo = "O";
		    	}
		    	else {
		    		xo = "X";
		    	}
		    	winCondition(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, frame);
		    }
		});
		
	}
	
	// Changes Set Text to a Button When Pressed
	public static void buttonWhenPressed(JButton b, String letter) {
		b.setFont(new Font("Comic Sans", Font.BOLD, 125));
		b.setText(letter);
		b.setFocusable(false);
		b.setEnabled(false);
	}
	
	
	// Method To Decide if there is a winner
	public static void winCondition(JButton one, JButton two, JButton three, JButton four, JButton five, JButton six, JButton seven, JButton eight, JButton nine, JFrame frame) {
		
		// X win condition
		
		if (one.getText().equals("X") && two.getText().equals("X") && three.getText().equals("X")) {
			int opt = JOptionPane.showOptionDialog(null, "Player X Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (one.getText().equals("X") && five.getText().equals("X") && nine.getText().equals("X")) {
			int opt = JOptionPane.showOptionDialog(null, "Player X Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (four.getText().equals("X") && five.getText().equals("X") && six.getText().equals("X")) {
			int opt = JOptionPane.showOptionDialog(null, "Player X Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (seven.getText().equals("X") && eight.getText().equals("X") && nine.getText().equals("X")) {
			int opt = JOptionPane.showOptionDialog(null, "Player X Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (one.getText().equals("X") && four.getText().equals("X") && seven.getText().equals("X")) {
			int opt = JOptionPane.showOptionDialog(null, "Player X Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (two.getText().equals("X") && five.getText().equals("X") && eight.getText().equals("X")) {
			int opt = JOptionPane.showOptionDialog(null, "Player X Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (three.getText().equals("X") && six.getText().equals("X") && nine.getText().equals("X")) {
			int opt = JOptionPane.showOptionDialog(null, "Player X Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (three.getText().equals("X") && five.getText().equals("X") && seven.getText().equals("X")) {
			int opt = JOptionPane.showOptionDialog(null, "Player X Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		
		// O win condition
		
		else if (one.getText().equals("O") && two.getText().equals("O") && three.getText().equals("O")) {
			int opt = JOptionPane.showOptionDialog(null, "Player O Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (one.getText().equals("O") && five.getText().equals("O") && nine.getText().equals("O")) {
			int opt = JOptionPane.showOptionDialog(null, "Player O Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (four.getText().equals("O") && five.getText().equals("O") && six.getText().equals("O")) {
			int opt = JOptionPane.showOptionDialog(null, "Player O Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (seven.getText().equals("O") && eight.getText().equals("O") && nine.getText().equals("O")) {
			int opt = JOptionPane.showOptionDialog(null, "Player O Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (one.getText().equals("O") && four.getText().equals("O") && seven.getText().equals("O")) {
			int opt = JOptionPane.showOptionDialog(null, "Player O Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (two.getText().equals("O") && five.getText().equals("O") && eight.getText().equals("O")) {
			int opt = JOptionPane.showOptionDialog(null, "Player O Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (three.getText().equals("O") && six.getText().equals("O") && nine.getText().equals("O")) {
			int opt = JOptionPane.showOptionDialog(null, "Player O Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		else if (three.getText().equals("O") && five.getText().equals("O") && seven.getText().equals("O")) {
			int opt = JOptionPane.showOptionDialog(null, "Player O Wins!\nWould you like to restart?", "Winner Winner Chicken Dinner!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
		
		// Tie condition
		
		else if (!one.getText().equals("") && !one.getText().equals("") && !two.getText().equals("") && !three.getText().equals("") && !four.getText().equals("") && !five.getText().equals("") && !six.getText().equals("") && !seven.getText().equals("") && !eight.getText().equals("") && !nine.getText().equals("")) {
			int opt = JOptionPane.showOptionDialog(null, "Its a Tie!\nWould you like to restart?", "Its a Tie!!!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, 0);
			restart(one, two, three, four, five, six, seven, eight, nine, frame, opt);
		}
	}
	
	public static void restart(JButton one, JButton two, JButton three, JButton four, JButton five, JButton six, JButton seven, JButton eight, JButton nine, JFrame frame, int option) {
		if (option == 0) {
			one.setText("");
			two.setText("");
			three.setText("");
			four.setText("");
			five.setText("");
			six.setText("");
			seven.setText("");
			eight.setText("");
			nine.setText("");
			
			one.setEnabled(true);
			two.setEnabled(true);
			three.setEnabled(true);
			four.setEnabled(true);
			five.setEnabled(true);
			six.setEnabled(true);
			seven.setEnabled(true);
			eight.setEnabled(true);
			nine.setEnabled(true);
		}
		else {
			frame.dispose();
		}
	}
}
