package com.sky.shop.dto;

import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Lecture_Info {
    private String lecNum;
    private String lecStartDate;
    private String lecEndDate;
    private String lecName;
    private String lecEx;
}
