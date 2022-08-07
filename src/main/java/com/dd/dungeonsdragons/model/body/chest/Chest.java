package com.dd.dungeonsdragons.model.body.chest;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import com.dd.dungeonsdragons.model.body.chest.arm.LeftArm;
import com.dd.dungeonsdragons.model.body.chest.arm.RightArm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Chest")
@Table(name = "CHEST_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chest extends AbstractEntity {

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "right_arm_id", referencedColumnName = "id")
    private RightArm rightArm;

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "left_arm_id", referencedColumnName = "id")
    private LeftArm leftArm;

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "CHEST_STATUS", joinColumns = { @JoinColumn(name = "chest_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
