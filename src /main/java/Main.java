public class Main {
    public static void main(String[] args) {
        Fish fish1 = new Fish("Окунь");
        Cat cat1 = new Cat("Кошка");
        System.out.println(fish1.name + " живет в воде = " + fish1.isAquatic());
        System.out.println(cat1.name + " имеет мех = " + cat1.hasFur() + " и имеет позвоночник = " + cat1.hasSpine());
        }
}
