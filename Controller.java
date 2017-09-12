package assignment_1;

import test.OthelloMove;
import test.OthelloState;

public class Controller {
	private Viewer_UI viewer;
	private MiniMaxAgent computerAgent;
	
	private int humanAgentScore = 0; 
	private int computerAgentScore = 0;
	
	public Controller(MiniMaxAgent computerAgent, Viewer_UI viewer) {
		this.viewer = viewer;
		this.computerAgent = computerAgent;

	}
	public void whoIsToWin(int userInput, int computerInput) { 
		if( userInput > computerInput) {
			humanAgentScore++;
		}
		else if(computerInput > userInput) {
			computerAgentScore++;
		}
		
		else if(computerInput == userInput) {
			humanAgentScore++;
			computerAgentScore++;
		}
			
		else if(userInput == computerInput) {
			humanAgentScore++;
			computerAgentScore++;
		}
		
		viewer.setHumPointLabel(humanAgentScore); // dina poäng sammanställs 
		viewer.setComPointLabel(computerAgentScore); // datorns poäng sammanställs 
	}
	
	public void winner(int userInput) { 
		int computerInput = computerAgent.makeAmove();
		whoIsToWin(userInput, computerInput); // Metod som ser vem som vann rundan
		if(humanAgentScore > computerAgentScore) 
			{
				viewer.setLblText("You win!");
			}
		else if(computerAgentScore > humanAgentScore)
			{
				viewer.setLblText("The computer Agent wins!");
			}
		else if(computerAgentScore == humanAgentScore) 
			{ 
				viewer.setLblText("Its a tie!");
			}
	}
	
	

	
}
