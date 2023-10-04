package dev.tanmesh.movies.repository;

import dev.tanmesh.movies.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    Optional<User> findUserByEmailId(String emailId);

//    boolean addUser(User user);
}
