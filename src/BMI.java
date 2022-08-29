public class BMI {
    String name;
    int age;
    double weight;
    double height;

    double bodyMassIndex;
    
    String status;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

        this.bodyMassIndex = weight * 0.453592 / ((height * 0.0254) * (height * 0.0254));
        
        if (this.bodyMassIndex < 16){
            this.status = "Seriously Underweight";
        } else if (this.bodyMassIndex >= 16 && this.bodyMassIndex <24) {
            this.status = "Underweight";
        } else if (this.bodyMassIndex >= 24 && this.bodyMassIndex <= 29) {
            this.status = "Normal Weight";
        }
        else if (this.bodyMassIndex >= 30  && this.bodyMassIndex <=35 ) {
        this.status = "Overweight";}
        else this.status = "Morbidly Obese";

/*
        System.out.format(" | name | age | weight | height | BMI | %n | ");
        System.out.format(" | %s | %s | %s | %s | %s | %n | ", this.name, this.age, this.weight, this.height, getBMI());
*/
    }

    public BMI(String name, double weight, double height) {
        this.name = name;
        this.age = 20;
        this.weight = weight;
        this.height = height;

        this.bodyMassIndex = weight * 0.453592 / ((height * 0.0254) * (height * 0.0254));

        if (this.bodyMassIndex < 16){
            this.status = "Seriously Underweight";
        } else if (this.bodyMassIndex >= 16 && this.bodyMassIndex <24) {
            this.status = "Underweight";
        } else if (this.bodyMassIndex >= 24 && this.bodyMassIndex <= 29) {
            this.status = "Normal Weight";
        }
        else if (this.bodyMassIndex >= 30  && this.bodyMassIndex <=35 ) {
            this.status = "Overweight";}
        else this.status = "Morbidly Obese";
    }

    public static double getBMI() {
        BMI bmi1 = new BMI("name", 165, 68);
        return bmi1.bodyMassIndex;

    }

    public static String getStatus() {
        BMI bmi1 = new BMI("name", 10, 165, 68);
        return bmi1.status;
    }
}
