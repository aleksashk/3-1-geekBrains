package geekbrains.aleksandrphilimonov.task3;

public class MainApp {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        Box<Orange> orangeBox = new Box<Orange>();

        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());
        }

        for (int i = 0; i < 8; i++) {
            orangeBox.add(new Orange());
        }

        System.out.println("weight of the appleBox: " + appleBox.getWeight());

        System.out.println("weight of the orangeBox: " + orangeBox.getWeight());

        System.out.println("appleBox has weight, equals orangeBox: " + appleBox.compare(orangeBox));

        Box<Orange> orangeBox1 = new Box<>();

        for (int i = 0; i < 8; i++) {
            orangeBox1.add(new Orange());
        }

        System.out.println("weight of the orangeBox: " + orangeBox.getWeight());
        System.out.println("orangeBox has weight, equals orangeBox1: " + orangeBox.compare(orangeBox1));

        orangeBox.removeItems(orangeBox1);

        System.out.println("weight of the orangeBox: " + orangeBox1.getWeight());
        System.out.println("orangeBox has weight, equals orangeBox1: " + orangeBox.compare(orangeBox1));
    }
}
