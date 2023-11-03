package StudentRepository;

import DBContext.StudentDBContext;
import entity.Student;
import java.io.FileReader;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
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
public class UpdateWithData {

    public UpdateWithData() {
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
    public void testUpdateFromCSV() throws Exception {
        int totalTestCases = 0;
        int passedTestCases = 0;
        int failedTestCases = 0;

        try ( Reader reader = new FileReader("updateDataTest.csv");  CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader())) {

            IStudentRepository repo = new StudentRepository();

            for (CSVRecord record : csvParser) {
                int stt = 1;
                String id = record.get("id");
                String name = record.get("name");
                int semester = Integer.parseInt(record.get("semester"));
                String course = record.get("course");
                boolean expectedResult = Boolean.parseBoolean(record.get("expected")); // Lấy giá trị expected_result từ file CSV
                Student student = new Student(id, name, semester, course);

                totalTestCases++;
                
                Student updatedStudent = repo.update(student);

                boolean testResult = (updatedStudent == null ? false : updatedStudent.equals(student));

                if (testResult == expectedResult) {
                    passedTestCases++;
                } else {
                    failedTestCases++;
                    System.out.println("Test Case Failed (expected: " +expectedResult+") " + "#" + totalTestCases + ": id=" + id + ", name=" + name
                            + ", semester=" + semester + ", course=" + course);
                }
            }
        }

        System.out.println("Total Test Cases: " + totalTestCases);
        System.out.println("Passed Test Cases: " + passedTestCases);
        System.out.println("Failed Test Cases: " + failedTestCases);

        assertEquals("Number of failed test cases: " + failedTestCases, 0, failedTestCases);
        StudentDBContext.getInstance().close();
    }

}
