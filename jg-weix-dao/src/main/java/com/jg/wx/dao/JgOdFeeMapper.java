package com.jg.wx.dao;

import com.jg.wx.domain.JgOdFee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface JgOdFeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jg_hy_od_fee
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jg_hy_od_fee
     *
     * @mbg.generated
     */
    int insert(JgOdFee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jg_hy_od_fee
     *
     * @mbg.generated
     */
    int insertSelective(JgOdFee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jg_hy_od_fee
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    JgOdFee selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") JgOdFee.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jg_hy_od_fee
     *
     * @mbg.generated
     */
    JgOdFee selectByPrimaryKey(@Param("catType") Integer catType);

    /**
     * 获取所有车的枚举
     *
     * @return all cat
     */
    List<Map<String, Object>> selectCarDim();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jg_hy_od_fee
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(JgOdFee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jg_hy_od_fee
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(JgOdFee record);
}