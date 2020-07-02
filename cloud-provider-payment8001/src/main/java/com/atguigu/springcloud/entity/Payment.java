package com.atguigu.springcloud.entity;

import java.io.Serializable;

/**
 * (Payment)实体类
 *
 * @author makejava
 * @since 2020-07-01 16:05:45
 */
public class Payment implements Serializable {
    private static final long serialVersionUID = -60717022086536621L;
    
    private Long id;
    
    private String serial;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}