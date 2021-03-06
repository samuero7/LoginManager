package br.com.boys2mans.LoginManager.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity(name = "Authorization")
public class AuthorizationModel extends  TimeRegisterModel{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long Id;
    String accessLevel;

}
