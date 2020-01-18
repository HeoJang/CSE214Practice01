package Practice01;
import java.util.*;

public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone(); // by overriding clone() : protected -> public
        // also don't need typecasting thanks to 'covariant return type'
//        int[] arrClone = new int[arr.length];
//        System.arraycopy(arr,0,arrClone,0,arr.length);
        arrClone[0] = 6;


        // Vector, ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, Calendar, Date
        // these classes can be cloned the same way
        // i.e. ArrayList list = new ArrayList(); -> ArrayList list2 = (ArrayList)list.clone();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }
}
