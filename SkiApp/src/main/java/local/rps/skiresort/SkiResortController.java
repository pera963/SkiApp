package local.rps.skiresort;


import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import local.rps.countries.Country;

@RestController
public class SkiResortController {
  
	@Autowired
    SkiResortService skiresortService; 

	
	@RequestMapping("/skiresorts")
	  public List<SkiResort>getSkiResorts(){
    	return skiresortService.getAllSkiResorts();
    }
	@RequestMapping("/skiresorts/{id}")
	  public Optional<SkiResort> getSkiResortsByID(@PathVariable int id){
	return skiresortService.getSkiResortByID(id);
}
	
	@RequestMapping("/skiresorts/byName/{name}")
	  public List<SkiResort> getSkiResortsByName(@PathVariable String name){
  	return skiresortService.getSkiResortByName(name);
  }
	@RequestMapping(method=RequestMethod.POST, value="/skiresorts")
	  public void addSkiResorts(@RequestBody SkiResort c){
	         skiresortService.addSkiResort(c);
}
	@RequestMapping("/countries/{id}/skiresorts")
	  public List<SkiResort> getSkiResortsByCountryID(@PathVariable int id){
	return skiresortService.getSkiResortsByCoutryID(id);
}
	
	@RequestMapping(method=RequestMethod.POST, value="/countries/{id}/skiresorts")
	  public void addSkiResorts(@RequestBody SkiResort skiResort,@PathVariable int id){
	         skiResort.setCountry(new Country(id,"" ,""));
           skiresortService.addSkiResort(skiResort);
}	
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/skiresorts")
	  public void updateSkiResorts(@RequestBody SkiResort c){
	         skiresortService.updateSkiResort(c);
}

	@RequestMapping(method=RequestMethod.DELETE, value="/skiresorts/{id}")
	  public void removeSkiResortsByID(@PathVariable int id){
	         skiresortService.removeSkiResortByID(id);
}
	
	
	
	

}
