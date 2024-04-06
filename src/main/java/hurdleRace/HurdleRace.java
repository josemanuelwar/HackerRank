package hurdleRace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HurdleRace {

        public static  int hurdleRace(int k, List<Integer> height){
            int res=0;
            Collections.sort(height);
            Collections.reverse(height);
            if(height.get(0) < k) return 0;
            res=height.get(0)-k;
            return  res;
        }

        public static  void main(String [] args){
            List<Integer> test = new ArrayList<>();
            test.add(1);
            test.add(6);
            test.add(3);
            test.add(5);
            test.add(2);
            System.out.println("resultado "+hurdleRace(7,test));
        }

}
