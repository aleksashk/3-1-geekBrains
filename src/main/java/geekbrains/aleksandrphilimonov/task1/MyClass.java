package geekbrains.aleksandrphilimonov.task1;

public class MyClass<T extends Number> {
    private T val;

    public MyClass(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "val=" + val;
    }
}
