package com.jingdianjichi.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 题目答案dto
 *
 * @author: wuwenshuai
 * @date: 2024/07/5
 */
@Data
public class SubjectAnswerBO implements Serializable {

    /**
     * 答案选项标识
     */
    private Integer optionType;

    /**
     * 答案
     */
    private String optionContent;

    /**
     * 是否正确
     */
    private Integer isCorrect;

}

