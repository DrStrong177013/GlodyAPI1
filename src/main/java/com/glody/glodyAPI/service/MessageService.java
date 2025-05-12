package com.glody.glodyAPI.service;

import com.glody.glodyAPI.model.entity.Message;
import java.util.List;
import java.util.Optional;

public interface MessageService {
    List<Message> findAll();
    Optional<Message> findById(Integer id);
    Message save(Message entity);
    void deleteById(Integer id);
}