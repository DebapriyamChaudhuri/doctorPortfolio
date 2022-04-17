package com.example.Pratice.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "review")
public class ReviewController {
	
	private final  ReviewService reviewService; 

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

   @PostMapping("/add")
   @CrossOrigin("*")
    public void registerNewReview(@RequestBody Review review)
    {
//	   System.out.println("Hello,"+review.getName()+" Your appointment has been booked");
        ReviewService.addNewReview(review);
       
    }

}
