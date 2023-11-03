/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrepository;

import DBContext.StudentDBContext;
import entity.Student;
import java.util.List;

/**
 *
 * @author Asus
 */
public class StudentRepository implements IStudentRepository{

    @Override
    public Student insert(Student student) {
        return StudentDBContext.getInstance().insert(student);
    }

    @Override
    public Student update(Student student) {
        return StudentDBContext.getInstance().update(student);
    }

    @Override
    public Student remove(String id) {
        return StudentDBContext.getInstance().remove(id);
    }

    @Override
    public Student get(String id) {
        return StudentDBContext.getInstance().get(id);
    }

    @Override
    public List<Student> search(String name) {
        return StudentDBContext.getInstance().search(name);
    }

    @Override
    public List<Student> getAll() {
        return StudentDBContext.getInstance().getStudents();
    }
    
    
}
