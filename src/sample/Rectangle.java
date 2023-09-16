package sample;

public class Rectangle {

    public Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    Point topLeft;
    int height;
    int width;

    int getPerimeter(){
        return 2*(height+width);
    }
    int getArea(){
        return height*width;
    }

    Point getBottomRight(){

        int A = topLeft.x - height;
        int B = topLeft.y + width;
        Point obj = new Point(A,B);
        return obj;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10,20);
        Point p = new Point(15,20);
        System.out.println("We are Good");
    }
}
