/*
    *
    *
    Realis� par : FAHAM Hassan et BENAMAR Zaid
    *
    *
*/
package com.genuinecoder.springserver.model.command;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Command {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String description;
  private String prix;



  public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getDescription() {
	return description;
}



public void setDescription(String description) {
	this.description = description;
}



public String getPrix() {
	return prix;
}



public void setPrix(String prix) {
	this.prix = prix;
}



@Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", Description='" + description + '\'' +
        ", prix='" + prix + '\'' +
        '}';
  }
}
