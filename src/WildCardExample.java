import java.util.Arrays;

public class WildCardExample {

    public static void registerCourse(Course<?>course ){
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<? super Worker> course){
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));

    }

    public static void main(String[] args) {
        Course<Person3> person3Course = new Course<Person3>("일반인 과정", 5);
        person3Course.add(new Person3("일반인"));
        person3Course.add(new Worker("직장인"));
        person3Course.add(new Student3("학생"));
        person3Course.add(new HighStudent("고등학생"));


        Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
        workerCourse.add(new Worker("직장인"));


        Course<Student3> student3Course = new Course<>("학생 과정", 5);
        student3Course.add(new Student3("학생"));
        student3Course.add(new HighStudent("고등학생"));

        Course<HighStudent> HighStudentCourse = new Course<>("고등학생 과정", 5);
        HighStudentCourse.add(new HighStudent("고등학생"));

        registerCourse(person3Course);
        registerCourse(workerCourse);
        registerCourse(student3Course);
        registerCourse(HighStudentCourse);

        System.out.println();

    }
}
