package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity(name = "User")

public class UserModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String userName;

    String email;

    String password;

    LocalDateTime registrationDate;

    LocalDateTime lastAccessDate;

    String token;

    LocalDateTime tokenValidationDate;

    List<RequestDataModel> access;


}
