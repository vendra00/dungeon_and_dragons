package com.dd.dungeonsdragons.model.body.head.ear;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "LeftEar")
@Table(name = "LEFT_EAR_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeftEar extends AbstractEntity {

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "LEFT_EAR_STATUS", joinColumns = { @JoinColumn(name = "left_ear_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
