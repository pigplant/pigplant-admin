package com.pigplant.admin.mapper;


import com.pigplant.admin.entity.UserApps;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Vector;

@Mapper
public interface UserAppsMapper {

    @Select("select a.f_user, a.f_appid, a.f_approle, b.f_name from t_user_app a, t_app_info b where a.f_user=#{userid} and a.f_appid=b.f_id")
    Vector<UserApps> GetUserApps(@Param("userid") int userid);

}
