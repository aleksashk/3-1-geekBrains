package geekbrains.aleksandrphilimonov.task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> arrayList;
    private float weight;

    public Box() {
        arrayList = new ArrayList<>();
        weight = 0.0f;
    }

    public float getWeight() {
        return arrayList.size() == 0 ? 0f : arrayList.get(0).getWeight() + arrayList.size();
    }

    public void add(T item) {
        arrayList.add(item);
        this.weight += item.getWeight();
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.00001;
    }

    public void removeItems(Box<T> dest) {
        dest.weight += weight;
        weight = 0.0f;
        dest.arrayList.addAll(arrayList);
        arrayList = new ArrayList<>();
    }

}
