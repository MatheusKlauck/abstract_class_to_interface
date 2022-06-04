package entity;

public class Triangle extends ColoredShape {
    private Double l;

    public Triangle(Color color, Double l) {
        super(color);
        this.l = l;
    }

    public Double getL() {
        return l;
    }
    public Double area() {
        return getL() * Math.sqrt(3) / 2;
    }
}
