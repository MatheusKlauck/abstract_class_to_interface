package program;

import entity.Color;
import entity.Rectangle;
import entity.ColoredShape;
import entity.Triangle;
import service.ShapeService;

public class myProgram {
    public static void main(String[] args) {
        ShapeService ss = new ShapeService();
        ColoredShape triang = new Triangle(Color.BLACK, 8.);
        ColoredShape rec = new Rectangle(Color.WHITE, 15.,22.);
        System.out.printf("Triangle  area:  %f%n",ss.createArea(triang));
        System.out.printf("Rectangle area:  %f%n",ss.createArea(rec));
    }
}
