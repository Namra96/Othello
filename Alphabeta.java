package assignment_1;

import java.util.List;

import test.OthelloMove;
import test.OthelloState;

public class Alphabeta {
	private boolean isMax_;
	private int depth_;
	private int moves;

	/* Contrustor */
	public Alphabeta(boolean isMax, int depth) {
		this.isMax_ = isMax;
		this.depth_ = depth;
	}

	/**
	 * In this method we get the move that the Agent will make out of the mini-max
	 * algorithm and alpha-beta pruning
	 * 
	 * @param state
	 * @return
	 */
	public OthelloMove getMove(OthelloState state) {

		int depth = depth_ - 1; // depth will go downwards
		int alpha = Integer.MIN_VALUE; // alpha has the value -inifinity from the start
		int beta = Integer.MAX_VALUE; // beta has the value +infinity from the start

		// because we dont know yet which move is the best move its good to put first
		// move as a best move
		OthelloMove bestMove = null; //

		// the best number that is choosen by mini-max algorithm
		int bestNumber = alphabeta(state.applyMoveCloning(bestMove), !isMax_, depth, alpha, beta);

		if (isMax_) {
			// update alpha based on the bestScore for the first move
			alpha = maxValue(alpha, bestNumber);

			for (int i = 1;i< moves && beta > alpha; i++) {
				// currentMove is moves that are possible for currentState
				OthelloMove currentMove = null;

				// the next values we get
				int nextScore = alphabeta(state.applyMoveCloning(currentMove), false, depth, alpha, beta);

				if (nextScore > bestNumber) {
					bestNumber = nextScore;
					bestMove = currentMove;
				}
				alpha = maxValue(alpha, bestNumber);
			}
		} else {
			// update best based on the bestScore for the first move
			beta = minvalue(beta, bestNumber);
			// note that loop is exited if beta ever becomes <= than alpha
			for (int i = 1; beta > alpha; i++) {
				// currentMove is moves that are possible for currentState
				OthelloMove currentMove = null;

				// if the score gets lower than the bestNumber, stay at the best number and the
				// best move is current move
				int nextScore = alphabeta(state.applyMoveCloning(currentMove), true, depth, alpha, beta);
				if (nextScore < bestNumber) {
					bestNumber = nextScore;
					bestMove = currentMove;
				}
				beta = minvalue(beta, bestNumber);
			}
		}

		return bestMove;
	}

	private int alphabeta(OthelloState applyMoveCloning, boolean maxPlayer, int depth, int alpha, int beta) {
		
		//if terminal state
	/*	if (depth <= 0 || gameOver )
		{
			//return minmax value
			
		} */
		depth--;
		//generatemoves
		
		//if there are no moves, then pass the move and that is the alphabeta value
		/*if (((Object) moves).isEmpty())
		{
			return alphabeta(state.applyMoveCloning(null), !maxPlayer, depth, alpha, beta);
		} */
		
		//otherwise, check each possible move and determine the highest/lowest possible value
		/*int bestScore;      
		if ( maxPlayer) {
			bestScore = Integer.MIN_VALUE;
		    	   return bestScore;
		       }
		       else {
		    	   bestScore = Integer.MAX_VALUE;
		    	   return bestScore;
		       } */
		      
		int bestScore = maxPlayer ? Integer.MIN_VALUE : Integer.MAX_VALUE;
				//note that loop is exited if beta ever becomes <= alpha
		
				for (int i = 0;  beta > alpha; i++)
				{

					//gets the next score in the searchtree
					int nextScore = alphabeta(applyMoveCloning, !maxPlayer, depth, alpha, beta);
					
					if (maxPlayer)
					{
						bestScore = maxValue(bestScore, nextScore);
						alpha = maxValue(alpha, bestScore);
					}
					else
					{
						bestScore = minvalue(bestScore, nextScore);
						beta = minvalue(beta, bestScore);
					}
				}
				
				return bestScore;
			}
		


	private int maxValue(int a, int b) {
		if(a > b)
		    return a;
		else
		    return b;

	}

	public int minvalue(int a, int b) {
		if(a < b)
		    return a;
		else
		    return b;
	}
}
