package com.pigplant.admin.mapper;

import com.pigplant.admin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select f_id, f_user, f_passwd, f_role from t_user_auth where f_user = #{username}")
    User getByName(@Param("username") String username);
}
