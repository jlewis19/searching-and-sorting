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
		boolean array;
		if (storageType.equals("array")) {
			array = true;
		} else {
			array = false;
		}
		
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
					if (array) {
						String[] stringArray = new String[stringList.size()];
						System.out.print("[");
						for (int i = 0; i < stringList.size() - 1; i++) {
							stringArray[i] = stringList.get(i);
							System.out.print(stringArray[i] + ", ");
						}
						stringArray[stringList.size() - 1] = stringList.get(stringList.size() - 1);
						System.out.println(stringArray[stringList.size() - 1] + "]");
					} else {
						System.out.println(stringList);
					}
				} else {
					intList = sas.bubble(intList, intList.get(0));
					if (array) {
						int[] intArray = new int[intList.size()];
						System.out.print("[");
						for (int i = 0; i < intList.size() - 1; i++) {
							intArray[i] = intList.get(i);
							System.out.print(intArray[i] + ", ");
						}
						intArray[intList.size() - 1] = intList.get(intList.size() - 1);
						System.out.println(intArray[intList.size() - 1] + "]");
					} else {
						System.out.println(intList);
					}
				}
				break;
			case "selection":
				if (string) {
					stringList = sas.selection(stringList, stringList.get(0));
					if (array) {
						String[] stringArray = new String[stringList.size()];
						System.out.print("[");
						for (int i = 0; i < stringList.size() - 1; i++) {
							stringArray[i] = stringList.get(i);
							System.out.print(stringArray[i] + ", ");
						}
						stringArray[stringList.size() - 1] = stringList.get(stringList.size() - 1);
						System.out.println(stringArray[stringList.size() - 1] + "]");
					} else {
						System.out.println(stringList);
					}
				} else {
					intList = sas.selection(intList, intList.get(0));
					if (array) {
						int[] intArray = new int[intList.size()];
						System.out.print("[");
						for (int i = 0; i < intList.size() - 1; i++) {
							intArray[i] = intList.get(i);
							System.out.print(intArray[i] + ", ");
						}
						intArray[intList.size() - 1] = intList.get(intList.size() - 1);
						System.out.println(intArray[intList.size() - 1] + "]");
					} else {
						System.out.println(intList);
					}
				}
				break;
			case "insertion":
				if (string) {
					stringList = sas.insertion(stringList, stringList.get(0));
					if (array) {
						String[] stringArray = new String[stringList.size()];
						System.out.print("[");
						for (int i = 0; i < stringList.size() - 1; i++) {
							stringArray[i] = stringList.get(i);
							System.out.print(stringArray[i] + ", ");
						}
						stringArray[stringList.size() - 1] = stringList.get(stringList.size() - 1);
						System.out.println(stringArray[stringList.size() - 1] + "]");
					} else {
						System.out.println(stringList);
					}
				} else {
					intList = sas.insertion(intList, intList.get(0));
					if (array) {
						int[] intArray = new int[intList.size()];
						System.out.print("[");
						for (int i = 0; i < intList.size() - 1; i++) {
							intArray[i] = intList.get(i);
							System.out.print(intArray[i] + ", ");
						}
						intArray[intList.size() - 1] = intList.get(intList.size() - 1);
						System.out.println(intArray[intList.size() - 1] + "]");
					} else {
						System.out.println(intList);
					}
				}
				break;
			case "merge":
				if (string) {
					stringList = sas.mergeSort(stringList, 0, stringList.size() - 1, stringList.get(0));
					if (array) {
						String[] stringArray = new String[stringList.size()];
						System.out.print("[");
						for (int i = 0; i < stringList.size() - 1; i++) {
							stringArray[i] = stringList.get(i);
							System.out.print(stringArray[i] + ", ");
						}
						stringArray[stringList.size() - 1] = stringList.get(stringList.size() - 1);
						System.out.println(stringArray[stringList.size() - 1] + "]");
					} else {
						System.out.println(stringList);
					}
				} else {
					intList = sas.mergeSort(intList, 0, intList.size() - 1, intList.get(0));
					if (array) {
						int[] intArray = new int[intList.size()];
						System.out.print("[");
						for (int i = 0; i < intList.size() - 1; i++) {
							intArray[i] = intList.get(i);
							System.out.print(intArray[i] + ", ");
						}
						intArray[intList.size() - 1] = intList.get(intList.size() - 1);
						System.out.println(intArray[intList.size() - 1] + "]");
					} else {
						System.out.println(intList);
					}
				}
				break;
			case "linear":
				System.out.print("Please enter the target value.\n\t> ");
				if (string) {
					String target = in.nextLine();
					int index = sas.linear(stringList, target);
					if (index == -1) {
						System.out.println("This string did not appear in the list.");
					} else {
						System.out.println("This string appeared in the list at index " + index + ".");
					}
				} else {
					String num = in.nextLine();
					while (!isNumeric(num)) {
						System.out.print("Please enter a valid number.\n\t> ");
						num = in.nextLine();
					}
					int target = Integer.parseInt(num);
					int index = sas.linear(intList, target);
					if (index == -1) {
						System.out.println("This integer did not appear in the list.");
					} else {
						System.out.println("This integer appeared in the list at index " + index + ".");
					}
				}
				break;
			case "binary":
				System.out.print("Please enter the target value.\n\t> ");
				if (string) {
					
				} else {
					String num = in.nextLine();
					while (!isNumeric(num)) {
						System.out.print("Please enter a valid number.\n\t> ");
						num = in.nextLine();
					}
					int target = Integer.parseInt(num);
					int index = sas.binary(intList, target);
					if (index == -1) {
						System.out.println("This integer did not appear in the list.");
					} else {
						for (int i = 0; i < intList.size(); i++) {
							if (intList.get(i) == target) {
								index = i;
								i = intList.size();
							}
						}
						System.out.println("This integer appeared in the list at index " + index + " after being sorted.");
					}
				}
		}
		
		in.close();
	}
	
	public int binary(ArrayList<Integer> data, int target) {
		ArrayList<Integer> copy = selection(data, data.get(0));
		int start = 0;
		int end = copy.size() - 1;
		int mid = (end - start) / 2;
		while (end >= start) {
			if (copy.get(mid) > target) {
				end = mid - 1;
				mid = (end - start) / 2;
			} else if (copy.get(mid) < target) {
				start = mid = 1;
				mid = (end - start) / 2;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	public int linear(ArrayList<Integer> data, int target) {
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i) == target)
				return i;
		}
		return -1;
	}
	
	public int linear(ArrayList<String> data, String target) {
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).equals(target))
				return i;
		}
		return -1;
	}
	
	public ArrayList<Integer> mergeSort(ArrayList<Integer> data, int start, int end, int n) {
		if (start < end) {
			int mid = (start + end) / 2;
			ArrayList<Integer> half1 = mergeSort(data, start, mid, data.get(0));
			ArrayList<Integer> half2 = mergeSort(data, mid + 1, end, data.get(0));
			return merge(data, start, mid, end, data.get(0));
		} else {
			return data;
		}
	}
	
	public ArrayList<Integer> merge(ArrayList<Integer> data, int start, int mid, int end, int n) {
		int size1 = mid - start + 1;
		int size2 = end - mid;
		
		ArrayList<Integer> left = new ArrayList<Integer>(size1);
		ArrayList<Integer> right = new ArrayList<Integer>(size2);
		
		for (int i = 0; i < size1; i++)
			left.add(data.get(start + i));
		for (int j = 0; j < size2; j++)
			right.add(data.get(mid + j + 1));
		
		int i = 0;
		int j = 0;
		int k = start;
		while (i < size1 && j < size2) {
			if (left.get(i) <= right.get(j)) {
				data.set(k, left.get(i));
				i++;
			} else {
				data.set(k, right.get(j));
				j++;
			}
			k++;
		}
		
		while (i < size1) {
			data.set(k, left.get(i));
			i++;
			k++;
		}
		while (j < size2) {
			data.set(k, right.get(j));
			j++;
			k++;
		}
		return data;
	}
	
	public ArrayList<String> mergeSort(ArrayList<String> data, int start, int end, String s) {
		if (start < end) {
			int mid = (start + end) / 2;
			ArrayList<String> half1 = mergeSort(data, start, mid, data.get(0));
			ArrayList<String> half2 = mergeSort(data, mid + 1, end, data.get(0));
			return merge(data, start, mid, end, data.get(0));
		} else {
			return data;
		}
	}
	
	public ArrayList<String> merge(ArrayList<String> data, int start, int mid, int end, String s) {
		int size1 = mid - start + 1;
		int size2 = end - mid;
		
		ArrayList<String> left = new ArrayList<String>(size1);
		ArrayList<String> right = new ArrayList<String>(size2);
		
		for (int i = 0; i < size1; i++)
			left.add(data.get(start + i));
		for (int j = 0; j < size2; j++)
			right.add(data.get(mid + j + 1));
		
		int i = 0;
		int j = 0;
		int k = start;
		while (i < size1 && j < size2) {
			if (left.get(i).compareTo(right.get(j)) < 0) {
				data.set(k, left.get(i));
				i++;
			} else {
				data.set(k, right.get(j));
				j++;
			}
			k++;
		}
		
		while (i < size1) {
			data.set(k, left.get(i));
 			i++;
			k++;
		}
		while (j < size2) {
			data.set(k, right.get(j));
			j++;
			k++;
		}
		return data;
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
			int d = Integer.parseInt(str);  
		} catch(NumberFormatException nfe) {  
			return false;  
		}  
		return true;  
	}
}