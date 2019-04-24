package com.zz.ztreedemo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ProMenu {
    @Id
    private Long id;
    private String name;
    @JsonProperty("pId")
    private Integer pid;
}
