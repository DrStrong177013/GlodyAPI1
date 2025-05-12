package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.File;
import com.glody.glodyAPI.repository.FileRepository;
import com.glody.glodyAPI.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileRepository repository;

    @Override
    public List<File> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<File> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public File save(File entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}