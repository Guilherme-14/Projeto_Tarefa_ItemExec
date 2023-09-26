package com.projetojpa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetojpa.entities.ItemExec;
import com.projetojpa.service.ItemExecService;

@RestController
@RequestMapping ("/itemExec")
public class ItemExecController {
	
	private final ItemExecService itemExecService;
    
    @Autowired
    public ItemExecController(ItemExecService itemExecService) {
        this.itemExecService = itemExecService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemExec> getProductById(@PathVariable Long id) {
    	ItemExec itemExec = itemExecService.getItemExecById(id);
        if (itemExec != null) {
            return ResponseEntity.ok(itemExec);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<ItemExec>> getAllItemExec() {
        List<ItemExec> ItemExec = itemExecService.getAllItemExec();
        return ResponseEntity.ok(ItemExec);
    }

    @PostMapping("/")
    public ResponseEntity<ItemExec> criarItemExec(@RequestBody ItemExec itemExec) {
    	ItemExec criarItemExec = itemExecService.salvarItemExec(itemExec);
        return ResponseEntity.status(HttpStatus.CREATED).body(criarItemExec);
    }
   

    @PutMapping("/{id}")
    public ResponseEntity<ItemExec> updateItemExec(@PathVariable Long id, @RequestBody ItemExec itemExec) {
    	ItemExec updatedItemExec = itemExecService.updateItemExec(id, itemExec);
        if (updatedItemExec != null) {
            return ResponseEntity.ok(updatedItemExec);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteItemExec(@PathVariable Long id) {
        boolean deleted = itemExecService.deleteItemExec(id);
        if (deleted) {
        	 return ResponseEntity.ok().body("O produto foi excluído com sucesso.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
