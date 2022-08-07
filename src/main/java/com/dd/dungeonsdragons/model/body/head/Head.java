package com.dd.dungeonsdragons.model.body.head;

import com.dd.dungeonsdragons.model.AbstractEntity;
import com.dd.dungeonsdragons.model.HealthStatus;
import com.dd.dungeonsdragons.model.body.head.ear.LeftEar;
import com.dd.dungeonsdragons.model.body.head.ear.RightEar;
import com.dd.dungeonsdragons.model.body.head.eye.LeftEye;
import com.dd.dungeonsdragons.model.body.head.eye.RightEye;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Head")
@Table(name = "HEAD_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Head extends AbstractEntity {

    @Column(name = "hair_color")
    private String hairColor;

    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "right_eye_id", referencedColumnName = "id")
    private RightEye rightEye;
    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "left_eye_id", referencedColumnName = "id")
    private LeftEye leftEye;
    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "right_ear_id", referencedColumnName = "id")
    private RightEar rightEar;
    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "left_ear_id", referencedColumnName = "id")
    private LeftEar leftEar;
    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "nose_id", referencedColumnName = "id")
    private Nose nose;
    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "mouth_id", referencedColumnName = "id")
    private Mouth mouth;

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "HEAD_STATUS", joinColumns = { @JoinColumn(name = "head_id") }, inverseJoinColumns = {@JoinColumn(name = "health_status_id") })
    private List<HealthStatus> healthStatuses;
}
