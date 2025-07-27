package com.mr.app.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecordingRequest {
    @NotBlank(message = "노래 제목을 입력해주세요.")
    private String songTitle;

    private String artistName;
}
