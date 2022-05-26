import java.util.*;

public class java9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();
        String[] res=st.split(" ");
        Map<String,Integer> map=new HashMap();
        for(int i=0;i< res.length;i++){
            if(map.containsKey(res[i])){
                map.put(res[i],map.getOrDefault(res[i],0)+1);
            }else{
                map.put(res[i],1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println("单词为： "+ key + "  出现次数为： " + map.get(key));
        }
    }
}