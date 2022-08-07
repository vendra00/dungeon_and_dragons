package com.dd.dungeonsdragons.model.body.head;

import com.dd.dungeonsdragons.model.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "LeftEye")
@Table(name = "LEFT_EYE_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeftEye extends AbstractEntity {
    private String eyeColor;
}
