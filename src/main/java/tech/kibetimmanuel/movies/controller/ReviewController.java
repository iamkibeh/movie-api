package tech.kibetimmanuel.movies.controller;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.kibetimmanuel.movies.model.Review;
import tech.kibetimmanuel.movies.service.implementation.ReviewServiceImpl;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {


    private final ReviewServiceImpl reviewService;

    public ReviewController(ReviewServiceImpl reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/")
    public ResponseEntity<Review> addReview(Review review ){
        return new ResponseEntity<Review>(reviewService.addReview(review), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteReview( @PathVariable ObjectId id){
        reviewService.deleteReview(id);
    }
}
