public class Cat {
    private String name;
    private char gender;
    private double Kg;

    public Cat(String name, char gender, double Kg) {
        this.name = name;
        this.gender = gender;
        this.Kg = Kg;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public double getWeightInKg() {
        return Kg;
    }
}

