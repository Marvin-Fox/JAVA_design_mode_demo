package decorator_pattern;

/**
 * 红色图形装饰器
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        System.out.println(String.format("RedShapeDecorator类-》draw()【对象信息：%s】", decoratedShape));
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println(String.format("RedShapeDecorator类-》setRedBorder()设置边框颜色：Border Color: Red【对象信息：%s】", decoratedShape));

    }
}
