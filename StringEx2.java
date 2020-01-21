package Practice01;

public class StringEx2 {
    public static void main(String[] args) {
        String s  = "Hello";
        int idx1 = s.indexOf('e', 0);
        System.out.println(idx1);

        String s1 = "          Hello World      ";
        System.out.println(s1);
        String s1Result = s1.trim();

        System.out.println(s1Result);

        java.util.Date dd = new java.util.Date();
        String date = String.valueOf(dd);
        System.out.println(date);
        System.out.println(dd);
    }
}
