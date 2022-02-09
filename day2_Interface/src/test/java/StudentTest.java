import com.nf.oop2.CelloStudent;
import com.nf.oop2.ViolineStudent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void countModuls() {
        ViolineStudent b1 = new ViolineStudent("Alice", "Bob", 123);
        CelloStudent p1 = new CelloStudent("Bob", "Alice", 123456);

        assertEquals(20, p1.anzahlModule());
        assertEquals(25, b1.anzahlModule());
    }
}