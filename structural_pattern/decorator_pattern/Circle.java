package decorator_pattern;

/**
 * 圆形
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(String.format("Circle类-》draw()圆形绘图开始【对象信息：%s】", this));
    }
}
