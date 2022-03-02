package Facade;

public class FascadePattern {
    public static void main(String[] args) {
        ShapeMaker sm= new ShapeMaker();
        sm.drawCircle();
        sm.drawRectangle();
        sm.drawSquare();
    }
}
