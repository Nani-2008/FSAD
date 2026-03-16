package com.klu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="UserDetails")
public class UserDetails {
   @Id
   int uid;
   @Column
   String UName;
   @Column
   String UAddr;
}