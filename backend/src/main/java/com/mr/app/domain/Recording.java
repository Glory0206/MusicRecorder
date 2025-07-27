package com.mr.app.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "recordings")
public class Recording {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String songTitle;

    @Column(nullable = true)
    private String artistName;

    @Column(nullable = false)
    private String audioFilePath;

    @Column(nullable = false)
    private LocalDateTime recordingDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "recording", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TimeTag> timeTags = new ArrayList<>();

    @PrePersist
    public void setRecordingDate() {
        this.recordingDate = LocalDateTime.now();
    }
} 