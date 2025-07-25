public class Bear extends Mammal implements HasFur{

    public Bear(String name) {
        super(name);
    }

    @Override
    public boolean hasSpine() {
        return false;
    }

    @Override
    public boolean hasFur() {
        return true;
    }
}
