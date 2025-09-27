package com.practice.blog.account.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 프로필 업데이트 요청 DTO

@Getter
@NoArgsConstructor
public class BioUpdateRequestDto {

    @NotBlank
    private String bio;

    @NotBlank
    private String nickname;

}
