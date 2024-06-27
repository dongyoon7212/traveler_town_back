package com.travelertown.travelertown.controller.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCommentResDto {
    private int userId;
    private String nickname;
    private String profileImg;

    private int boardCommentId;

    private int boardId;

    private String boardComment;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
