package com.fan.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "gender")
public class Gender {

  @Id
  @Column(name = "id")
  private long id;
  private String sex;
}
