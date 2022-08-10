package com.dd.dungeonsdragons.model.body.upperBody.arm.hand;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "LeftHand")
@Table(name = "LEFT_HAND_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeftHand extends AbstractEntity {

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "LEFT_HAND_STATUS", joinColumns = { @JoinColumn(name = "left_hand_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
