import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class java9_2 {
    public static void main(String[] args) {
        Map<String,String > map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        String st="0";
        String res=new String();
        while (!st.equals("null")){
            System.out.println("请输入英语：");
            st=scanner.nextLine();
            System.out.println("请输入汉意");
            res=scanner.nextLine();
            map.put(st,res);
            System.out.println("输入null则开始查询，输入其余则继续输入");
            st=scanner.nextLine();
        }
        st="0";
        while (!st.equals("null")){
            System.out.println("请输入您要查找的单词");
            st=scanner.nextLine();
            String rr=map.getOrDefault(st,"无");
            System.out.println(rr);
            System.out.println("输入null则结束，其余则继续运行");
            st=scanner.nextLine();
        }


    }
}
