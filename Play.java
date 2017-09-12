package assignment_1;

import javax.swing.JFrame;

public class Play {
	public static void main(String[] args) {

	//    ComputerAgent computerplayer = new ComputerAgent();
		Viewer_UI viewer = new Viewer_UI();
		
	
//		Controller controller = new Controller(computerplayer, viewer);
	//	HumanAgent userInput = new HumanAgent(controller);
		
		JFrame frame_viewer = new JFrame("Viewer");
		frame_viewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		frame_viewer.add(viewer);
		frame_viewer.pack();
		frame_viewer.setVisible(true);
		
		GameState array4x4 = new GameState();
		Board_UI t4x4 = new Board_UI(array4x4);
		t4x4.TestArray4();
		
		
		

	}

}
