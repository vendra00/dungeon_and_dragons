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
@Entity(name = "Physical")
@Table(name = "PHYSICAL_TBL")
public class Physical extends AbstractEntity {
    @Column(name = "strength", nullable = false)
    private int strength;
    @Column(name = "constitution", nullable = false)
    private int constitution;
    @Column(name = "dexterity", nullable = false)
    private int dexterity;
}
