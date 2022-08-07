package com.dd.dungeonsdragons.model;

import com.dd.dungeonsdragons.model.Attributes.Mental;
import com.dd.dungeonsdragons.model.Attributes.Physical;
import com.dd.dungeonsdragons.model.body.Body;
import com.dd.dungeonsdragons.model.enums.*;
import com.dd.dungeonsdragons.model.enums.Class;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Character")
@Table(name = "CHARACTER_TBL")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Character extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "gender", nullable = false)
    private Gender gender;
    @Column(name = "race", nullable = false)
    private Race race;
    @Column(name = "sub_race", nullable = false)
    private SubRace subRace;
    @Column(name = "size", nullable = false)
    private Size size;
    @Column(name = "a_class", nullable = false)
    private Class aClass;
    @Column(name = "alignment", nullable = false)
    private Alignment alignment;

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "physical_id", referencedColumnName = "id")
    private Physical physical;

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "mental_id", referencedColumnName = "id")
    private Mental mental;

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "body_id", referencedColumnName = "id")
    private Body body;

}
