
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] message = in.nextLine().toCharArray();
        String res = "";
        int current = -1;
        int mode;

        for (char c : message) {
            for (int j = 0; j < 7; j++) {
                mode = (c >> 6 - j & 0x1);
                if (current == mode) res += "0";
                else {
                    if (mode == 1) res += " 0 0";
                    if (mode == 0) res += " 00 0";
                }
                current = mode;
            }
        }
        System.out.println(res.substring(1));
    }
}