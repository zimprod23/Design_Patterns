package Factory;

public class ShapeFactory{
 
    public Shape getShape(String shapeType){
        String shape = shapeType.toLowerCase();
        switch(shape){
            case "circle":return new Circle();
            case "rectangle":return new Rectangle();
            case "square":return new Square();
            default:return null;
        }
    }

} 