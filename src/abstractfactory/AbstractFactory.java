package abstractfactory;

public class AbstractFactory {
    // Abstract Product
    interface Shape {
        void draw();
    }

    // Concrete Products
    static class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }

    static class Square implements Shape {
        public void draw() {
            System.out.println("Drawing Square");
        }
    }

    static class Sphere implements Shape {
        public void draw() {
            System.out.println("Drawing Sphere");
        }
    }

    static class Cube implements Shape {
        public void draw() {
            System.out.println("Drawing Cube");
        }
    }

    // Abstract Factory
    interface ShapeFactory {
        Shape getShape(String type);
    }

    //  Factory 1
    static class TwoDShapeFactory implements ShapeFactory {
        public Shape getShape(String type) {
            if (type.equalsIgnoreCase("circle")) return new Circle();
            if (type.equalsIgnoreCase("square")) return new Square();
            return null;
        }
    }

    //  Factory 2
    static class ThreeDShapeFactory implements ShapeFactory {
        public Shape getShape(String type) {
            if (type.equalsIgnoreCase("sphere")) return new Sphere();
            if (type.equalsIgnoreCase("cube")) return new Cube();
            return null;
        }
    }
    static ShapeFactory getFactory(boolean is3D) {
        return is3D ? new ThreeDShapeFactory() : new TwoDShapeFactory();
    }

    // Client
    public static void main(String[] args) {
        ShapeFactory factory2D = getFactory(false);
        Shape circle = factory2D.getShape("circle");
        circle.draw(); // Output: Drawing Circle

        ShapeFactory factory3D = getFactory(true);
        Shape cube = factory3D.getShape("cube");
        cube.draw(); // Output: Drawing Cube
    }
}
