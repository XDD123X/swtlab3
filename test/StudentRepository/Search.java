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
public class Search {
    
    public Search() {
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
        String name = "A";
        
        IStudentRepository repo = new StudentRepository();
        List<Student> searchedStudents = repo.search(name);
        List<Student> students = StudentDBContext.getInstance().students;
        boolean testResult = true;
        
        for (Student s : students) {
            if (searchedStudents.contains(s)) {
                if (!s.getName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            } else {
                if (s.getName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            }
        }
        
        StudentDBContext.getInstance().close();
        assertEquals(testResult, true);
    }
    
    @Test
    public void TC02() {
        String name = "B";
        
        IStudentRepository repo = new StudentRepository();
        List<Student> searchedStudents = repo.search(name);
        List<Student> students = StudentDBContext.getInstance().students;
        boolean testResult = true;
        System.out.println(searchedStudents);
        for (Student s : students) {
            if (searchedStudents.contains(s)) {
                if (!s.getName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            } else {
                if (s.getName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            }
        }
        
        StudentDBContext.getInstance().close();
        assertEquals(testResult, true);
    }
    
    @Test
    public void TC03() {
        String name = "D";
        
        IStudentRepository repo = new StudentRepository();
        List<Student> searchedStudents = repo.search(name);
        List<Student> students = StudentDBContext.getInstance().students;
        boolean testResult = true;
        for (Student s : students) {
            if (searchedStudents.contains(s)) {
                if (!s.getName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            } else {
                if (s.getName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            }
        }
        
        StudentDBContext.getInstance().close();
        assertEquals(testResult, true);
    }
    
    @Test
    public void TC04() {
        String name = "10";
        
        IStudentRepository repo = new StudentRepository();
        List<Student> searchedStudents = repo.search(name);
        List<Student> students = StudentDBContext.getInstance().students;
        boolean testResult = true;
        for (Student s : students) {
            if (searchedStudents.contains(s)) {
                if (!s.getName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            } else {
                if (s.getName().toLowerCase().contains(name.toLowerCase())) {
                    testResult = false;
                }
            }
        }
        
        StudentDBContext.getInstance().close();
        assertEquals(testResult, true);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
