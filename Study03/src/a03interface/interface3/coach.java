package a03interface.interface3;

public abstract class coach extends a03interface.interface3.person {
    public coach() {
    }

    public coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
