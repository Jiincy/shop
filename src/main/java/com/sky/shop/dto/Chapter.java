package com.sky.shop.dto;

import lombok.*;

import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chapter {
    private int serealNum;
    private String chapNum;
    private String lecNum;
    private String conNum;
    private String chapName;
    private Time chapStartTime;
}
