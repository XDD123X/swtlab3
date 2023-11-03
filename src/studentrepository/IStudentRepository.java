/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package studentrepository;

import entity.Student;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IStudentRepository {
    
    public Student insert(Student student);
    
    public Student update(Student student);
    
    public Student remove(String id);
        
    public Student get(String id);
    
    public List<Student> search(String name);
    
    public List<Student> getAll();
}
