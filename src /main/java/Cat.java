public class Cat extends Mammal implements HasFur{
    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean hasFur() {
        return true;
    }

    @Override
    public boolean hasSpine() {
        return true;
    }
}
