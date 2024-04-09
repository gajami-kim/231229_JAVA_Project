package board;

import java.util.Scanner;

public interface BoardInterface {
	
	void addBoard(Scanner sc);
	void searchBoard(Scanner sc);
	void modifyBoard(Scanner sc);
	void removeBoard(Scanner sc);
	void printBoard();
	void printMenu();
}
