package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.File;
import java.util.List;
import java.util.Optional;

public interface FileService {
    List<File> findAll();
    Optional<File> findById(Integer id);
    File save(File entity);
    void deleteById(Integer id);
}