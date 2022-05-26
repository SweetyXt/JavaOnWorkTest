import java.util.Scanner;

public class java2_3 {
    public static void main(String[] args) {
        for(int i=0;i<=1000;i++){
            get(i);
        }
    }
    public static void get(int num){
        int [] arr=new int[300];
        int index=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                arr[index]=i;
                index++;
            }
        }
        int sum=0;
        for(int i=0;i<=index;i++){
            sum+=arr[i];
        }
        if(num==sum){
            System.out.println(num);
        }
    }
}
