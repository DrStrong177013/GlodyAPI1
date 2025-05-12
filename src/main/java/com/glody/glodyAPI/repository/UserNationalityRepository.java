package com.glody.glodyAPI.repository;

import com.glody.glodyAPI.model.entity.UserNationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserNationalityRepository extends JpaRepository<UserNationality, Integer> {
}