public class Course {
    private String courseTitle;
    private double feesPerstudent;
    private int noOfstudents;
    private String[] studentname = new String [100];
    private int courseCount;

    public Course(String courseTitle, double feesPerstudent){
        this.courseTitle = courseTitle;
        this.feesPerstudent = feesPerstudent;
        noOfstudents=0;
        courseCount ++;
    }

    public String getcourseTitle(){
        return courseTitle;
    }
    
}
