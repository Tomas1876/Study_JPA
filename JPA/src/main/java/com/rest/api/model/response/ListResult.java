package com.rest.api.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListResult<T> extends CommonResult{ // 결과가 여러 건인 api를 담는 모델
    private List<T> list;
}
