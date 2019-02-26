import java.util.*;

public class ArrayList {
	public ArrayList<String> createList(String data) {
		String entry = "";
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) != ',') {
				entry += data.charAt(i);
			} else if (!entry.equals("")) {
				list.add(entry);
				entry = "";
			}
		}
		return list;
	}
	
	public ArrayList<Integer> createList(String data) {
		String entry = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) != ',') {
				entry += data.charAt(i);
			} else if (!entry.equals("")) {
				list.add(Integer.parseInt(entry));
				entry = "";
			}
		}
		return list;
	}
}