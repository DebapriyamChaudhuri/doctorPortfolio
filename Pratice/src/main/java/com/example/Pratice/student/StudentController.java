package com.example.Pratice.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "student")
public class StudentController
{
    private final  StudentService studentService; 

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @GetMapping("/all")
//    public ResponseEntity<List<Student>> getAllStudent () {
//        List<Student> students = StudentService.FindAllStudent();
//        return new ResponseEntity<>(students, HttpStatus.OK);
//    }

    @GetMapping("/get")
    public List<Student> getStudent()
    {
        return StudentService.FindAllStudent();
    }

   @PostMapping("/add")
   @CrossOrigin("*")
    public  String registerNewStudent(@RequestBody Student student)
    {
	   if(StudentService.FindByDate(student)==null ) {
		   StudentService.addNewStudent(student);
		   return null;
	   }
	   else {		   
		   return StudentService.ShowMsg();
	   }
    }

//    @PostMapping("/add")
//    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
//        Student newStudent = StudentService.addNewStudent(student);
//        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
//  
//    }
}
