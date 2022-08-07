package com.dd.dungeonsdragons.service;

import com.dd.dungeonsdragons.model.Character;

import java.util.List;

public interface CharacterService {

    Character createCharacter(Character character);

    List<Character> fetchAllCharacters();
}
