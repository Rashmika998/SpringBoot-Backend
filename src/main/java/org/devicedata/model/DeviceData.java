package org.devicedata.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity(name = "devicedata")
public class DeviceData {
    @Id
    private int id;
    private String deviceeui;
    private Double longitude;
    private Double latitude;
    private Double distance;
    private String timestamp;
}
