package local.rps.skiresort;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SkiResortRepository extends JpaRepository<SkiResort,Integer>{
   
	public List<SkiResort>findByCountryId(Integer id);
	public List<SkiResort>findByName(String name);



 @Query("FROM SkiResort WHERE name=?1")
 public List<SkiResort>getByName(String name);


}

