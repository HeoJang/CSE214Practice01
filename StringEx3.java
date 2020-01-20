package Practice01;

// empty string : possible in java (not in C)
// empty char : no!

// String s = "";
// char C = ' ';

public class StringEx3 {
    public static void main(String[] args) {
        char[] cArr = new char[0]; // 0 length array
        String s = new String(cArr); // String s = new String("");

        System.out.println("cArr.length="+cArr.length);
        System.out.println("@@@"+s+"@@@");
    }
}
