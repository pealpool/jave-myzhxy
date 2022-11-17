package com.atguigu.myzhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //自动生成构造函数
@NoArgsConstructor //自动生成无参数构造函数
@TableName("tb_admin") //绑定数据库
public class Admin {
    @TableId(value = "id", type = IdType.AUTO) //指定主键
    private Integer id;
    private String name;
    private char gender;
    private String password;
    private String email;
    private String telephone;
    private String address;
    private String portraitPath;
}
