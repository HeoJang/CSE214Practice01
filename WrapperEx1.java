package Practice01;

// java: uses some non-object thing such as primitive type (to get high efficiency)
// wrapper class : primitive type -> object
// Boolean, Character, Byte, Short, Integer, Long, Float, Double

// wrapper class : equals() , toString() -> overrided

public class WrapperEx1 {
    public static void main(String[] args) {

        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i==i2 ? "+(i==i2));
        System.out.println("i.equals(i2) ? "+i.equals(i2));
        System.out.println("i.compareTo(i2)="+i.compareTo(i2));
        System.out.println("i.toString()="+i.toString());

        // the static var that wrapper class commonly contains
        System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("MIN_VAULE="+Integer.MIN_VALUE);
        System.out.println("SIZE="+Integer.SIZE+" bits");
        System.out.println("BYTES="+Integer.BYTES+" bytes");
        System.out.println("TYPE="+Integer.TYPE);

    }
}
