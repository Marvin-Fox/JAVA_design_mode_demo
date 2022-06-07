package decorator_pattern;

import decorator_pattern.decorator.BlueBackdropDecorator;
import decorator_pattern.decorator.RedBorderDecorator;
import decorator_pattern.decorator.ShapeDecorator;

/**
 * 装饰器模式
 * 核心思想【对象功能的增强】
 * 主要目的在于增加对象的行为，关注于在一个对象上动态的添加方法。装饰者模式强调的是在不修改原本对象的前提下，使原本的对象"功能增强"
 */
public class Demo {

    public static void main(String[] args) {

        System.out.println("==================画圆形【直调，非装饰器模式】==================");
        Shape circleShape = new Circle();
        circleShape.draw();

        System.out.println("\n==================画圆形：装饰了红色边框【装饰器模式】==================");
        Circle circle = new Circle();
        System.out.println(String.format("main方法创建 new Circle() 圆形对象【对象信息：%s】", circle));
        ShapeDecorator redCircle = new RedBorderDecorator(circle);
        redCircle.draw();

        System.out.println("\n==================画矩形：装饰了红色边框 and 蓝色背景【装饰器模式】==================");
        Rectangle rectangle = new Rectangle();
        System.out.println(String.format("main方法创建 new Rectangle() 矩形对象【对象信息：%s】", rectangle));
        ShapeDecorator redRectangle = new RedBorderDecorator(new BlueBackdropDecorator(rectangle));
        redRectangle.draw();
    }
}
