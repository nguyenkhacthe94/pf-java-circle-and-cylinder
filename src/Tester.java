public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("red");
        circle.setRadius(2.5);
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder();
        cylinder.setColor("black");
        cylinder.setRadius(5);
        System.out.println(cylinder.toString());
    }
}
