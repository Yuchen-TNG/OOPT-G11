public class outpatient extends PatientBill{
    private int visit_Id;
    private String name;
    private static double registration_fees = 30.00;
    private double consultation_fees;

    public void calculatetotalcharges(double totalcharges){
        totalcharges = registration_fees + consultation_fees;
        
    }

    
}
