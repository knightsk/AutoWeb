package com.care.mybatis.dao;

import com.care.mybatis.bean.UserOperate;
import com.care.mybatis.bean.UserOperateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOperateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int countByExample(UserOperateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int deleteByExample(UserOperateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int insert(UserOperate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int insertSelective(UserOperate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    List<UserOperate> selectByExample(UserOperateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    UserOperate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByExampleSelective(@Param("record") UserOperate record, @Param("example") UserOperateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByExample(@Param("record") UserOperate record, @Param("example") UserOperateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByPrimaryKeySelective(UserOperate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByPrimaryKey(UserOperate record);
}