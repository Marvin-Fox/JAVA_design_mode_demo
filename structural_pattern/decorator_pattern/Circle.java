package decorator_pattern;

/**
 * 圆形
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle 绘图对象信息：" + this);
        System.out.println("Shape: Circle");
    }
}
