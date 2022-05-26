public class java6_2 {
    public static void main(String[] args) {
        int[] ans=new int[4];

        int key = 0;
        for(int i=0;i<4;i++){
            for(int j = 0; j<4; j++){
                ans[j]=0;
            }
            int cnt=0;
            ans[i]=1;
            if(ans[0]==0){
                cnt++;
            }
            if(ans[2]==1){
                cnt++;
            }
            if(ans[3]==1){
                cnt++;
            }
            if(ans[3]!=1){
                cnt++;
            }
            if(cnt==3){
                key=i;
                break;
            }
        }
        switch (key+1){
            case 1:System.out.println("是A");
            break;
            case 2:System.out.println("是B");
            break;
            case 3:System.out.println("是C");
            break;
            case 4:System.out.println("是D");
        }
    }
}
