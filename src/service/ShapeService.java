package service;

import entity.iShape;

public class ShapeService {
    public Double createArea(iShape shape) {
        return shape.area();
    }
}
