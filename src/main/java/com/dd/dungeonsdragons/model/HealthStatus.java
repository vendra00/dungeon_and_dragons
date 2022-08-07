package com.dd.dungeonsdragons.model;

import com.dd.dungeonsdragons.model.body.head.*;
import com.dd.dungeonsdragons.model.enums.BodyStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "HealthStatus")
@Table(name = "HEALTH_STATUS_TBL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class HealthStatus extends AbstractEntity {
    @Column(name = "status")
    private BodyStatus status;

    @JsonIgnore
    @ManyToMany(mappedBy = "healthStatuses")
    private List<Mouth> mouths;
    @JsonIgnore
    @ManyToMany(mappedBy = "healthStatuses")
    private List<Nose> noses;
    @JsonIgnore
    @ManyToMany(mappedBy = "healthStatuses")
    private List<RightEye> rightEyes;
    @JsonIgnore
    @ManyToMany(mappedBy = "healthStatuses")
    private List<LeftEar> leftEars;
    @JsonIgnore
    @ManyToMany(mappedBy = "healthStatuses")
    private List<RightEar> rightEars;

}
