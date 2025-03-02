package com.newfbin.linkinterview.model.dto.questionBank;

import lombok.Data;

import java.io.Serializable;

/**
 * 编辑题库请求
 *
 * @author <a href="https://github.com/newfbin">newfbin</a>
 */
@Data
public class QuestionBankEditRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片
     */
    private String picture;

    private static final long serialVersionUID = 1L;
}