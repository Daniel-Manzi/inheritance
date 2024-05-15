public class abstractclass {
}
public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal() {
    }
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void eat();
    public abstract String getVoice();
}
