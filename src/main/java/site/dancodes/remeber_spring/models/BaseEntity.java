package site.dancodes.remeber_spring.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@MappedSuperclass()
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class BaseEntity {
 @Id()
 @GeneratedValue(strategy = GenerationType.UUID)
 protected String id;


 @Column(name = "created_at")
 @CreatedDate()
 protected Date creationDate;

 @Column(name = "modified_at")
 @LastModifiedDate()
 protected Date modifyDate;


 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public Date getCreationDate() {
  return creationDate;
 }

 public void setCreationDate(Date creationDate) {
  this.creationDate = creationDate;
 }

 public Date getModifyDate() {
  return modifyDate;
 }

 public void setModifyDate(Date modifyDate) {
  this.modifyDate = modifyDate;
 }
}
