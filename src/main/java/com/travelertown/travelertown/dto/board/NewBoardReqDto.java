package com.travelertown.travelertown.dto.board;

import com.travelertown.travelertown.entity.Board;
import lombok.Data;

@Data
public class NewBoardReqDto {
    private int boardCategoryId;
    private String countryCode;
    private String boardTitle;
    private String boardContent;
    private int userId;

    public Board toEntity() {
        return Board.builder()
                .boardCategoryId(boardCategoryId)
                .countryCode(countryCode)
                .boardTitle(boardTitle)
                .boardContent(boardContent)
                .userId(userId)
                .build();
    }
}
