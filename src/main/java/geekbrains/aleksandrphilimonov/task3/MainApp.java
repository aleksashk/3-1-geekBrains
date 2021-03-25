package geekbrains.aleksandrphilimonov.task3;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        Box<Orange> orangeBox = new Box<Orange>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println("number of apples in the appleBox: " + appleBox.getArrayList().size());
        System.out.println("weight of the appleBox: " + appleBox.getWeight());
        System.out.println("number of oranges in the orangeBox: " + orangeBox.getArrayList().size());
        System.out.println("weight of the orangeBox: " + orangeBox.getWeight());

        System.out.println("appleBox has weight, equals orangeBox: " + appleBox.compare(orangeBox));

        Box<Orange> orangeBox1= new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        System.out.println("number of oranges in the orangeBox: " + orangeBox.getArrayList().size());
        System.out.println("weight of the orangeBox: " + orangeBox.getWeight());
        System.out.println("orangeBox has weight, equals orangeBox1: " + orangeBox.compare(orangeBox1));
    }
}
