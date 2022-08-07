package com.dd.dungeonsdragons.model.body.head;

import com.dd.dungeonsdragons.model.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
    @JoinColumn(name = "nose_id", referencedColumnName = "id")
    private Nose nose;
    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "mouth_id", referencedColumnName = "id")
    private Mouth mouth;
}
