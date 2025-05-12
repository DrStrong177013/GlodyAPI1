package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.UserNationality;
import java.util.List;
import java.util.Optional;

public interface UserNationalityService {
    List<UserNationality> findAll();
    Optional<UserNationality> findById(Integer id);
    UserNationality save(UserNationality entity);
    void deleteById(Integer id);
}