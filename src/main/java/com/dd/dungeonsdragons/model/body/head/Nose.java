package com.dd.dungeonsdragons.model.body.head;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Nose")
@Table(name = "NOSE_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nose extends AbstractEntity {
    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "NOSE_STATUS", joinColumns = { @JoinColumn(name = "nose_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
