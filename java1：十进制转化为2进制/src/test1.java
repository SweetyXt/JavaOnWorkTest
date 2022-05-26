import java.util.*;
public class test1 {
    public static void main(String[] args) {
        int x;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您要转换的数字");
        x=scanner.nextInt();
        int [] arr=new int[32];
        int index=0;
        while (x!=0){
            arr[index]=x%2;
            index++;
            x/=2;
        }
        System.out.println("转换后的二进制数为：");
        for(index--;index>=0;index--){
            System.out.print(arr[index]+" ");
        }
    }
}
