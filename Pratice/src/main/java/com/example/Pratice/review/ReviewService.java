package com.example.Pratice.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Pratice.student.Student;
import com.example.Pratice.student.StudentRepo;

@Service
public class ReviewService {
	
	private static ReviewRepo reviewRepo = null;
	public List<Review> findReview;
	
	
	 @Autowired
	    public ReviewService(ReviewRepo reviewRepo) {
	        this.reviewRepo = reviewRepo;
	    }

	    public static List<Review> FindAllReview()
	    {
	        return reviewRepo.findAll();
	    }

	    public static Review addNewReview(Review review)
	    {
	         return reviewRepo.save(review);
	    }

}
