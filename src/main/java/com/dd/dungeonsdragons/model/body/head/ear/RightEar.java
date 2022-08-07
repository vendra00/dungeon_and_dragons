package com.dd.dungeonsdragons.model.body.head.ear;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "RightEar")
@Table(name = "RIGHT_EAR_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RightEar extends AbstractEntity {
    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "RIGHT_EAR_STATUS", joinColumns = { @JoinColumn(name = "right_ear_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
