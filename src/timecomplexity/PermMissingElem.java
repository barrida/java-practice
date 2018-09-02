package timecomplexity;

import java.util.*;

public class PermMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int A[] = new int[] {2,3,1,5};
		   solution(A);
	}

	/**
	 * 
	 */
	public static int solution(int A[]) {
		// write your code in Java SE 8
        Set<Integer> source = new HashSet();
        for(int i = 0; i < A.length; i++){
            source.add(i+1);
        }
        
        Set<Integer> result = new HashSet();
        for(int i = 0; i < A.length; i++){
            result.add(A[i]);
        }
        
        //setB.removeAll(setA);
        source.removeAll(result);

        //System.out.println(setB);
        System.out.println( source);
        
       
        
        return 0;
	}

}
