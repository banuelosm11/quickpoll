package com.apress.quickpoll.Repository;

/**
 * Created by aurorabanuelos on 6/21/17.
 */
import org.springframework.data.repository.CrudRepository;
import com.apress.quickpoll.Domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
