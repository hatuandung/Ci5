import java.util.Random;

public class Exercise {
    //12.1
    public static int[] cloneArray(int[] a1){
        int[] a2 = new int[a1.length];
        for (int i = 0 ; i < a1.length ; i++){
            a2[i] = a1[i];
        }
        return a2;
    }
    //12.2
    public static double randomDouble(double low, double high){
        double x = Math.random() * (high -1) + low;
        return x;
    }
    //12.3
    public static int randomInt(int low, int high){
        int x = (int )(Math.random() * (high - 1) + low);
        return x;
    }

    //12.5
    public static boolean areFactors(int n, int[]a){
        for(int i = 0 ; i < a.length ; i++) {
            if (a[i] % n != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a1 = {1,2,4,5,6};
        int[] a2 = cloneArray(a1);

        for(int i = 0; i < a2.length; i++){
            System.out.print(a2[i]);
        }
        System.out.println(" ");

        double ranDouble = randomDouble(1.1,8.9);
        System.out.println(ranDouble);

        int ranInt = randomInt(5,8);
        System.out.println(ranInt);

        int a3[] = {1,8,4};
        areFactors(8,a3);
        if(areFactors(8,a3) == true)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
