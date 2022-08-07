package com.dd.dungeonsdragons.service;

import com.dd.dungeonsdragons.model.Character;
import com.dd.dungeonsdragons.repository.CharacterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @Slf4j
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository repository;

    public CharacterServiceImpl(CharacterRepository repository) {this.repository = repository;}

    @Override
    public Character createCharacter(Character character) {
        log.info("Create Characters - Service Call");
        return repository.save(character);
    }

    @Override
    public List<Character> fetchAllCharacters() {
        log.info("Get All Characters - Service Call");
        return repository.findAll();
    }
}
