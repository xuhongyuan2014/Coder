package test62;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {

    static int[] getClosest(Point2D.Double[] points)
    {
        int[] result = new int[2];
        /* 在这里补充代码, 注意，要求result[0] < result[1] */
        /* distance = points[0].distance(points[1]) */
        double min=0;
        //System.out.println(points.length);
        for(int i=0;i<points.length-1;i++){
        	for(int j=i+1;j<points.length;j++){
        		//System.out.println(i+"---"+j+" i///"+points[i].x+""+points[i].y);   
        		//System.out.println(i+"---"+j+" j///"+points[j].x+""+points[j].y);        		
        		double a=Math.pow(Math.abs(points[i].x-points[j].x), 2);
        		double b=Math.pow(Math.abs(points[i].y-points[j].y), 2);
        		double distance=Math.sqrt(a+b);
    			//System.out.println(distance);
        		if(distance<min||min==0){
        			min=distance;
        			result[0]=i;
        			result[1]=j;
        			//System.out.println(i+"---"+j+"---"+distance);

        		}
        	}
        }
        return result;
    }
    
    public static void main(String[] args) {
        Point2D.Double[] points;
        Scanner input = new Scanner(System.in);
        {
            int n = input.nextInt();
            input.nextLine();
            points = new Point2D.Double[n];
            for (int i = 0; i < n; ++i) {
                double x = input.nextDouble();
                double y = input.nextDouble();
                input.nextLine();
                points[i] = new Point2D.Double(x, y);
            }
        }
        int[] result = getClosest(points);
        System.out.printf("Closest points: %d, %d\n", result[0], result[1]);
    }
}

