package com.example.one.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * tbl_one
 * @author 
 */
@Data
public class TblOne implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}