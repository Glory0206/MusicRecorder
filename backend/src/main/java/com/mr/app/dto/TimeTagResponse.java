package com.mr.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TimeTagResponse {
    private Long id;
    private String tagName;
    private Integer startTime;
    private Integer endTime;
} 