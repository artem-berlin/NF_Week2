import com.nf.oop.CelloStudent;
import com.nf.oop.Student;
import com.nf.oop.StudentDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getlistOfStudents() {
        Student artem1 = new CelloStudent("Artem", "Cello", 1234);
        CelloStudent artem2 = new CelloStudent("Artem2", "Cello2", 12354);
        Student[] students = {artem1, artem2};
        StudentDB studentDB = new StudentDB(students);

        assertEquals(students, studentDB.list());
    }

    @Test
    void returntringOfStudents() {
        CelloStudent artem1 = new CelloStudent("Artem", "Cello", 1234);
        CelloStudent[] students = {artem1};
        StudentDB studentDB = new StudentDB(students);

        assertEquals("[Student{firstname='Artem', lastname='Cello', id=1234}]", studentDB.toString());
    }

    @Test
    void showRandomStudents() {
        CelloStudent artem1 = new CelloStudent("Artem", "Cello", 1234);
        CelloStudent artem2 = new CelloStudent("Artem2", "Cello2", 1235);
        CelloStudent artem3 = new CelloStudent("Cello2", "Artem2", 1236);   // change first and lastname!!!
        CelloStudent[] students = {artem1, artem2, artem3};
        StudentDB studentDB = new StudentDB(students);
        System.out.println(studentDB.randomStudent());
    }

    @Test
    void addStudentToArrayTest() {
        CelloStudent artem1 = new CelloStudent("Artem2", "Cello2", 1235);
        CelloStudent[] students = new CelloStudent[0];
        StudentDB studentDB = new StudentDB(students);
        studentDB.add(artem1);

        assertEquals("Student{firstname='Artem2', lastname='Cello2', id=1235}", artem1.toString());
    }

    @Test
    void removeStudentToArrayTest() {
        CelloStudent artem1 = new CelloStudent("Artem2", "Cello2", 1235);
        CelloStudent[] students = new CelloStudent[0];
        StudentDB studentDB = new StudentDB(students);
        studentDB.add(artem1);
        studentDB.remove(artem1);

        assertEquals("[]", studentDB.toString());
    }


}