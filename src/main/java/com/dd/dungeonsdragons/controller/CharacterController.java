package com.dd.dungeonsdragons.controller;

import com.dd.dungeonsdragons.model.Character;
import com.dd.dungeonsdragons.service.CharacterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/character")
public class CharacterController {
    private final CharacterService service;

    public CharacterController(CharacterService service) {this.service = service;}

    @GetMapping("/find-all-characters")
    public ResponseEntity<List<Character>> getAllCharacters(){
        log.info("Find All Characters - Controller Call");
        return ResponseEntity.ok(service.fetchAllCharacters());
    }

    @PostMapping({ "/create-character/" })
    public ResponseEntity<Character> addSurveyUser(@RequestBody Character newCharacter)  {
        log.info("Create Character - Controller Call");
        Character userBody = service.createCharacter(newCharacter);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userBody.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
