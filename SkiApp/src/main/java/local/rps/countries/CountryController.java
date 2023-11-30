package local.rps.countries;


import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
  
	@Autowired
    CountryService countryService; 

	
	@RequestMapping("/countries")
	  public List<Country>getCountries(){
    	return countryService.getAllCountries();
    }

	@RequestMapping("/countries/{id}")
	  public Optional<Country> getCountryByID(@PathVariable int id){
  	return countryService.getCountryByID(id);
  }
	@RequestMapping(method=RequestMethod.POST, value="/countries")
	  public void addCountry(@RequestBody Country c){
	         countryService.addCountry(c);
}

	@RequestMapping(method=RequestMethod.PUT, value="/countries")
	  public void updateCountry(@RequestBody Country c){
	         countryService.updateCountry(c);
}

	@RequestMapping(method=RequestMethod.DELETE, value="/countries/{id}")
	  public void removeCountryByID(@PathVariable int id){
	         countryService.removeCountryByID(id);
}
	
	
	
	

}
