package s0828;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(0,9);
		System.out.println(list.toString());
		
		list.remove(3);
		System.out.println(list.toString());
		
		if(list.contains(4)) {
			System.out.println("4있다");
		}
		
		System.out.println(list.get(0));
		list.clear();
		System.out.println(list.toString());
		
	}

}
