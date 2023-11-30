package local.rps.countries;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
 
	@Id
	public int id;
  public String name;
  public String description;

  public Country() {
	  
  }
  public Country(int id, String name, String description ) {
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
