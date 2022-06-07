package decorator_pattern;

/**
 * 图形装饰器抽象类
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    /**
     * 这个方法有可能会被子类重写覆盖
     */
    @Override
    public void draw() {
        System.out.println(String.format("图形装饰器抽象类:draw()【对象信息：%s】", decoratedShape));
        decoratedShape.draw();
    }
}
