package Practice01;
// getClass()
// 'Class' class !!
// Class obj contains class's every info
// only one per class
// Class class is created when class file goes to 'memory' by 'ClassLoader'

// xxx.class --> ClassLoader --> Class obj (easy to use in here)
// ClassLoader : loads class file to memory & convert classfile

//
//Class cObj = new Card().getClass(); by object
//Class cObj = Card.class;            by class literal
//Class cObj = Class.forName("Card"); by name

// Card c= new Card();
// Card c= Card.class.newInstance();  creating obj by Class obj

final class Card {
    String kind;
    int num;

    Card() {
        this ("SPADE", 1);
    }

    Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }
}

public class ClassEx1 {
    public static void main(String[] args) throws Exception{
        Card c = new Card("HEART", 3);
        Card c2 = Card.class.newInstance();

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString()); // note that it is default toString version
                                             // not class upon
    }
}
