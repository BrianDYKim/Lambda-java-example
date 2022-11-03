package com.example.lambda.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AdultJudgeResponse {
    private String result;

    public static AdultJudgeResponse of(final String name) {
        return new AdultJudgeResponse(name);
    }
}
