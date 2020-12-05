package com.abdullah.model;


import com.abdullah.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mentor {
  private String firstName;
  private String lastName;
  private int id;
  private Gender gender;

}
