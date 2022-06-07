package decorator_pattern.decorator;

import decorator_pattern.Shape;

/**
 * 红色边框装饰器
 */
public class RedBorderDecorator extends ShapeDecorator {

    public RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    /**
     * 重写绘画方法
     */
    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println(String.format("RedShapeDecorator类-》draw()【对象信息：%s】", decoratedShape));
        setRedBorder(decoratedShape);
    }

    /**
     * 自己私有的装饰方法：加红色边框
     * @param decoratedShape
     */
    private void setRedBorder(Shape decoratedShape) {
        System.out.println(String.format("RedShapeDecorator类-》setRedBorder()设置边框颜色：Border Color: Red【对象信息：%s】", decoratedShape));
    }
}
