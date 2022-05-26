import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class java8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();
        int Y= Integer.parseInt(st.substring(0,4));
        int M=Integer.parseInt(st.substring(5,7));
        int D=Integer.parseInt(st.substring(8,10));
        boolean run=IsRun(Y);
        int[] month= new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(run){
            month[1]=29;
        }
        if(M<=12&&M>0){
            if(D<=month[M-1]&&D>0){
                System.out.println("输入出生日期正确");
                System.exit(0);
            }
        }
        System.out.println("输入日期错误");
    }
    public static boolean IsRun(int Y){
        if((Y%4==0&&Y%100!=0)||(Y%400==0)){
            return true;
        }else{
            return false;
        }
    }
}
