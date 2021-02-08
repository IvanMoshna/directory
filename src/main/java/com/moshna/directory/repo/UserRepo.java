package com.moshna.directory.repo;

import com.moshna.directory.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends CrudRepository<User, Long> {

    public User getByUsernameIgnoreCase(@Param("username") String username);
}
