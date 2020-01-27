package Practice01;
import java.util.*;

//java.util.Random class

// double randNum = Math.random();
// double randNum = new Random().nextDouble(); // same as upon

// difference : seed(plant a seed for random value!)
// System.currentTimeMillis()

public class RandomEx1 {
    public static void main(String[] args) {
        Random rand = new Random(1);
        Random rand2 = new Random(1);

        System.out.println("= rand =");
        for(int i = 0; i < 5; i++){
            System.out.println(i + ":" + rand.nextInt());
        }

        System.out.println();
        System.out.println("= rand2 ");
        for(int i=0; i < 5; i++){
            System.out.println(i + ":" + rand2.nextInt());
        }
    }
}
