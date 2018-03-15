import java.util.HashMap;

public class FindAnagramMappings {

    public int[] anagramMappings(int[] A, int[] B) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] p =new int[B.length];

        for(int i=0; i < B.length; i++) {
            map.put(B[i], i);
        }

        for(int j=0; j < A.length; j++) {
            if(map.containsKey(A[j])) {
                p[j] = map.get(A[j]);
            }
        }

        return p;
    }

}
