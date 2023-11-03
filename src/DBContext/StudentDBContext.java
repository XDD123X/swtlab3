/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBContext;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class StudentDBContext {
    public List<Student> students = new ArrayList<Student>() {
        {
            add(new Student("HE1234","Nguyen Van A", 3, ".NET"));
            add(new Student("HE1246","Nguyen Van B", 3, ".NET"));
            add(new Student("HE2234","Nguyen Van A", 3, ".NET"));
            add(new Student("HE3246","Nguyen Van B", 3, ".NET"));
            add(new Student("HE4234","Nguyen Van A", 3, ".NET"));
            add(new Student("HE5246","Nguyen Van B", 3, ".NET"));
            add(new Student("HE6234","Nguyen Van A", 3, ".NET"));
            add(new Student("HE7246","Nguyen Van B", 3, ".NET"));
            add(new Student("HE8234","Nguyen Van A", 3, ".NET"));
            add(new Student("HE9246","Nguyen Van B", 3, ".NET"));
            add(new Student("HE1946","Nguyen Van B", 3, ".NET"));
            add(new Student("HE1846","Nguyen Van B", 3, ".NET"));
            add(new Student("HE1734","Nguyen Van A", 3, ".NET"));
            add(new Student("HE1646","Nguyen Van B", 3, ".NET"));
            
            
        }
        
    };
    
    private static StudentDBContext instance = null;
    
    private StudentDBContext() {
        
    }
    
    public static synchronized StudentDBContext getInstance() {
        if (instance == null) {
            instance = new StudentDBContext();
        }
        return instance;
    }
    
    public void close() {
        instance = null;
        System.gc();
    }
    
    public Student insert(Student student) {
        if (get(student.getId()) != null) return null;
        if (!Pattern.compile("(^HE)([0-9]{4}$)").matcher(student.getId().toUpperCase()).find() || student.getId().length() != 6) return null;
        if (Pattern.compile("[^A-Z ]").matcher(student.getName().toUpperCase()).find()) return null;
        if (!student.getCourse().equalsIgnoreCase("java") && !student.getCourse().equalsIgnoreCase(".net") && !student.getCourse().equalsIgnoreCase("c/c++")) return null;
        if (student.getSemester() < 1 || student.getSemester() > 9) return null;
        students.add(student);
        return get(student.getId());
    }
    
    public Student update(Student student) {
        Student oldStudent = get(student.getId());
        
        if (oldStudent == null) return null;
        if (!oldStudent.getName().equalsIgnoreCase(student.getName())) return null;
        if (oldStudent.equals(student)) return null;
        if (!Pattern.compile("(^HE)([0-9]{4}$)").matcher(student.getId().toUpperCase()).find() || student.getId().length() != 6) return null;
        if (Pattern.compile("[^A-Z ]").matcher(student.getName().toUpperCase()).find()) return null;
        if (!student.getCourse().toLowerCase().equals("java") && !student.getCourse().toLowerCase().equals(".net") && !student.getCourse().toLowerCase().equals("c/c++")) return null;
        if (student.getSemester() < 1 || student.getSemester() > 9) return null;
        oldStudent.setId(student.getId());
        oldStudent.setName(student.getName());
        oldStudent.setSemester(student.getSemester());
        oldStudent.setCourse(student.getCourse());
        return get(student.getId());
    }
    
    public Student remove(String id) {
        Student student = get(id);
        if (student == null) return null;
        students.remove(student);
        return student;
    }
    
    public Student get(String id) {
        Student ret = null;
        for (Student student : students) {
            if (student.getId().equalsIgnoreCase(id)) {
                ret = student;
                break;
            }
        }
        return ret;
    }
    
    public List<Student> search(String name) {
        List<Student> studentWithName = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {     
                studentWithName.add(student);
            }
        }
        return studentWithName;
    }
    
    public List<Student> getStudents() {
        return students;
    }
}
