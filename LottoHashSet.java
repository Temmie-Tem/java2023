package s0828;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoHashSet {

	public void RandomBalls() {
		// TODO Auto-generated method stub
		LottoHashSet<> lotto=new LottoHashSet();
		while(lotto.size()<6) {
			Random r= new Random();
			Integer num = r.nextInt(45)+1;

			
		}
		Collections.sort(lotto);
		System.out.println(lotto.toString());
	}

}
