public class StudentUtility {

    public static Student prepareStudent() {
        Student student = new Student();

        student.setName(InputUtility.askString("Enter the name of the student: "));
        student.setSurname(InputUtility.askString("Enter the surname of the student: "));
        student.setAge(InputUtility.askInt("How old is the student: "));
        student.setScholarship(InputUtility.askDouble("How many scholarships will the student get: "));

        University university = new University();
        university.setName(InputUtility.askString("In which university does the student study: "));

        student.setUniversity(university);

        return student;
    }
}
