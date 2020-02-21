package exceptions;
import java.util.StringTokenizer;

public class SampleNoSuchElementException {
    public static void main(String[] args) {
        String s = "Java Programming Language";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        // Exception in thread "main" java.util.NoSuchElementException 발생
        // System.out.println(st.nextToken());
    }
}
