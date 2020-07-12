import java.util.*;

public class Test {
    public static void main(String[] args) {
    	HashMap<Integer, Integer> hm = new HashMap<>();
//    	System.out.println(hm.get(1));
    	int[] a = {1,2,3,2,1, 4, 1, 45};
    	for (int i : a) {
    	    if (hm.containsKey(i)){
    	        hm.put(i, hm.get(i) + 1 );
            } else {
                hm.put(i, 1 );
            }
        }
    	hm.forEach((k, v)->{System.out.println(k + " " + v);});
    }
}

