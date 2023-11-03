/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package StudentRepository;

import DBContext.StudentDBContext;
import entity.Student;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import studentrepository.IStudentRepository;
import studentrepository.StudentRepository;

/**
 *
 * @author Asus
 */
public class Remove {

    public Remove() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TC01() {
        String id = "HE1234";

        IStudentRepository repo = new StudentRepository();
        Student deletedStudent = repo.remove(id);

        boolean testResult = !(deletedStudent == null);
        if (deletedStudent != null) {
            List<Student> students = StudentDBContext.getInstance().students;

            for (Student s : students) {
                if (s.equals(deletedStudent)) {
                    testResult = false;
                    break;
                }
            }
        }
        StudentDBContext.getInstance().close();
        assertEquals(testResult, true);

    }

    @Test
    public void TC02() {
        String id = "HE234";

        IStudentRepository repo = new StudentRepository();
        Student deletedStudent = repo.remove(id);

        boolean testResult = !(deletedStudent == null);

        if (deletedStudent != null) {
            List<Student> students = StudentDBContext.getInstance().students;

            for (Student s : students) {
                if (s.equals(deletedStudent)) {
                    testResult = false;
                    break;
                }
            }
        }
        StudentDBContext.getInstance().close();
        assertEquals(testResult, false);

    }

    @Test
    public void TC03() {
        String id = "he1234";

        IStudentRepository repo = new StudentRepository();
        Student deletedStudent = repo.remove(id);

        boolean testResult = !(deletedStudent == null);
        if (deletedStudent != null) {
            List<Student> students = StudentDBContext.getInstance().students;

            for (Student s : students) {
                if (s.equals(deletedStudent)) {
                    testResult = false;
                    break;
                }
            }
        }
        StudentDBContext.getInstance().close();
        assertEquals(testResult, true);

    }

    @Test
    public void TC04() {
        String id = "HF1234";

        IStudentRepository repo = new StudentRepository();
        Student deletedStudent = repo.remove(id);

        boolean testResult = !(deletedStudent == null);
        if (deletedStudent != null) {
            List<Student> students = StudentDBContext.getInstance().students;

            for (Student s : students) {
                if (s.equals(deletedStudent)) {
                    testResult = false;
                    break;
                }
            }
        }
        StudentDBContext.getInstance().close();
        assertEquals(testResult, false);

    }
    
    @Test
    public void TC05() {
        String id = "HF12346";

        IStudentRepository repo = new StudentRepository();
        Student deletedStudent = repo.remove(id);

        boolean testResult = !(deletedStudent == null);
        if (deletedStudent != null) {
            List<Student> students = StudentDBContext.getInstance().students;

            for (Student s : students) {
                if (s.equals(deletedStudent)) {
                    testResult = false;
                    break;
                }
            }
        }
        StudentDBContext.getInstance().close();
        assertEquals(testResult, false);

    }
    
    @Test
    public void TC06() {
        String id = "HE1720";

        IStudentRepository repo = new StudentRepository();
        Student deletedStudent = repo.remove(id);

        boolean testResult = !(deletedStudent == null);
        if (deletedStudent != null) {
            List<Student> students = StudentDBContext.getInstance().students;

            for (Student s : students) {
                if (s.equals(deletedStudent)) {
                    testResult = false;
                    break;
                }
            }
        }
        StudentDBContext.getInstance().close();
        assertEquals(testResult, false);

    }
    
    @Test
    public void TC07() {
        String id = "HEF720";

        IStudentRepository repo = new StudentRepository();
        Student deletedStudent = repo.remove(id);

        boolean testResult = !(deletedStudent == null);
        if (deletedStudent != null) {
            List<Student> students = StudentDBContext.getInstance().students;

            for (Student s : students) {
                if (s.equals(deletedStudent)) {
                    testResult = false;
                    break;
                }
            }
        }
        StudentDBContext.getInstance().close();
        assertEquals(testResult, false);

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
