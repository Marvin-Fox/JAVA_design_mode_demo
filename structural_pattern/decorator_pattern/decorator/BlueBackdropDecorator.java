package decorator_pattern.decorator;

import decorator_pattern.Shape;

/**
 * 蓝色背景装饰器
 */
public class BlueBackdropDecorator extends ShapeDecorator {

    public BlueBackdropDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    /**
     * 重写绘画方法
     */
    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println(String.format("BlueBackdropDecorator类-》draw()【对象信息：%s】", decoratedShape));
        setBlueBackdrop(decoratedShape);
    }

    /**
     * 自己私有的装饰方法：加蓝色背景
     *
     * @param decoratedShape
     */
    private void setBlueBackdrop(Shape decoratedShape) {
        System.out.println(String.format("BlueBackdropDecorator类-》setBlueBackdrop()设置背景颜色：Backdrop Color: Blue【对象信息：%s】", decoratedShape));
    }
}
