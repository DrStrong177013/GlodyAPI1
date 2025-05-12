package com.glody.glodyAPI.repository;

import com.glody.glodyAPI.model.entity.UserProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProviderRepository extends JpaRepository<UserProvider, Integer> {
}