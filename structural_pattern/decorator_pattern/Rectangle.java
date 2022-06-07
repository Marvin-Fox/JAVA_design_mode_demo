package decorator_pattern;

/**
 * 矩形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(String.format("Rectangle类-》draw()矩形绘图开始【对象信息：%s】", this));
    }
}
