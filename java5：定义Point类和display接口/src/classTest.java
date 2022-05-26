public class classTest {
    public static void main(String[] args) {
        car car1=new car();
        notice notice1=new notice();
        news newss=new news();
        car1.display();
        notice1.display();
        newss.display();
    }
}
class car implements display{
    String name="汽车";
    public void display(){
        System.out.println("我是"+name);
    }
}
class notice implements display{
    String name="通知";
    public void display(){
        System.out.println("我是"+name);
    }
}
class news implements display{
    String name="广告";
    public void display(){
        System.out.println("我是"+name);
    }
}