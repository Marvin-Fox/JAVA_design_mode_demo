package decorator_pattern;

/**
 * 装饰器模式
 */
public class Demo {

    public static void main(String[] args) {

        System.out.println("==================Circle 圆形边框：正常【直调，非装饰器模式】==================");
        Shape circleShape = new Circle();
        circleShape.draw();

        System.out.println("\n==================Circle 圆形边框：red【装饰器模式】==================");
        Circle circle = new Circle();
        System.out.println(String.format("main方法创建 new Circle() 圆形对象【对象信息：%s】", circle));
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

        System.out.println("\n==================Rectangle 矩形边框：red【装饰器模式】==================");
        Rectangle rectangle = new Rectangle();
        System.out.println(String.format("main方法创建 new Rectangle() 矩形对象【对象信息：%s】", rectangle));
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();
    }
}
