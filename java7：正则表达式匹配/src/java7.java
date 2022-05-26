import java.util.Scanner;
import java.util.regex.*;

public class java7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st= scanner.nextLine();
        int length=st.length();
        String res=st.replaceAll("\\D","");
        System.out.println(res);
    }
}
