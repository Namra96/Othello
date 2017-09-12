package assignment_1;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Board_UI extends JFrame{
	
	private GameState array4x4 = new GameState();
	private JLabel lblSquares2D[][] = new JLabel[4][4]; // 2D array för lagring av
														// lablarna
	
	public Board_UI(GameState array4x4) { 
		this.array4x4 = array4x4;
	}
	
	public void TestArray4() {
		/*
		 * panel7x7 representerar den stora arrayen med de 16 elementen Till
		 * detta ändamål användes en 2D- array. En
		 * nestlad for loop användes för att gå igenom alla rader och kolumner
		 */
		JPanel panel4x4 = new JPanel();
		panel4x4.setLayout(new GridLayout(4, 4, 10, 10));
		for (int i = 0; i < 4; i++) { // för alla rader
			for (int j = 0; j < 4; j++) { // för alla kolumner
				lblSquares2D[i][j] = new JLabel("", JLabel.CENTER); // skapa en label
				lblSquares2D[i][j].setPreferredSize(new Dimension(50, 50)); // ge
																			// lablarna
																			// en
																			// storlek
				lblSquares2D[i][j].setBackground(Color.GREEN); // bakground
				lblSquares2D[i][j].setForeground(Color.WHITE);
				lblSquares2D[i][j].setOpaque(true);
				panel4x4.add(lblSquares2D[i][j]); // lägg knapparna på panelen
				panel4x4.setBorder(new EmptyBorder(5, 15, 1, 30));// Skapar
																	// utrymme
																	// mellan
																	// fönstrets
																	// kanter
																	// och
																	// panelerna
				add(panel4x4, BorderLayout.CENTER); // panelen placeras i center
													// på fönstret
			}
		}
		pack();
		setResizable(false); // gör att man ej kan ändra storlek på det skapade
								// fönstret
		setVisible(true); // gör fönstret synligt
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // gör fönstret stängbart												// stängbart
	}
	

	
	/**
	 * Körprogrammet
	 * 
	 * @param args
	 */
/*
	public static void main(String[] args) {
		GameState array4x4 = new GameState();
		TestArray4x4 t4x4 = new TestArray4x4(array4x4);
		t4x4.TestArray4();

	}
	
*/	

}
