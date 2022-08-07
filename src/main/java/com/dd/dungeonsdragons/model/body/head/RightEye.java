package com.dd.dungeonsdragons.model.body.head;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "RightEye")
@Table(name = "RIGHT_EYE_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RightEye extends AbstractEntity {
    @Column(name = "eye_color")
    private String eyeColor;
    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "RIGHT_EYE_STATUS", joinColumns = { @JoinColumn(name = "right_eye_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
