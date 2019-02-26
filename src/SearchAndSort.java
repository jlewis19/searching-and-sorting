import java.util.ArrayList;
import java.util.Scanner;

public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SearchAndSort sas = new SearchAndSort();
		System.out.print("What algorithm would you like to execute?\nPlease enter bubble, selection, insertion, merge, linear, binary, or quit.\n\t> ");
		String algorithm = in.nextLine();
		if (algorithm.toLowerCase().equals("quit")) {
			System.exit(0);
		}
		while (!sas.validInput(algorithm, "algorithm")) {
			System.out.print("Please enter bubble, selection, insertion, merge, linear, binary, or quit.\n\t> ");
			algorithm = in.nextLine();
			if (algorithm.toLowerCase().equals("quit")) {
				System.exit(0);
			}
		}
		System.out.print("What type of data will you use?\nPlease enter integers or strings.\n\t> ");
		String dataType = in.nextLine();
		while (!sas.validInput(dataType, "dataType")) {
			System.out.print("Please enter integers or strings.\n\t> ");
			dataType = in.nextLine();
		}
		System.out.print("How will the data be stored?\nPlease enter array or list.\n\t> ");
		String storageType = in.nextLine();
		while (!sas.validInput(storageType, "storageType")) {
			System.out.print("Please enter array or list.\n\t> ");
			storageType = in.nextLine();
		}
		System.out.print("Please enter the data as a comma-delimited list (for instance, 1,2,3,4,5).\n\t> ");
		String data = in.nextLine();
		while (!sas.validDataInput(data, dataType)) {
			System.out.print("Please enter the data as a comma-delimited list (for instance, 1,2,3,4,5).\n\t> ");
			data = in.nextLine();
		}
		
		if (dataType.toLowerCase().equals("string")) {
			ArrayList<String> list = new ArrayList<String>();
			list = sas.createStringList(data);
		} else {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list = sas.createIntList(data);
		}
		
		System.out.println(list);
		
		in.close();
	}
	
	
	
	public boolean validInput(String input, String type) {
		input = input.toLowerCase();
		switch (type) {
			case "algorithm":
				if (input.equals("bubble") || input.equals("selection") || input.equals("insertion") || input.equals("merge") || input.equals("linear") || input.equals("binary")) {
					return true;
				} else {
					return false;
				}
			case "dataType":
				if (input.equals("integers") || input.equals("strings")) {
					return true;
				} else {
					return false;
				}
			case "storageType":
				if (input.equals("array") || input.equals("list")) {
					return true;
				} else {
					return false;
				}
			default:
				return false;
		}
	}
	
	public boolean validDataInput(String data, String dataType) {
		if (dataType.equals("integers")) {
			for (int i = 0; i < data.length(); i++) {
				if (!isNumeric(data.substring(i, i + 1))) {
					if (data.charAt(i) != ',') {
						return false;
					}
				}
			}
			return true;
		} else {
			return true;
		}
	}
	
	public static boolean isNumeric(String str) {  
		try {  
			double d = Double.parseDouble(str);  
		} catch(NumberFormatException nfe) {  
			return false;  
		}  
		return true;  
	}
}