package com.sealyr.framework.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sealyr.framework.jpa.entity.BaseEntity;

@Entity
@Table(name = "t_user")
public class User extends BaseEntity {

  @Column(name = "username")
  private String username;
  
  @Column(name = "age")
  private Integer age;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
  
}
