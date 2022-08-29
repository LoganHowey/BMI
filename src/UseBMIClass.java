public class UseBMIClass extends BMI {
    public UseBMIClass(String name, int age, double weight, double height) {
        super(name, age, weight, height);
    }

    public static void main(String[] args) {
        System.out.println(getBMI());
        System.out.println(getStatus());
    }
}
