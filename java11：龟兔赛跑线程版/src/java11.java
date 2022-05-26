public class java11 {
    public static void main(String[] args) {
        gui gg=new gui();
        tu tt=new tu();
        gg.start();;
        tt.start();
    }
}
class gui extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=199;i++){
            System.out.println("龟跑了"+(i+1)+"米");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class tu extends Thread{
    public void run(){
        for(int i=0;i<=199;i++){
            System.out.println("兔跑了"+(i+1)+"米");
            if(i%20==0){
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
