package assignment_1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Viewer_UI extends JPanel {
	private JLabel lblTxt = new JLabel("The one with the most disks wins", SwingConstants.CENTER); // SwingConstants gör så att texten hamnar i mitten = centrerar text
	private JLabel lblHuman = new JLabel("Human", SwingConstants.CENTER); 
	private JLabel lblComp = new JLabel("Computer", SwingConstants.CENTER); 
	private JLabel CompPoint = new JLabel("0", SwingConstants.CENTER);
	private JLabel HumPoint = new JLabel("0", SwingConstants.CENTER);
	
	private Font fontlabel = new Font( "SansSerif", Font.PLAIN, 18 );
	
	public Viewer_UI() {
		setLayout(new BorderLayout()); // väljer en border- layout
		setPreferredSize(new Dimension(300,200)); // Gör fönstret 300 pixlar brett och höjden 200 pixlar 

		lblTxt.setPreferredSize( new Dimension( 100, 20 ) ); // ger labeln bredden 100 pixlar, och höjden 20 pixlar
		lblTxt.setFont( fontlabel ); // labelns font sätts till det skapade font-objektet 
		add(lblTxt, BorderLayout.NORTH); // väljer positionen norr

		// Panel med användarens olika labels + storleken på labels
		JPanel humPanel = new JPanel(new GridLayout(3,1)); // GridLayout med 3 rader och 1 kolumn
		
		lblHuman.setPreferredSize( new Dimension( 100, 20 ) ); 
		lblHuman.setFont( fontlabel ); 
		humPanel.add( lblHuman ); // lblHuman läggs i första raden i GridLayouten
		
		HumPoint.setPreferredSize( new Dimension( 100, 20 ) ); 
		HumPoint.setFont( fontlabel ); 
		humPanel.add(HumPoint); // HumPoint läggs i andra raden i GridLayouten
		
		// Panel med datorns olika labels + storlek på labels
				JPanel comPanel = new JPanel(new GridLayout(3,1)); // GridLayout med 3 rader och 1 kolumn
				lblComp.setPreferredSize( new Dimension( 100, 20 ) );
				lblComp.setFont( fontlabel );
				comPanel.add( lblComp );

				CompPoint.setPreferredSize( new Dimension( 100, 20 ) ); 
				CompPoint.setFont( fontlabel ); 
				comPanel.add( CompPoint );
				
				add(humPanel, BorderLayout.WEST); // Lägger till humPanel i den vänstra delen av fönstret
				add(comPanel, BorderLayout.EAST); // Lägger till comPanel i den högra delen av fönstret
	}
	
	/** 
	 * I de olika metoderna uppdateras textinnehållet för de olika labels 
	 * @param text
	 */
	public void setHumPointLabel(int userScore) {
		this.HumPoint.setText(Integer.toString(userScore)); // Uppdaterar text-innehållet för label HumPoint
	}

	public void setComPointLabel(int computerScore) {
		this.CompPoint.setText(Integer.toString(computerScore)); // Uppdaterar text-innehållet för label ComPoint
	}

	public void setLblText(String text) {
		this.lblTxt.setText(text); // Uppdaterar text-innehållet för label lblTxt
	}

}









