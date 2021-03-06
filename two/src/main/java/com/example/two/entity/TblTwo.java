package com.example.two.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * tbl_two
 * @author 
 */
@Data
public class TblTwo implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}