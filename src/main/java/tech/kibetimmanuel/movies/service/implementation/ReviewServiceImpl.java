package tech.kibetimmanuel.movies.service.implementation;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import tech.kibetimmanuel.movies.model.Review;
import tech.kibetimmanuel.movies.repository.ReviewRepository;
import tech.kibetimmanuel.movies.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review addReview(Review review) {
        return reviewRepository.insert(review);
    }

    @Override
    public void deleteReview(ObjectId id) {
        reviewRepository.deleteById(id);
    }
}
