package test;

public class Card2 {
	
	private char shape;
	private int num;
	
	public Card2() {}
	public Card2(char shape, int num) {
		this.shape = shape;
		this.num = num;
	}
	
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 1: System.out.print("A "); break;
		case 11: System.out.print("J "); break;
		case 12: System.out.print("Q "); break;
		case 13: System.out.print("K "); System.out.println(); break;
		default: System.out.print(num+" ");
		}
	}

	
	public char getShape() {
		return shape;
	}
	public int getNum() {
		return num;
	}
	public void setShape(char shape) {
		this.shape = shape;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}
