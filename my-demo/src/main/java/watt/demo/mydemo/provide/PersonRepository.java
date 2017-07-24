package watt.demo.mydemo.provide;

import org.springframework.data.repository.CrudRepository;
import watt.demo.mydemo.entity.UserData;

public interface PersonRepository extends CrudRepository<UserData, Long> {

}
