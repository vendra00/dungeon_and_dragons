package com.dd.dungeonsdragons.model.body.head;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "LeftEye")
@Table(name = "LEFT_EYE_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeftEye extends AbstractEntity {
    @Column(name = "eye_color")
    private String eyeColor;
    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "LEFT_EYE_STATUS", joinColumns = { @JoinColumn(name = "left_eye_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
