import com.nf.oop.StudentRecord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentRecTest {

    @Test
    void changeFirstName() {
        StudentRecord s1 = new StudentRecord("Artem2", "Cello2", 1234);
        var s2 = s1.changeFirstName("ArtemRec");

        assertEquals("ArtemRec",s2.firstname());
    }
}