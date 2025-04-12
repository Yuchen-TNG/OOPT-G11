public class P4Q2 {

  public static void main(String[] args) {
    Student student = new Student("14WAB11223", "Wee Wong");

    student.addQuiz(8);
    student.addQuiz(7);
    student.addQuiz(9);

    System.out.print("Name: ");
    System.out.println(student.getname());

    System.out.print("Total score: ");
    System.out.println(student.gettotalquizscore());

    System.out.print("Average: ");
    System.out.println(student.getAverageScore());
  }

}
