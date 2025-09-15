package exam1.exam3;

public class Rectangle {
    private int width;
    private int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }


    public void widthPrint() {
        System.out.println("넓이: " + calculateArea());
    }
    public void heightPrint() {
        System.out.println("둘레 길이: " + calculatePerimeter());
    }
    public void areaPrint() {

            System.out.println("정사각형 여부: " + isSquare());

    }

}
