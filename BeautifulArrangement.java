import java.util.Arrays;

public class BeautifulArrangement {

    int count = 0;
    public int countArrangement(int N) {
        int[] arr = new int[N+1];
        for(int i=1; i < arr.length; i++) {
            arr[i] = i;
        }
        permut(arr, 1);
        return count;
    }

    private void permut(int[] arr, int k) {

        for(int i=k; i < arr.length; i++) {
            swap(arr, i, k);
            permut(arr, k+1);
            swap(arr, k, i);
        }
        if(k ==arr.length-1) {
            int i = 1;
            for(i=1; i < arr.length; i++) {
                if( i % arr[i] != 0 && arr[i] % i !=0 )
                    break;
            }
            if(i == arr.length)
                count++;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        BeautifulArrangement ba = new BeautifulArrangement();

        System.out.println(ba.countArrangement(3));
    }
}
