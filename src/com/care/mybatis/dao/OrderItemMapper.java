package com.care.mybatis.dao;

import com.care.mybatis.bean.OrderItem;
import com.care.mybatis.bean.OrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int countByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int deleteByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int insert(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int insertSelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    List<OrderItem> selectByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    OrderItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_item
     *
     * @mbggenerated Sat May 03 15:51:52 CST 2014
     */
    int updateByPrimaryKey(OrderItem record);
}