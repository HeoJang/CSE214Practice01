package Practice01;

//String class (important)

// immutable class (unchangeable)
// private char[] value;
// only read , can't write
// i.e. a = "a"   b = "b"  --> a = a + b; (not concatenated, but newly created "ab")
// therefore, each String concatenation  loads(uses?) memory spaces

// when concat or extract : Use StringBuffer class rather than String class


// String comparison
//
//String str1 = "abc";  str1 == str2 : true
//String str2 = "abc";
//String str3 = new String("abc");    str3 == str4 : false
//String str4 = new String("abc");

// str1.equals(str2) == str3.equals(str4)  // comparing contents

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ?   " + (str1==str2));
        System.out.println("str1.equals(str2)  ? " + str1.equals(str2));
        System.out.println();

        String str3 = new String("\"abc\"");
        String str4 = new String("\"abc\"");

        System.out.println("String str3 = new String(\"abc\");");
        System.out.println("String str4 = new String(\"abc\");");

        System.out.println("str3 == str4 ?   " + (str3==str4));
        System.out.println("str.equals(str4) ? " + str3.equals(str4));
    }
}
