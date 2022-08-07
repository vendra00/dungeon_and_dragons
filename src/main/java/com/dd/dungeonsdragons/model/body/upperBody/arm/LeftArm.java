package com.dd.dungeonsdragons.model.body.upperBody.arm;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "LeftArm")
@Table(name = "LEFT_ARM_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeftArm extends AbstractEntity {

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "LEFT_ARM_STATUS", joinColumns = { @JoinColumn(name = "left_arm_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
