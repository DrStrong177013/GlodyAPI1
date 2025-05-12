package com.glody.glodyAPI.service.impls;

import com.glody.glodyAPI.model.entity.Message;
import com.glody.glodyAPI.repository.MessageRepository;
import com.glody.glodyAPI.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository repository;

    @Override
    public List<Message> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Message> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Message save(Message entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}