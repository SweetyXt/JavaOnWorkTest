import java.util.Scanner;

public class java2_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("请输入您要输入的数字");
        num=scanner.nextInt();
        System.out.print(num+"=");
        getnum(num);
    }
    public static void getnum(int x){
        for(int i=2;i<=x/2;i++){
            if(x%i==0){
                System.out.print(i+"*");
                getnum(x/i);
            }
        }
        System.out.println(x);
        System.exit(0);
    }
}
