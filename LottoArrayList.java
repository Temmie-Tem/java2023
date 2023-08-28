package s0828;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class LottoArrayList {

	public void RandomBalls() {
		// TODO Auto-generated method stub
		ArrayList<Integer> lotto=new ArrayList<>();
		while(lotto.size()<6) {
			Random r= new Random();
			Integer num = r.nextInt(45)+1;
			if(lotto.contains(num))
				continue;
			else
				lotto.add(num);
			
		}
		Collections.sort(lotto);
		System.out.println(lotto.toString());
	}

}
