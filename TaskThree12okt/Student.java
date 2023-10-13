import java.util.ArrayList;

public class Student extends Person {

private ArrayList<String> passedCourses = new ArrayList<>();
private ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }


    @Override
    public boolean addCourse(String course) {

       for(String s: passedCourses){
           if (course.equals(s)) {
               return false;
           }
       }
       currentCourses.add(course);
       return true;
    }
}
