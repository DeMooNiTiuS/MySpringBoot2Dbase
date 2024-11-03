package ru.massalskiy.MySpringBoot2Dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.massalskiy.MySpringBoot2Dbase.entity.ActionResult;
import ru.massalskiy.MySpringBoot2Dbase.entity.Student;
import ru.massalskiy.MySpringBoot2Dbase.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyStudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> allStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public ActionResult<Student> getStudent(@PathVariable("id") int id) {
        Student res;
        try {
            res = studentService.getStudent(id);
        } catch (Exception e) {
            res = null;
        }
        return new ActionResult<>(res, res != null);
    }

    @PostMapping("/students")
    public ActionResult<Student> saveStudent(@RequestBody Student student) {
        Student res;
        try {
            res = studentService.saveStudent(student);
        } catch (Exception e) {
            res = null;
        }
        return new ActionResult<>(res, res != null);
    }

    @PutMapping("/students")
    public ActionResult<Student> updateStudent(@RequestBody Student student) {
        Student res;
        try {
            res = studentService.saveStudent(student);
        } catch (Exception e) {
            res = null;
        }
        return new ActionResult<>(res, res != null);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }
}
