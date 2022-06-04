package service;

import entity.Shape;

public class ShapeService {
    public Double createArea(Shape shape) {
        return shape.area();
    }
}
