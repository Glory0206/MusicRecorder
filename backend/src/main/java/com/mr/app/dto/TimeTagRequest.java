package com.mr.app.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TimeTagRequest {
    @NotBlank(message = "태그 이름을 입력해주세요.")
    private String tagName;
    
    @NotNull(message = "시작 시간을 입력해주세요.")
    private Integer startTime;
    
    @NotNull(message = "종료 시간을 입력해주세요.")
    private Integer endTime;
} 