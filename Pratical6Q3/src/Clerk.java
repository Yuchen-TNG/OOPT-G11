public class Clerk extends Employee {
    private double allowance;
    private int overtimeHours;
    private static double overtimeRate = 1.5;

    public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours){
        super (name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
        //static variable 不用
    }

    public double getallowance(){
        return allowance;
    }

    public void setallowance(double allowance){
        this.allowance = allowance;
    }
}
