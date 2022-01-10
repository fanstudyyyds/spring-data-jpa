package com.fan.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "goods")
@NoArgsConstructor
@AllArgsConstructor
public class Goods {

  @Id
  @Column(name = "id")
  private long id;
  private String name;
  private long uid;



}
