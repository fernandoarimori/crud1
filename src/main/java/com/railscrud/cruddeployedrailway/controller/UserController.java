package com.railscrud.cruddeployedrailway.controller;

import com.railscrud.cruddeployedrailway.model.UserPostDTO;
import com.railscrud.cruddeployedrailway.model.UserUpdateDTO;
import com.railscrud.cruddeployedrailway.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity postUserCtrl(@Valid @RequestBody UserPostDTO dto, UriComponentsBuilder uriComponentsBuilder) {
        return userService.postUser(dto, uriComponentsBuilder);
    }

    @GetMapping
    public ResponseEntity getAllUserCtrl(@PageableDefault(size = 10, sort = "id") Pageable pageable) {
        return userService.getAll(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOneCtrl(@PathVariable Long id){
        return userService.getOne(id);
    }

    @PutMapping
    public ResponseEntity updateUserCrtl(@RequestBody UserUpdateDTO dto){
        return userService.updateUsere(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity hardDeleteCtrl(@PathVariable Long id){
        return userService.hardDelete(id);
    }
}
