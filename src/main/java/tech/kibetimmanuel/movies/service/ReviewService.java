package tech.kibetimmanuel.movies.service;

import org.bson.types.ObjectId;
import tech.kibetimmanuel.movies.model.Review;

public interface ReviewService {
    Review addReview(Review review);

    void deleteReview(ObjectId id);
}

