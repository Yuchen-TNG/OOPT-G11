public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String name, int yearJoined, double basicSalary, double commissonRate, double grooSale){
        super(name,yearJoined,basicSalary);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getgrossSale(){
        return grossSale;
    }

    public void setgrossSale(double grossSale){
        this.grossSale = grossSale;
    }

    public double commissionRate(){
        return commissionRate;
    }

    public void setcommissionRate(double commissionRate){
        this.commissionRate = commissionRate;
    }

    public double calculateSalary(){
        return super.basicSalary() + (grossSale * commissionRate);
    }   


}
