package edu.eci.cvds.patterns.shapes;

public class ShapeFactory(){
    public static create(RegularShapeType type){
        switch (type) {
            case Triangle:
                return new Triangle();
            case Quadrilateral;
                return new Quadrilateral();
            case Pentagon;
                return new Pentagon();
            case Hexagon;
                return new Hexagon();
            default:
                return null;
        }
    }
}