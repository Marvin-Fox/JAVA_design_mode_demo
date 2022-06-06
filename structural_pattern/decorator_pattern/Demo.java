package decorator_pattern;

/**
 * 装饰器模式
 */
public class Demo {

    public static void main(String[] args) {

        Shape circleShape = new Circle();

        Circle circle = new Circle();
        System.out.println("创建 circle 对象信息：" + circle);
        ShapeDecorator redCircle = new RedShapeDecorator(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println("创建 rectangle 对象信息：" + rectangle);
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);

//        Shape redCircle = new RedShapeDecorator(circle);
//        Shape redRectangle = new RedShapeDecorator(rectangle);
        System.out.println("Circle with normal border");
        circleShape.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
