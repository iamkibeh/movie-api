package tech.kibetimmanuel.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import tech.kibetimmanuel.movies.model.Review;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
