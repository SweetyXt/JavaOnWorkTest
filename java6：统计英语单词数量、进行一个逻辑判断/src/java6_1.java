import java.util.Scanner;

public class java6_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您要输入的英语句子");
        String st=scanner.nextLine();
        int cnt=0;
        String[] ch=st.split(" ");
        System.out.println(ch.length);
    }
}
