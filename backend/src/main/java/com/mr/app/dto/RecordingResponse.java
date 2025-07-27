package com.mr.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RecordingResponse {
    private Long id;
    private String songTitle;
    private String artistName;
    private String audioFilePath;
    private LocalDateTime recordingDate;
    private List<TimeTagResponse> timeTags;
    private Integer totalDuration;
} 