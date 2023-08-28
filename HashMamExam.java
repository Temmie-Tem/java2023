package s0828;

import java.util.HashMap;

public class HashMamExam {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(20314, "씹상남자");
		map.put(20315, "구예성");
		map.put(20316, "김시겸");
		map.put(20317, "김준표");

		System.out.println(map.toString());
		System.out.println(map.size());
		System.out.println(map.get(20314));
		map.put(20317, "김로봇");
		System.out.println(map.toString());

		for (Integer a : map.keySet()) {
			System.out.println(a);
		}

		for (String b : map.values()) {
			System.out.println(b);
		}

		for (Integer c : map.keySet()) {
			System.out.print("학번: " + c);
			System.out.println("이름 :" + map.get(c));
		}
		
		map.remove(20317);
		System.out.println(map.toString());
		
		map.clear();
		System.out.println(map.toString());

	}

}
