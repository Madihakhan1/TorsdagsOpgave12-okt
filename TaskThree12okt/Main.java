import java.util.ArrayList;

public class Main {

    public static void main(String [] args) {

        ArrayList<String> passedCourses1 = new ArrayList<>();
        ArrayList<String> currentCoursesStudent1 = new ArrayList<>();
        passedCourses1.add("Java 1.0");
        currentCoursesStudent1.add("Jura");


        ArrayList<String> passedCourses2 = new ArrayList<>();
        ArrayList<String> currentCoursesStudent2 = new ArrayList<>();
        passedCourses2.add("Dansk");
        currentCoursesStudent2.add("Java");

        Student student1 = new Student("John", passedCourses1, currentCoursesStudent1);
        Student student2 = new Student("Ali", passedCourses2, currentCoursesStudent2);


        ArrayList<String> canTeach1 = new ArrayList<>();
        ArrayList<String> currentCoursesTeacher1 = new ArrayList<>();
        canTeach1.add("Dansk");
        currentCoursesStudent1.add("Dansk");

        ArrayList<String> canTeach2 = new ArrayList<>();
        ArrayList<String> currentCoursesTeacher2 = new ArrayList<>();
        canTeach2.add("Jura");
        canTeach2.add("Jura");

        Teacher teacher1 = new Teacher("Tess", canTeach1, currentCoursesTeacher1);
        Teacher teacher2 = new Teacher("Ole", canTeach2, currentCoursesTeacher2);

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

    for (Person p: persons) {

        boolean b = p.addCourse("Dansk");
        if (!b){
            if (p instanceof Student) {
                System.out.println(p.getName() + " har allerede bestået dette fag!");
            }
             else if (p instanceof Teacher){
                System.out.println(p.getName()+" kan ikke undervise i dette fag");
            }
        }

    }




    }
}
