package br.com.boys2mans.LoginManager.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity(name = "User")

public class UserModel extends  TimeRegisterModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @NotBlank(message = "Please enter with your full name")
    @Length(min = 3)
    String userName;

    @Email
    @NotBlank(message = "Please  enter valid e-mail ")
    @Column(unique = true)
    String email;

    //TODO: implementar uma validação mais rigososa paa senhas
    @NotBlank(message = "Please  enter valid password")
    @Length(min = 4)
    String password;

    String token;

    LocalDateTime tokenValidationDate;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    final List<RequestDataModel> access = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    final List<AddressModel> address = new ArrayList<>();
}
