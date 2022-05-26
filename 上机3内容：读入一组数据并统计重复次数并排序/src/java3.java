
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ClassName: NumberOfReplication
 * @Description:统计数组中重复数及重复个数
 * @Author: YuHao
 * @Date: 2022/4/8
 */
public class java3 {
    public static void main(String[] args) {
        int temp = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组的长度:");
        int length = scanner.nextInt();
        System.out.print("请输入"+length+"个数:");
        int [] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : array){
            //统计重复数的个数
            map.put(a, map.get(a) == null? 1 : map.get(a)+1);
        }
        for(int i=0;i<map.size();i++){
            for(int j=i+1;j<map.size();j++){

            }
        }


        for (int key : map.keySet()){
            //输出格式:key:value
            System.out.println(key + ":" + map.get(key));
        }
    }
}
