package com.dd.dungeonsdragons.model.body;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.body.head.Neck;
import com.dd.dungeonsdragons.model.body.upperBody.Chest;
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

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "neck_id", referencedColumnName = "id")
    private Neck neck;

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "chest_id", referencedColumnName = "id")
    private Chest chest;
}
