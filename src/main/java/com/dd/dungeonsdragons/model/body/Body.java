package com.dd.dungeonsdragons.model.body;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.body.head.Head;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Body")
@Table(name = "BODY_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Body extends AbstractEntity {

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "head_id", referencedColumnName = "id")
    private Head head;
}
