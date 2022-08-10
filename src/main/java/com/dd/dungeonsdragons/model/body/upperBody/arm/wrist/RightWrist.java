package com.dd.dungeonsdragons.model.body.upperBody.arm.wrist;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import com.dd.dungeonsdragons.model.body.upperBody.arm.hand.RightHand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "RightWrist")
@Table(name = "RIGHT_WRIST_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RightWrist extends AbstractEntity {

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "right_hand_id", referencedColumnName = "id")
    private RightHand rightHand;

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "RIGHT_WRIST_STATUS", joinColumns = { @JoinColumn(name = "right_wrist_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
