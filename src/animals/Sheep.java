package animals;

public class Sheep extends Animal{
    public Sheep(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "\n"+super.toString();
    }
}
