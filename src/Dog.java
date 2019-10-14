public class Dog extends Animal {

    Dog(String name, int age, Razmer razmer) {

        this.name = name;
        this.age = age;
        this.razmer = razmer;

    }


    @Override
    void display() {
        System.out.println("name: " + name + "  age: " + age + "   size: " + razmer);
    }

    @Override
    public String scream() {
        return "Gav, epta";
    }

    @Override
    public String run() {
        return "Walk how doggg";
    }
}
