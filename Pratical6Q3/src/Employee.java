public class Employee {
    private String name;
    private int yearJoined;
    private double basicSalary;

    public Employee(String name, int yearJoined, double basicSalary){
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;

    }

    public String getname(){
        return name;
    }

    public int yearJoined(){
        return yearJoined;
    }

    public double basicSalary(){
        return basicSalary;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setyearJoined(int yearJoined){
        this.yearJoined = yearJoined;
    }

    public void setbasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }

    public  double calculateSalary(){
        return basicSalary;
    }

    public String toString(){
        return String.format("Name: %s\nYear Joined: %d, Basic Salary: %.2f", name, yearJoined, basicSalary);
    }
}
