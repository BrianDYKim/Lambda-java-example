package com.example.lambda.functions;

import com.example.lambda.dto.AdultJudgeResponse;
import com.example.lambda.dto.UserRequest;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class AdultJudge implements Function<UserRequest, AdultJudgeResponse> {

    @Override
    public AdultJudgeResponse apply(UserRequest request) {
        String name = request.getName();

        if (request.getAge() > 20) {
            return AdultJudgeResponse.of(name + "은(는) 성인입니다.");
        } else {
            return AdultJudgeResponse.of(name + "은(는) 성인이 아닙니다.");
        }
    }
}
