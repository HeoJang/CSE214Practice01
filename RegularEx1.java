package Practice01;
import java.util.regex.*; // includes Pattern & Matcher

// Regular Expression   :  find out String's "particular pattern"

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};

        Pattern p = Pattern.compile("c[a-z]*");  // starts with c , english, lower case

        for(int i=0; i < data.length; i++){
            Matcher m = p.matcher(data[i]);
            if(m.matches()){
                System.out.print(data[i] + ",");

            }
        }
        System.out.println();
    }
}
