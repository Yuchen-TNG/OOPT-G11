public class Student {
    private String studentID;
    private String name;
    private int numberofquiz;
    private double totalquizscore;
//Default
public Student(){}
//Two constructor 
public Student(String studentID, String name){
    this.studentID=studentID;
    this.name=name;
}

public String getstudentID(){
    return studentID;
}

public String getname(){
    return name;
}

public int getnumberofquiz(){
    return numberofquiz;
}

public double gettotalquizscore(){
    return totalquizscore;
}

public void setstudentID(String studentID){
    this.studentID= studentID;
}

public void setname(String name){
    this.name= name;
}

public double getAverageScore(){
    return totalquizscore / numberofquiz;
}

public void addQuiz(int score) {
    totalquizscore = totalquizscore + score;
    numberofquiz = numberofquiz + 1;
 }

}

