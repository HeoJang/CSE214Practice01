package Practice01;
import java.util.*;

// Scanner : Read
// nextBoolean nextByte nextShort nextInt nextLong nextDouble nextFloat nextLine

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] argArr = null;

        while(true) {
            String prompt = ">>";
            System.out.print(prompt);

            String input = s.nextLine();

            input = input.trim();
            argArr = input.split(" +");

            String command = argArr[0].trim();

            if("".equals(command)) continue; // can't under stand this line's reason

            command = command.toLowerCase();

            //quits when q or Q is input
            if(command.equals("q")) {
                System.exit(0);
            } else {
                for(int i=0; i < argArr.length; i++){
                    System.out.println(argArr[i]);
                }
            }
        }
    }
}
