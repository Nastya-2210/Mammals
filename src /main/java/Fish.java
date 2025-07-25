public class Fish extends Animal implements IsAquatic{

    public Fish(String name) {
        super(name);
    }

    @Override
    public boolean isAquatic() {
        return true;
    }
}
