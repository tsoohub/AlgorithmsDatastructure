public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n ==0)   return true;

        int len = flowerbed.length;
        if(len ==0)    return false;
        if(len ==1)    return flowerbed[0] == 0;
        if(len ==2)    return flowerbed[0] == 0 && flowerbed[0] ==0 && n ==1;


        int m = n;
        for(int i=2; i < len-1; i++) {

            if(flowerbed[i] ==1) continue;

            if(flowerbed[i-1] ==0 && flowerbed[i+1] ==0) {
                if(--m == 0) return true;
                flowerbed[i] = 1;
                System.out.println(m);
            }
        }

        if(flowerbed[0] == 0 && flowerbed[1] == 0) {
            m--;
        }
        if(flowerbed[len-2] == 0 && flowerbed[len-1] == 0) {
            m--;
            System.out.println(m);
        }
        return m <= 0;
    }

    public static void main(String[] args) {
        CanPlaceFlowers can = new CanPlaceFlowers();
        //System.out.println(can.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(can.canPlaceFlowers(new int[]{1,0,0,0,1,0,0}, 2));
    }
}
