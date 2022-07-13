public class animal {
    int age;
    int weight;

    animal(int age,int weight) {
        this.age=age;
        this.weight=weight;
    }

    void running(){
        System.out.println("running");
    }
    void eating(){
        System.out.println("eating");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}
