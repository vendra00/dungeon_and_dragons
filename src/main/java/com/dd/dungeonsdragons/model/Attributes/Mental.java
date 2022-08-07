package com.dd.dungeonsdragons.model.Attributes;

import com.dd.dungeonsdragons.model.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Mental")
@Table(name = "MENTAL_TBL")
public class Mental extends AbstractEntity {
    @Column(name = "intelligence", nullable = false)
    private int intelligence;
    @Column(name = "wisdom", nullable = false)
    private int wisdom;
    @Column(name = "charisma", nullable = false)
    private int charisma;
    @Column(name = "luck", nullable = false)
    private int luck;
}
