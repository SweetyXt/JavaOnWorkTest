import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class java4 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的生日，格式为：yyyy-mm-dd");
        String st = scanner.nextLine();//获取生日字符串
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");//构造日期类
        Date date1 = new Date();        //构造日期类
        date1 = sdf1.parse(st);         //将生日字符串解析并赋给日期类
        long l1 = date1.getTime();      //获取日期类的时间
        Date date2 = new Date();        //获取当前时间
        long l2 = date2.getTime();
        long subtime = l2 - l1;         //获取生存时间
        int Y= (int) (subtime/1000/60/60/24/30/12);
        int M=(int)(subtime/1000/60/60/24/30%12);
        int D=(int)(subtime/1000/60/60/24%30);
        int h=(int)(subtime/1000/60/60%24);
        int m=(int)(subtime/1000/60%60);
        int s=(int)(subtime/1000%60);
        int ms=(int)(subtime%1000);
        System.out.println("已存活时间为："+Y+"年"+M+"月"+D+"日"+h+"时"+m+"分"+s+"秒"+ms+"毫秒");

    }
}