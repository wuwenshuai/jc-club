package com.jingdianjichi.subject.application.convert;

import com.jingdianjichi.subject.application.dto.SubjectAnswerDTO;
import com.jingdianjichi.subject.domain.entity.SubjectAnswerBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 题目答案dto转换器
 * 
 * @author: wuwenshuai
 * @date: 2024/07/8
 */
@Mapper
public interface SubjectAnswerDTOConverter {

    SubjectAnswerDTOConverter INSTANCE = Mappers.getMapper(SubjectAnswerDTOConverter.class);

    SubjectAnswerBO convertDTOToBO(SubjectAnswerDTO subjectAnswerDTO);

    List<SubjectAnswerBO> convertListDTOToBO(List<SubjectAnswerDTO> dtoList);

}
