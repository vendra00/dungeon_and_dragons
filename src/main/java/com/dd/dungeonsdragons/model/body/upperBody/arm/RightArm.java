package com.dd.dungeonsdragons.model.body.upperBody.arm;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import com.dd.dungeonsdragons.model.body.upperBody.arm.wrist.RightWrist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "RightArm")
@Table(name = "RIGHT_ARM_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RightArm extends AbstractEntity {

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "right_wrist_id", referencedColumnName = "id")
    private RightWrist rightWrist;

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "RIGHT_ARM_STATUS", joinColumns = { @JoinColumn(name = "right_arm_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
