package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


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
}
