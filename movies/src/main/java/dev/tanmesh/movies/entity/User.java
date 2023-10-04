package dev.tanmesh.movies.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //TODO: email will be Id, but for simplicity, it is ignored for now.

    @Id
    private ObjectId id;

    private String emailId;

    private String username;

    private String password;
}
