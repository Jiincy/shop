package com.sky.shop.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SugangRegister {
    private String lecNum;
    private int userNo;
    private String lecSubDate;
    private String completeYn;


}
