import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Main {

	static Stack<String> stack = new Stack<String>();
	
	String[] parsingTable = {"tableState",
			"tableAction",
			"tableGoto"};

	static String[][] data = {{"0", "1", "2", "3", "5", "6", "7",
					"8", "9", "10", "11"},
			{"id", "+", "*", "(", ")", "$"},
			{"E", "T", "F"}};

	public static void Main(String input) {
		char[] first_Input = input.toCharArray();
		
		String first_Stack = "0";
		stack.push(first_Stack);
		
		for(int i = 0; i < first_Input.length; i++) {
			System.out.print(first_Input[i] + " ");
		
			String s = first_Input[i] + "";
		
			Table(s, first_Stack);
			if(s!= null & s.contains("S")) {
				Shift(s);
			}
			else if(s!= null & s.contains("R")) {
				Reduce(s);
			}
		}
	}
	

    public static String getValueAt(int row, int col) {
        return data[row][col];
    }
	public static void Reduce(String str) {	// this will perform the reducing 
		for(int i = 0; i < str.length(); i++)
				stack.pop();					// needs to ...
	}
	
	public static void Shift(String str) {	// this will perform the shifting
		for(int i = 0; i < str.length(); i++)
			stack.push(str);
	}
	
	public String Action(String str) { // this will call Grammar?
		
		return null;
	}
	
	public static String Table(String str, String first_Stack) {
	
	// ?????????????????????? work Here 
		
	// first_Stack = 0;
	// String str = id;
		String action = null;
		if(str == "id" & first_Stack == "0")
			action = "S5";
		
		
		return action;	
	}
	
	public static String Grammar(String str, String which_Side) {
		String out = null;
		if(which_Side.contains("R")) { // R is for right
		switch (str) {
		case "1": out = "E+T";
			break;
		case "2": out = "T";
			break;
		case "3": out = "T";
			break;
		case "4": out = "T*F";
			break;
		case "5": out = "(E)";
			break;
		case "6": out = "id";
			break;
			}
		} else if (which_Side.contains("L")) {	// L is for left
			switch (str) {
			case "1": out = "E";
				break;
			case "2": out = "E";
				break;
			case "3": out = "T";
				break;
			case "4": out = "T";
				break;
			case "5": out = "F";
				break;
			case "6": out = "F";
				break;
			}
		}
		return out;
	}
	
	public static void main (String[] args) {
		
		System.out.println("Enter in your LR-Parsing Input: ");
		Scanner scan = new Scanner(System.in);
		
		String goingIN = scan.nextLine();
		Main(goingIN);
	}
	
}
