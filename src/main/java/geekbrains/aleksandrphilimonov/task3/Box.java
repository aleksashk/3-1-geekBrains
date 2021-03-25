package geekbrains.aleksandrphilimonov.task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> arrayList;
    private float weight;

    public Box() {
        arrayList = new ArrayList<>();
        weight = 0.0f;
    }

    public Box(ArrayList<T> arrayList, float weight) {
        this.arrayList = arrayList;
        this.weight = weight;
    }

    public float getWeight() {
        float res = 0.0f;
        for (T item : arrayList) {
            res += item.getWeight();
        }
        return res;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(T item) {
        arrayList.add(item);
        this.weight += item.getWeight();
    }

    public boolean compare(Box<? extends Fruit> anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.00001;
    }

    public void removeItems(Box<T> dest, Box<T> src) {
        dest.weight = src.weight;
        src.weight = 0.0f;
        dest.arrayList = src.arrayList;
        src.arrayList = new ArrayList<>();
    }

}
