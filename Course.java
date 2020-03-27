import java.util.ArrayList;
import java.util.List;

class Course {
    private List<Student> students;

    public Course()
    {
        students = new ArrayList<>();
    }

    public void addStudent(String index, String firstName, String lastName, ArrayList<Integer> labPoints)
    {
        Student student = new Student(index, firstName, lastName, labPoints);
        students.add(student);
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void removeStudent(Student student)
    {
        students.remove(student);
    }

    public void printAllStudentsWithSignature()
    {
        for(Student s: students)
        {
            if(s.hasSignature())
            {
                System.out.println(s.getIndex() + "_" + s.getFirstName() + "_" + s.getLastName());
            }
        }
    }

    public void printStudentsWithAtLeast5AveragePoints()
    {
        for(Student s: students)
        {
            if(s.getAverage() >= 5)
            {
                System.out.println(s.getIndex() + "_" + s.getFirstName() + "_" + s.getLastName());
            }
        }
    }
}
