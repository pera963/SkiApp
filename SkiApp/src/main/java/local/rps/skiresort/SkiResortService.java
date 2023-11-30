package local.rps.skiresort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkiResortService {
 
	@Autowired
	SkiResortRepository skiresortRepository;
      
	public SkiResortService() {
       super();
         
    }
      
       public List<SkiResort>getAllSkiResorts(){
           return skiresortRepository.findAll();
    }      
       public Optional<SkiResort>getSkiResortByID(int id) {
		return skiresortRepository.findById(id);
      
		//  return countries.stream().filter(t ->(t.getId()==id)).findFirst().get; alternativni zapis,funkcionalno programiranje
       }
      
       public List<SkiResort>getSkiResortsByCoutryID(int id) {
   		return skiresortRepository.findByCountryId(Integer.valueOf(id));
       }
      
      // public List<SkiResort>getSkiResortByName(String name) {
      	//	return skiresortRepository.findByName(name);
       //   }
       public List<SkiResort>getSkiResortByName(String name) {
         		return skiresortRepository.getByName(name);   
       }
       
       public void addSkiResort(SkiResort c) {
           skiresortRepository.save(c);
      }

       public void updateSkiResort(SkiResort c) {
    	   skiresortRepository.save(c);
   	    
       }
     
       public void removeSkiResortByID(int id) {
    	   skiresortRepository.deleteById(id);
      	    }
          }


    
          






