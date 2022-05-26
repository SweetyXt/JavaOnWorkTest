import java.util.Random;

class Point{
    int x,y;
    public Point(){
        Random random=new Random();
        x= random.nextInt()%100+5;
        y=random.nextInt()%100+5;
    }
    int comp(Point p){
        int d= (int) Math.sqrt(x*x+y*y);
        int d2=(int) Math.sqrt(p.x*p.x+p.y*p.y);
        if(d>=d2){
            return 1;
        }else{
            return -1;
        }
    }
}
public class PointText {
    public static void main(String[] args) {
        Point[] points=new Point[10];
        for(int i=0;i<10;i++){
            points[i]=new Point();
        }
        PointsSort(points);
       PointDisplay(points);
    }
    public static void PointsSort(Point[] points){
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j< points.length;j++){
                if(points[i].comp(points[j])<0){
                    PointSwap(points[i],points[j]);
                }
            }
        }
    }
    public static void PointSwap(Point p1, Point p2){
        int t;
        t=p1.x;
        p1.x=p2.x;
        p2.x=t;
        t=p1.y;
        p1.y=p2.y;
        p2.y=t;
    }
    public static void PointDisplay(Point[] points){
        for(int i=0;i< points.length;i++){
            double d=Math.sqrt(points[i].x*points[i].x+points[i].y+points[i].y);
            System.out.println("第"+(i+1)+"个点的坐标为：（"+points[i].x+","+points[i].y+"),距离为"+(int)d);
        }
    }
}
