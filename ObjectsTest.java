package Practice01;
import java.util.*;
import static java.util.Objects.*; // static import the method of Objects class

// java.util.Objects class // Object"s"!!!
// Object compare , null check

// Comparator

public class ObjectsTest {
    public static void main(String[] args) {

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.print("str2D   ={");
        for (String[] tmp : str2D){
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println("}");

        System.out.print("str2D_2 ={");
        for (String[] tmp : str2D_2){
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println("}");

        System.out.println(Objects.equals(str2D, str2D_2)); // even though "static import"
                                                            // it collides with Object (vs Objects)
                                                            // which means compiler cannot recognize
        System.out.println(Objects.deepEquals(str2D, str2D_2));
        System.out.println(isNull(null));
        System.out.println(nonNull(null));
        System.out.println(Objects.hashCode(null));
        System.out.println(Objects.toString(null));
        System.out.println(Objects.toString(null, ""));


        Comparator c = String.CASE_INSENSITIVE_ORDER; // order that don't regard Case(Upper, Lower)

        System.out.println(compare("aa", "bb", c));
        System.out.println(compare("bb", "aa", c));
        System.out.println(compare("ab", "AB", c));
    }
}
