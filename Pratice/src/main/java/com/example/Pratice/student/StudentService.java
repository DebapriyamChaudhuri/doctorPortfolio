package com.example.Pratice.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService
{
    private static StudentRepo studentRepo;
    public List<Student> findStudent;
    
    
    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public static List<Student> FindAllStudent()
    {
        return studentRepo.findAll();
    }
    @Autowired
    public static Student addNewStudent(Student student)
    {
         return studentRepo.save(student);
    }
    public static String FindByDate(Student student)
    {
    	
    	String findByDate =  studentRepo.getByDate(student.getDate());
    	String findByTime = studentRepo.findByFtime(student.getFtime());
    	if(student.getDate().equals(findByDate) && student.getFtime().equals(findByTime)) {
    		return "hello";
    		
    	}
    	else {
    		return null;
    	}
    }
    public static String ShowMsg() {
    	return "Time-slot is not availble";
    	
    }
//    public static void pubTextSMS(Student student, String message, String phoneNumber) {
//        try {
//            PublishRequest request = PublishRequest.builder()
//                .message(message)
//                .phoneNumber(phoneNumber)
//                .build();
//
//            PublishResponse result = snsClient.publish(request);
//            System.out.println(result.messageId() + " Message sent. Status was " + result.sdkHttpResponse().statusCode());
//
//        } catch (SnsException e) {
//            System.err.println(e.awsErrorDetails().errorMessage());
//            System.exit(1);
//        }
//    }

}
