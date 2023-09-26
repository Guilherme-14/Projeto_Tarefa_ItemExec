package com.projetojpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetojpa.entities.ItemExec;
import com.projetojpa.repository.ItemExecRepository;

@Service
public class ItemExecService {
	
	private final ItemExecRepository itemExecRepository;
    
    @Autowired
    public ItemExecService(ItemExecRepository itemExecRepository) {
        this.itemExecRepository = itemExecRepository;
    }

    public List<ItemExec> getAllItemExec() {
        return itemExecRepository.findAll();
    }

    public ItemExec getItemExecById(Long id) {
        Optional<ItemExec> itemExec = itemExecRepository.findById(id);
        return itemExec.orElse(null);
    }

    public ItemExec salvarItemExec(ItemExec itemExec) {
        return itemExecRepository.save(itemExec);
    }

    public ItemExec updateItemExec(Long id, ItemExec updatedItemExec) {
        Optional<ItemExec> existingItemExec = itemExecRepository.findById(id);
        if (existingItemExec.isPresent()) {
            updatedItemExec.setid(id);
            return itemExecRepository.save(updatedItemExec);
        }
        return null;
    }

    public boolean deleteItemExec(Long id) {
        Optional<ItemExec> existingItemExec = itemExecRepository.findById(id);
        if (existingItemExec.isPresent()) {
        	itemExecRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
