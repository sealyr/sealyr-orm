package com.sealyr.framework.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sealyr.framework.jpa.entity.AuditEntity;

@Entity
@Table(name = "t_user_address")
public class UserAddress extends AuditEntity {
 
  @Column(name = "address")
  private String address;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  
  
  
}
