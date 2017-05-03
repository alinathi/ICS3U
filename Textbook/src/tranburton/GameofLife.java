package tranburton;
/** Game of Life
 * April 7th
 * @author Alina Tran-Burton
 */
import java.util.Scanner;
public class GameofLife {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int[][] arr = new int[20][20];
		String nextDay;
		System.out.println("Enter the amount of alive cells");
		int numAliveCells = sc.nextInt();
		int row;
		int coloumn;
		System.out.println("Enter the coordinates of the alive cells");
		for (int x = 1; x <= numAliveCells; x++) {
			System.out.println("Enter x coordinate from (0-20)");
			coloumn = sc.nextInt();
			System.out.println("Enter y coordinate from (0-20)");
			row = sc.nextInt();
			arr[row][coloumn] = 1;
		}
		System.out.println("Original:\n\n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		sc.nextLine();
		do {
			int[][] newGrid = new int[20][20];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					//if the cell is alive cell will stay alive new generation
					if (isCellAlive(arr, i, j)) {
						newGrid[i][j] = 1;
					} else {
						newGrid[i][j] = 0;
					}
				}
			}
			arr = newGrid;
			System.out.println("Next Day:\n\n");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("Continue to to the next day? (Type 'yes' or 'no')");
			nextDay = sc.nextLine();
		} while (nextDay.equalsIgnoreCase("yes"));
	}
	private static boolean isCellAlive(int[][] coordinates, int row, int column) {
		//if the cell is alive
		boolean cellAlive = coordinates[row][column] == 1;
		int numberOfNeighbours = 0;
		//check one to the right of col
		if (coordinates[row].length > column + 1) {
			if (coordinates[row][column + 1] == 1) {
				numberOfNeighbours++;
			}
		}
		//check one to the left of col
		if (coordinates[row].length > column - 1 && column - 1 >= 0) {
			if (coordinates[row][column - 1] == 1) {
				numberOfNeighbours++;
			}
		}
		//check one above col
		if (coordinates.length > row - 1 && row - 1 >= 0) {
			if (coordinates[row - 1][column] == 1) {
				numberOfNeighbours++;
			}
		}
		//check one below col
		if (coordinates.length > row + 1) {
			if (coordinates[row + 1][column] == 1) {
				numberOfNeighbours++;
			}
		}
		//check one top left diagonal to col
		if (coordinates.length > row - 1 && coordinates[row].length > column - 1 && row - 1 >= 0 && column - 1 >= 0) {
			if (coordinates[row - 1][column - 1] == 1) {
				numberOfNeighbours++;
			}
		}
		//check one top right diagonal to col
		if (coordinates.length > row - 1 && coordinates[row].length > column + 1 && row - 1 >= 0) {
			if (coordinates[row - 1][column + 1] == 1) {
				numberOfNeighbours++;
			}
		}
		//check one bottom left diagonal to col
		if (coordinates.length > row + 1 && coordinates[row].length > column - 1 && column - 1 >= 0) {
			if (coordinates[row + 1][column - 1] == 1) {
				numberOfNeighbours++;
			}
		}
		//check one bottom right diagonal to col
		if (coordinates.length > row + 1 && coordinates[row].length > column + 1) {
			if (coordinates[row + 1][column + 1] == 1) {
				numberOfNeighbours++;
			}
		}
		 System.out.println("Number of neighbours for " + row + ", " + column
		 + " was " + numberOfNeighbours);
		//if the number of neighbours was 2 or 3, the cell is alive
		if ((numberOfNeighbours == 2) && cellAlive) {
			return true;
		} else if (numberOfNeighbours == 3) {
			return true;
		}
		return false;
	}
	public static boolean aliveCell(int[][] arr) {
		int numNeighbours = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					numNeighbours = 0;
					if ((i > 0) && (i < 19) && (j > 0) && (j < 19)) {
						if (arr[i - 1][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i - 1][j] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j] == 1) {
							numNeighbours++;
						}
						if (arr[i - 1][j + 1] == 1) {
							numNeighbours++;
						}
						if (arr[i][j + 1] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j + 1] == 1) {
							numNeighbours++;
						}
					}
					else if (i == 0) {
						if (j == 0) {
							if (arr[i + 1][j] == 1) {
								numNeighbours++;
							}
							if (arr[i][j + 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j + 1] == 1) {
								numNeighbours++;
							}

						}
						else if (j == 19) {
							if (arr[i][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j] == 1) {
								numNeighbours++;
							}
						} else {
							if (arr[i][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j] == 1) {
								numNeighbours++;
							}
							if (arr[i][j + 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j + 1] == 1) {
								numNeighbours++;
							}
						}
					}
					else if (i == 19) {
						if (j == 0) {
							if (arr[i - 1][j] == 1) {
								numNeighbours++;
							}
							if (arr[i - 1][j + 1] == 1) {
								numNeighbours++;
							}
							if (arr[i][j + 1] == 1) {
								numNeighbours++;
							}
						}
						else if (j == 19) {
							if (arr[i - 1][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i - 1][j] == 1) {
								numNeighbours++;
							}
						} else {
							if (arr[i - 1][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i - 1][j] == 1) {
								numNeighbours++;
							}
							if (arr[i - 1][j + 1] == 1) {
								numNeighbours++;
							}
							if (arr[i][j + 1] == 1) {
								numNeighbours++;
							}
						}
					}
					else if (j == 0) {
						if (arr[i - 1][j] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j] == 1) {
							numNeighbours++;
						}
						if (arr[i - 1][j + 1] == 1) {
							numNeighbours++;
						}
						if (arr[i][j + 1] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j + 1] == 1) {
							numNeighbours++;
						}
					}
					else if (j == 19) {
						if (arr[i - 1][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i - 1][j] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j] == 1) {
							numNeighbours++;
						}
					}
				}
			}
		}
		if (!(numNeighbours == 2 || numNeighbours == 3)) {
			return false;
		}
		return true;
	}
	public static boolean deadCell(int[][] arr) {
		int numNeighbours = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					numNeighbours = 0;
					//cells not inside edges
					if ((i > 0) && (i < 19) && (j > 0) && (j < 19)) {
						if (arr[i - 1][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i - 1][j] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j] == 1) {
							numNeighbours++;
						}
						if (arr[i - 1][j + 1] == 1) {
							numNeighbours++;
						}
						if (arr[i][j + 1] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j + 1] == 1) {
							numNeighbours++;
						}
					}
					else if (i == 0) {
						if (j == 0) {
							if (arr[i + 1][j] == 1) {
								numNeighbours++;
							}
							if (arr[i][j + 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j + 1] == 1) {
								numNeighbours++;
							}
						}
						else if (j == 19) {
							if (arr[i][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j] == 1) {
								numNeighbours++;
							}
						} else {
							if (arr[i][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j] == 1) {
								numNeighbours++;
							}
							if (arr[i][j + 1] == 1) {
								numNeighbours++;
							}
							if (arr[i + 1][j + 1] == 1) {
								numNeighbours++;
							}
						}
					}
					else if (i == 19) {
						if (j == 0) {
							if (arr[i - 1][j] == 1) {
								numNeighbours++;
							}
							if (arr[i - 1][j + 1] == 1) {
								numNeighbours++;
							}
							if (arr[i][j + 1] == 1) {
								numNeighbours++;
							}
						}
						else if (j == 19) {
							if (arr[i - 1][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i - 1][j] == 1) {
								numNeighbours++;
							}
						} else {
							if (arr[i - 1][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i][j - 1] == 1) {
								numNeighbours++;
							}
							if (arr[i - 1][j] == 1) {
								numNeighbours++;
							}
							if (arr[i - 1][j + 1] == 1) {
								numNeighbours++;
							}
							if (arr[i][j + 1] == 1) {
								numNeighbours++;
							}
						}
					}
					else if (j == 0) {
						if (arr[i - 1][j] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j] == 1) {
							numNeighbours++;
						}
						if (arr[i - 1][j + 1] == 1) {
							numNeighbours++;
						}
						if (arr[i][j + 1] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j + 1] == 1) {
							numNeighbours++;
						}
					}
					else if (j == 19) {
						if (arr[i - 1][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j - 1] == 1) {
							numNeighbours++;
						}
						if (arr[i - 1][j] == 1) {
							numNeighbours++;
						}
						if (arr[i + 1][j] == 1) {
							numNeighbours++;
						}
					}
				}
			}
		}
		if (numNeighbours == 3) {
			return true;
		}
		return false;
	}
}
//if (the cell is alive on the previous day){
//	if (the number of neighbors was 2 or 3){
//		the cell remains alive
//	} else {
//		the cell dies
//	}
//} else if (the cell is not alive on the previous day){
//	if (the number of neighbors was exactly 3){
//		the cell becomes alive
//	} else {
//		the cell remains dead
//	}
//}