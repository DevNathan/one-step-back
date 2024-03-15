package com.app.onestepback.domain.dto.artist;

import com.app.onestepback.domain.dto.postElements.PostFileDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ArtistPostDetailDTO {
    private Long postId;
    private Long memberId;
    private String title;
    private String subTitle;
    private String content;
    private String category;
    private LocalDateTime writeTime;

    private String nickname;
    private String kakaoProfileUrl;
    private String profileName;
    private String profilePath;

    private String blogName;
    private long subscriptionCount;

    private long viewCount;
    private int likeCount;
    private int replyCount;

    private Long previousPostId;
    private String previousPostTitle;
    private Long nextPostId;
    private String nextPostTitle;

    List<PostFileDTO> imgFiles = new ArrayList<>();

    List<String> tags = new ArrayList<>();
}