import com.nf.day1.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getFirstnameTest() {
        //given
        Student student = new Student();
        student.setFirstname("Artem");
        //when
        String result = student.getFirstname();
        //then
        assertEquals("Artem", result);
    }

    @Test

    void setFirstnameTest() {
        //given
        Student student = new Student();
        //when
        student.setFirstname("Art");
        //then
        assertEquals("Art", student.getFirstname());
    }

    @Test
    void getLastnameTest() {
        //given
        Student student = new Student();
        student.setLastname("Muster");
        //when
        String result = student.getLastname();
        //then
        assertEquals("Muster", result);
    }

    @Test
    void setLastnameTest() {
        //given
        Student student = new Student();
        //when
        student.setLastname("Muster");
        //then
        assertEquals("Muster", student.getLastname());
    }

    @Test
    void getMatNrTest() {
        //given
        Student student = new Student();
        //when
        student.setMatNr("123456");
        //then
        assertEquals("123456", student.getMatNr());
    }

    @Test
    void setMatNrTest() {
        //given
        Student student = new Student();
        //when
        student.setMatNr("12345");
        //then
        assertEquals(student.getMatNr(), "12345");
    }

    @Test
    void ifPresentTest() {
        //given
        Student student = new Student();
        //when
        student.setIfPresent(true);
        //then
        assertTrue(student.ifPresent());
    }

    @Test
    void setEnrolledTest() {
        //given
        Student student = new Student();
        //when
        student.setIfPresent(false);
        //then
        assertFalse(student.ifPresent());
    }

    @Test
    void useConstructorWithtoStringTest() {
        //given
        Student student = new Student("Artem", "Muster", "123456", true);
        //when
        String result = student.toString();
        //then
        assertEquals("Student{firstname='Artem', lastname='Muster', matNr='123456', ifPresent=true}", result);
    }

    @Test
    void equalsAndHashTest() {
        Student student1 = new Student("Artem", "Muster", "123456", true);
        Student student2 = new Student("Artem", "Muster", "123456", true);

        assertEquals(student1, student2);
        assertEquals(student1.hashCode(), student2.hashCode());
        assertNotSame(student1, student2);

    }
}
