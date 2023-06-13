import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int n = new Random().nextInt(100);
        int k = 0;

        for (int j = 0; j < Short.MAX_VALUE; j++) {
            if (j % n == 0 && j != 0) k++;
        }
        //System.out.println(n);
        //System.out.println(k);
        int[] m1 = new int[k];
        int counter = 0;
        for (int j = 0; j < Short.MAX_VALUE; j++) {
            if (j % n == 0 && j != 0) {
                m1[counter] = j;
                counter++;
            }
        }
        //for (int j = 0; j < m1.length; j++) {
        //System.out.println(m1[j]);
        //}
    }
}

