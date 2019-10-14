public class Cat extends Animal {

   Cat(String name, int age, Razmer razmer) {

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
        return "miayyyy";
    }

    @Override
    public String run() {
        return "walk how cat";
    }
}
