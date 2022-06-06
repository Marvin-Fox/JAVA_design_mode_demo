package decorator_pattern;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        System.out.println("对象信息：" + decoratedShape);
        decoratedShape.draw();
    }
}
