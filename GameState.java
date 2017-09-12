package assignment_1;

public class GameState {
	
	private int[][] array4x4;
	
	
	/**
	 * This constructor initializes the 2D array with 0
	 */
	public GameState() {
		array4x4 = new int[4][4];
	}
	
	/* //true if the cell described by the coordinates x & y is empty
	public boolean isCellEmpty(int x, int y) {
		return array4x4[x][y] = 
	}
	*/
	
	/*  //true if the cell described by the coordinates x & y contains a black disk
	 * public boolean isCellBlack(int x, int y) { 
	 * 	return array4x4[x][y] = 
	 * }
	 */
	
	/* //true if the cell described by the coordinates x & y contains a white disk
	 * public boolean isCellWhite(int x, int y) { 
	 * 	return array4x4[x][y] = 
	 * }
	 */
	
	/**
	 * This method sets an element in the 2D arrray
	 * @param row specifies in which row we want to make the change 
	 * @param col specifies in which column we want to make the change 
	 * @param value sets a value to the specified column
	 */
	public void placeDisk(int row, int col, int value) {
		array4x4[row][col] = value;
	}

	/**
	 * Return the element in a specific column 
	 * @param row specifies in which row we want to get the element from
	 * @param col specifies in which column we want to get the element from
	 * @return element(that is the disk)
	 */
	public int getElement(int row, int col) {
		return array4x4[row][col];
	}

	/**
	 * Overwrites a row with a new one. We are "occupying" a disk in a row.
	 * @param row specifies which row needs to be overwritten with a new row
	 * @param arr the new row we want to set 
	 */
	public void setRow(int row, int[] arr) {
		for (int column = 0; column < array4x4[row].length; column++) {
			 array4x4[row][column] = arr[column];
		}
	}

	/**
	 * Returns a row from the 2D array
	 * @param row the row we want to read
	 * @return the row we red gets returned
	 */
	public int[] getRow(int row) {
		int[] tempArr = new int[array4x4.length];
		for (int column = 0; column < array4x4.length; column++) {
			tempArr[column] = array4x4[row][column];
		}
		return tempArr;
	}

	/**
	 * Overwrites a column with a new one. We are "occupying" a disk in a column.
	 * @param col specifies which column needs to be overwritten with a new column
	 * @param arr the new column we want to set 
	 */
	public void setCol(int col, int[] arr) {
		for (int row = 0; row < array4x4.length; row++) {
			array4x4[row][col] = arr[row];
		}
	}

	/**
	 * Returns a column from the 2D array.
	 * @param col the column we want to read
	 * @return the column we read gets returned
	 */
	public int[] getCol(int col) {
		int[] tempArr = new int[array4x4.length];
		for (int row = 0; row < array4x4.length; row++) {
			tempArr[row] = array4x4[row][col];
		}
		return tempArr;
	}
	

	/**
	 * Returns a 2D array filled with 0
	 * @return a 2D array filled with 0 
	 */
	public int[][] zeroArray7x7(){
		int[][] temp2D = new int[array4x4.length][array4x4[0].length];
		for(int i=0; i<array4x4.length;i++){
			for(int j=0; j<array4x4[i].length;j++){
				temp2D[i][j] = 0;
			}
		}
		return temp2D;
	}
}






