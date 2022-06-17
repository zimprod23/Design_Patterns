package Factory;



public class Demo{
    public static void main(String[] args) {
        ShapeFactory myShape = new ShapeFactory();

        Shape ing = myShape.getShape("square");
        if(ing != null)ing.draw();
    }
}