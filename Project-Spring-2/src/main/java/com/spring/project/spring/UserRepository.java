
package com.spring.project.spring;

/**
 *
 * @author manuel
 */

import com.domain.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    
    List<User> findAll();
    List<User> findByName(String name);
    User findById(long id);
}
