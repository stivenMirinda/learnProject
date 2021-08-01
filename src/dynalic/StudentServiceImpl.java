package dynalic;

public class StudentServiceImpl implements IStudentService{
    @Override
    public Student createStudent(String name, int age) {
        Student student = new Student("wangtao",32);
        return student;
    }
}
