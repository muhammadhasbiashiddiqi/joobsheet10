import java.lang.reflect.Array;
import java.util.Arrays;

public class Numbers17 {

    public static void main(String[] args) {
        int[][] mynumbers = new int[3][];
        mynumbers[0] = new int[5];
        mynumbers[1] = new int[3];
        mynumbers[2] = new int[1];
        for (int i=0 < mynumbers.length;i++) {
            System.out.println(Arrays.toString(mynumbers[i]));
        }
        for (int i=0 < mynumbers.length;i++) {
            System.out.println("panjang baris ke- " +(i+1)+": "+ mynumbers[i].length);
        }
    }
}