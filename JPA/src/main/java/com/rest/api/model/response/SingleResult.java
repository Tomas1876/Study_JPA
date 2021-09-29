package com.rest.api.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleResult<T> extends CommonResult { // 결과가 단일 건인 apu를 담는 모델
    private T data;
}
