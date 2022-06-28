package br.com.boys2mans.LoginManager.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@Data
@NoArgsConstructor
@FieldDefaults( level = AccessLevel.PRIVATE)
@Builder
@AllArgsConstructor
@Entity(name = "RequestData")
public class RequestDataModel {

  @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
  long id;

    String ip;

    String systen;

    String browser;

    String geoLocalizationX;

    String geoLocalizationY;

    String request;

    @ManyToOne
    UserModel user;
}
