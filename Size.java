import java.util.Scanner;

public class Size {
    private float length;
    private float width;
    private float high;

    Size() {
        length = 2.0f;
        width = 1.5f;
        high = 1.0f;
    };
    Size(float length) {
        this.length = length;
        width = 1.5f;
        high = 1.0f;
    };
    Size(float length, float width, float high) {
        this.length = length;
        this.width = width;
        this.high = high;
    };

    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    public float getHigh(){
        return high;
    }
    public void setLength(float length){
        this.length = length;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public void setHigh(float high){
        this.high = high;
    }
    public Size readSize(){
        Scanner in = new Scanner(System.in);
        float length, width, high;
        System.out.print("Длина: ");
        length = in.nextFloat();
        System.out.print("Ширина: ");
        width = in.nextFloat();
        System.out.print("Высота: ");
        high = in.nextFloat();
        Size size = new Size(length, width, high);
        return size;
    }
}
