package com.railscrud.cruddeployedrailway.service;

import com.railscrud.cruddeployedrailway.model.User;
import com.railscrud.cruddeployedrailway.model.UserPostDTO;
import com.railscrud.cruddeployedrailway.model.UserResponseDTO;
import com.railscrud.cruddeployedrailway.model.UserUpdateDTO;
import com.railscrud.cruddeployedrailway.model.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity postUser(@Valid  UserPostDTO dto, UriComponentsBuilder uriComponentsBuilder) {
        User newUser = new User(dto);
        newUser.rankCategory(dto.age());
        var uri = uriComponentsBuilder.path("/user/{id}").buildAndExpand(newUser.getId()).toUri();
        userRepository.save(newUser);
        return ResponseEntity.created(uri).body(new UserResponseDTO(newUser));
    }

    public ResponseEntity<Page<UserResponseDTO>> getAll(Pageable pageable){
        return ResponseEntity.ok(userRepository.findAll(pageable).map(UserResponseDTO::new));
    }

    public ResponseEntity getOne(Long id){
        var foundOne = userRepository.getReferenceById(id);
        return ResponseEntity.ok().body(new UserResponseDTO(foundOne));
    }

    public ResponseEntity updateUsere(UserUpdateDTO dto){
        User foundOne = userRepository.getReferenceById(dto.id());
        foundOne.rankCategory(dto.age());
        foundOne.update(dto);
        var newUser = userRepository.save(foundOne);
        return ResponseEntity.ok().body(new UserResponseDTO(newUser));
    }

    public ResponseEntity hardDelete(Long id){
        User userToDelete = userRepository.getReferenceById(id);
        userRepository.delete(userToDelete);
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }
}
