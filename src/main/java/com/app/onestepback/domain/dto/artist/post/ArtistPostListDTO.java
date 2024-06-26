package com.app.onestepback.domain.dto.artist.post;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ArtistPostListDTO {
    private Long postId;
    private Long artistId;
    private String title;
    private String subtitle;
    private String content;
    private String category;
    private LocalDateTime createdTime;
    private String timeGap;

    // 사진은 ID순 맨 첫번째꺼 하나
    private String fileName;
    private String filePath;

    private List<String> tags = new ArrayList<>();

    private String nickname;
    private String kakaoProfileUrl;
    private String profileName;
    private String profilePath;

    private long viewCount;
    private int likeCount;
    private int replyCount;

    private boolean isBookmarked;
}
