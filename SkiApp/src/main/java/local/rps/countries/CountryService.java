package local.rps.countries;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
 
	@Autowired
	CountryRepository countryRepository;
      
	public CountryService() {
       super();
         
    }
      
       public List<Country>getAllCountries(){
           return countryRepository.findAll();
    }      
       public Optional<Country>getCountryByID(int id) {
		return countryRepository.findById(id);
      
		//  return countries.stream().filter(t ->(t.getId()==id)).findFirst().get; alternativni zapis,funkcionalno programiranje
       }
       public void addCountry(Country c) {
           countryRepository.save(c);
      }

       public void updateCountry(Country c) {
    	   countryRepository.save(c);
   	    
       }
     
       public void removeCountryByID(int id) {
    	   countryRepository.deleteById(id);
      	    }
          }


    
          






