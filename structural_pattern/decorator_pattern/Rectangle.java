package decorator_pattern;

/**
 * 矩形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle 绘图对象信息：" + this);
        System.out.println("Shape: Rectangle");
    }
}
