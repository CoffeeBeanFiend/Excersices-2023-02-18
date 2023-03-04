package exc_oop_1_to_7;

public class Student extends Person {
    private String typeOfStudy;
    private int yearOfStudy;
    private double priceOfStudy;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, double priceOfStudy) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.priceOfStudy = priceOfStudy;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public Student setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
        return this;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public Student setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
        return this;
    }

    public double getPriceOfStudy() {
        return priceOfStudy;
    }

    public Student setPriceOfStudy(double priceOfStudy) {
        this.priceOfStudy = priceOfStudy;
        return this;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n" +
                "Student{" +
                "typeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", priceOfStudy=" + priceOfStudy +
                '}';
    }
}
