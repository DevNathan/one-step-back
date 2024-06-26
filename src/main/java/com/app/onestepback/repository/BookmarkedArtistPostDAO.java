package com.app.onestepback.repository;

import com.app.onestepback.mapper.BookmarkedArtistPostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BookmarkedArtistPostDAO {
    private final BookmarkedArtistPostMapper bookmarkedArtistPostMapper;

    public void doBookmarkArtistPost(Long postId, Long memberId) {
        bookmarkedArtistPostMapper.insert(postId, memberId);
    }

    public void eraseBookmarkedArtistPost(Long postId, Long memberId) {
        bookmarkedArtistPostMapper.delete(postId, memberId);
    }
}
