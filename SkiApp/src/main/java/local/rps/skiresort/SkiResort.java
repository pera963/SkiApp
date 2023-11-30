package local.rps.skiresort;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import local.rps.countries.Country;

@Entity
public class SkiResort {
 
	@Id
  private int id;
  private String name;
  private String description;
  
  @ManyToOne
  private Country country;
   
  public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
public SkiResort() {
	  
  }
  public SkiResort(int id, String name, String description ) {
	this.id=id;
	this.name=name;
	this.description=description;
}
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


}
