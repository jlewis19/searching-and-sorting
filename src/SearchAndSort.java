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
		algorithm = algorithm.toLowerCase();
		
		System.out.print("What type of data will you use?\nPlease enter integers or strings.\n\t> ");
		String dataType = in.nextLine();
		while (!sas.validInput(dataType, "dataType")) {
			System.out.print("Please enter integers or strings.\n\t> ");
			dataType = in.nextLine();
		}
		dataType = dataType.toLowerCase();
		boolean string;
		if (dataType.equals("strings")) {
			string = true;
		} else {
			string = false;
		}
		
		System.out.print("How will the data be stored?\nPlease enter array or list.\n\t> ");
		String storageType = in.nextLine();
		while (!sas.validInput(storageType, "storageType")) {
			System.out.print("Please enter array or list.\n\t> ");
			storageType = in.nextLine();
		}
		storageType = storageType.toLowerCase();
		
		System.out.print("Please enter the data as a comma-delimited list (for instance, 1,2,3,4,5).\n\t> ");
		String data = in.nextLine();
		while (!sas.validDataInput(data, dataType)) {
			System.out.print("Please enter the data as a comma-delimited list (for instance, 1,2,3,4,5).\n\t> ");
			data = in.nextLine();
		}
		
		ArrayList<String> stringList = new ArrayList<String>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		if (string) {
			stringList = sas.createStringList(data);
		} else {
			intList = sas.createIntList(data);
		}
		
		
		switch (algorithm) {
			case "bubble":
				if (string) {
					stringList = sas.bubble(stringList, stringList.get(0));
					System.out.println(stringList);
				} else {
					intList = sas.bubble(intList, intList.get(0));
					System.out.println(intList);
				}
				break;
			case "selection":
				if (string) {
					stringList = sas.selection(stringList, stringList.get(0));
					System.out.println(stringList);
				} else {
					intList = sas.selection(intList, intList.get(0));
					System.out.println(intList);
				}
				break;
			case "insertion":
				if (string) {
					stringList = sas.insertion(stringList, stringList.get(0));
					System.out.println(stringList);
				} else {
					intList = sas.insertion(intList, intList.get(0));
					System.out.println(intList);
				}
				break;
		}
		
		in.close();
	}
	
	public ArrayList<String> insertion(ArrayList<String> data, String s) {
		for (int i = 1; i < data.size(); i++) {
			String key = data.get(i);
			int j = i - 1;
			while (j >= 0 && data.get(j).compareTo(key) > 0) {
				data.set(j + 1, data.get(j));
				j--;
			}
			data.set(j + 1, key);
		}
		return data;
	}
	
	public ArrayList<Integer> insertion(ArrayList<Integer> data, int n) {
		for (int i = 1; i < data.size(); i++) {
			int key = data.get(i);
			int j = i - 1;
			while (j >= 0 && data.get(j) > key) {
				data.set(j + 1, data.get(j));
				j--;
			}
			data.set(j + 1, key);
		}
		return data;
	}
	
	public ArrayList<String> selection(ArrayList<String> data, String s) {
		for (int i = 0; i < data.size(); i++) {
			int minIndex = i;
			for (int j = i + 1; j < data.size(); j++) {
				if (data.get(j).compareTo(data.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			String temp = data.set(i, data.get(minIndex));
			data.set(minIndex, temp);
		}
		return data;
	}
	
	public ArrayList<Integer> selection(ArrayList<Integer> data, int n) {
		for (int i = 0; i < data.size(); i++) {
			int minIndex = i;
			for (int j = i + 1; j < data.size(); j++) {
				if (data.get(j) < data.get(minIndex)) {
					minIndex = j;
				}
			}
			int temp = data.set(i, data.get(minIndex));
			data.set(minIndex, temp);
		}
		return data;
	}

	public ArrayList<String> bubble(ArrayList<String> data, String s) {
		for (int i = 0; i < data.size() - 1; i++) {
			for (int j = 0; j < data.size() - 1 - i; j++) {
				if (data.get(j).compareTo(data.get(j + 1)) > 0) {
					String temp = data.set(j + 1, data.get(j));
					data.set(j, temp);
				}
			}
		}
		return data;
	}

	public ArrayList<Integer> bubble(ArrayList<Integer> data, int n) {
		for (int i = 0; i < data.size() - 1; i++) {
			for (int j = 0; j < data.size() - 1 - i; j++) {
				if (data.get(j) > data.get(j + 1)) {
					int temp = data.set(j + 1, data.get(j));
					data.set(j, temp);
				}
			}
		}
		return data;
	}
	
	public ArrayList<String> createStringList(String data) {
		String entry = "";
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) != ',') {
				entry += data.charAt(i);
			} else if (!entry.equals("")) {
				list.add(entry);
				entry = "";
			}
			
			if (i == data.length() - 1 && !entry.equals("")) {
				list.add(entry);
			}
		}
		return list;
	}
	
	public ArrayList<Integer> createIntList(String data) {
		String entry = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) != ',') {
				entry += data.charAt(i);
			} else if (!entry.equals("")) {
				list.add(Integer.parseInt(entry));
				entry = "";
			}
			
			if (i == data.length() - 1) {
				list.add(Integer.parseInt(entry));
			}
		}
		return list;
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