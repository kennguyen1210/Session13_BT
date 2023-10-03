package ra;

import java.util.Arrays;
import java.util.List;

public class Caculator {
    public static int sum(int a, int b){
        return a+b;
    }
    public void tinhTong(){
        List<Integer> list5 = Arrays.asList(1,2,3,4,5);
        int total = list5.stream().reduce(0, Caculator::sum);
        System.out.println(total);
    }
}
