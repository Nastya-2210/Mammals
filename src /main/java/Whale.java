public class Whale extends Mammal implements IsAquatic{
    public Whale(String name) {
        super(name);
    }

    @Override
    public boolean hasSpine() {
        return true;
    }

    @Override
    public boolean isAquatic() {
        return true;
    }
}
