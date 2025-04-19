import java.util.Date;

public class inpatient extends PatientBill {
    private int visitid;
    private String name;
    private double specialistcharges;
    private double labcharges;
    private String roomtype;
    private int durationofstay;

    public double calculateroomcharges(int durationofstay, double rate){
       double roomcharges = durationofstay * rate;
       return roomcharges;
    }

    public void calculatetotalcharges(double totalcharges){
        totalcharges = specialistcharges + labcharges + calculateroomcharges(roomcharges);
    }

    
}
