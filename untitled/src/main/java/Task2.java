import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int i = 0;
        Random random = new Random();
        i = random.nextInt(2000);
        //System.out.println(i);
        //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int count = 0;
        while (i != 0) {
            count++;
            i = i >> 1;
        }
        System.out.println(count);
    }
}
