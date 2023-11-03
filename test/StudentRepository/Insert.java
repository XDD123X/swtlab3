/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package StudentRepository;

import DBContext.StudentDBContext;
import entity.Student;

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
public class Insert {

    public Insert() {
    }

    @BeforeClass
    public static void setUpClass() {
//        System.out.println("Before All");
    }

    @AfterClass
    public static void tearDownClass() {
//        System.out.println("After All");
    }

    @Before
    public void setUp() {
//        System.out.println("Before Each");
    }

    @After
    public void tearDown() {
//        System.out.println("After Each");
    }
//pass
    @Test
    public void TCPass() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 3;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);
        
        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();
        
        assertEquals(testResult, true);
    }
//testid
//    @Test
//    public void TCID1() {
//        String id = "HE720";
//        String name = "Nguyen Van A";
//        int semester = 1;
//        String course = ".NET";
//        Student student = new Student(id, name, semester, course);
//
//        IStudentRepository repo = new StudentRepository();
//        Student insertedStudent = repo.insert(student);
//        
//        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
//        StudentDBContext.getInstance().close();
//
//        assertEquals(testResult, false);
//        System.out.println("pass");
//    }

    @Test
    public void TCID1() {
        String id = "1Ee720";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test id 1 fail cause id not match format");
    }

    @Test
    public void TCID2() {
        String id = "";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test id 2 fail cause id is empty");
    }
    @Test
    public void TCID3() {
        String id = "HE121234";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test id 3 fail cause id is out of length");
        
    }

    @Test
    public void TCName1() {
        String id = "HE1720";
        String name = "";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test name 1 fail cause name is empty");
    }

    @Test
    public void TCName2() {
        String id = "HE1720";
        String name = "Nguyen V*n A";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test name 2 fail cause name contain special characters");
    }

    @Test
    public void TCName3() {
        String id = "HE1720";
        String name = "Nguyen Van 10";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test name 3 fail cause name is contain number");
    }
        public void TCName4() {
        String id = "HE1720";
        String name = "nguyen van a";
        int semester = 1;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test name 4 fail cause name is not capitalize");
    }

    @Test
    public void TCsemester1() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 0;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test semester 1 fail semester range 1-9");
    }

    @Test
    public void TCsemester2() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 10;
        String course = ".NET";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test semester 1 fail semester range 1-9");
    }

    @Test
    public void TCCourse1() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = "dotNet";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test course 1 fail cause name is not in this semester");
    }

    @Test
    public void TCCourse2() {
        String id = "HE1720";
        String name = "Nguyen Van A";
        int semester = 1;
        String course = "";
        Student student = new Student(id, name, semester, course);

        IStudentRepository repo = new StudentRepository();
        Student insertedStudent = repo.insert(student);
        
        boolean testResult = (insertedStudent == null ? false :insertedStudent.equals(student));
        StudentDBContext.getInstance().close();

        assertEquals(testResult, false);
        System.out.println("test course 1 fail cause name is empty");
    }
}