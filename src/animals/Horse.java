package animals;

public class Horse extends Animal{
    public Horse(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "\n"+super.toString();
    }
}
