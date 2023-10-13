import java.util.ArrayList;

public class Teacher extends Person {

    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;
    public Teacher(String name, ArrayList<String> canTeach, ArrayList<String> currentCourses) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String course) {

        for(String s: canTeach){
            if (course.equals(s)) {
                currentCourses.add(course);
                return true;
            }
        }
        return false;
    }
}
