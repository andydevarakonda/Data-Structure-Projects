import java.awt.Color;

public class RecursiveFill {
    public static final int WIDTH = 1000, HEIGHT = 600;
    public static final int MIN_SIZE = 2;
    public static final int MIN_SIZE_BONUS = 20;

    public static void main(String[] args){
        StdDraw.setCanvasSize(WIDTH,HEIGHT);
        StdDraw.show(0);
        recursiveRectangleFill(0,1,0,1);
        StdDraw.show(0);
    }

    public static void recursiveRectangleFill(double minX, double maxX, double minY, double maxY){

        if ((maxX - minX)*WIDTH < MIN_SIZE || (maxY - minY)*HEIGHT < MIN_SIZE) {
            return;
        }
        double w = ((maxX - minX)/3.0);
        double h = ((maxY - minY)/3.0);  
        double X = minX + w*3/2;
        double Y = minY + h*3/2;
        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        StdDraw.setPenColor(red, green, blue);
        StdDraw.filledRectangle(X, Y, w/2.0, h/2.0);        
        for (int i = 0; i < 9; i++) { 
            if (i == 4) continue; 

            int x_factor = i/3; 
            int y_factor = i%3; 

            double nMinX = minX + x_factor*w;
            double nMaxX = 0.0;
            if(x_factor == 2){
                nMaxX = maxX;
            }
            else{
                nMaxX = minX + (x_factor + 1)*w;
            }
            double nMinY = minY + y_factor*h;
            double nMaxY = 0.0;
            if(y_factor == 2){
                nMaxY = maxY;
            }
            else{
                nMaxY = minY + (y_factor + 1)*h;
            }

            recursiveRectangleFill(nMinX, nMaxX, nMinY, nMaxY);
        }

    }
}

