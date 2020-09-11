package com.jg.wx.dao;

import com.jg.wx.domain.DtsAboutMe;
import org.apache.ibatis.annotations.Param;

public interface DtsAboutMeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_about_me
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_about_me
     *
     * @mbg.generated
     */
    int insert(DtsAboutMe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_about_me
     *
     * @mbg.generated
     */
    int insertSelective(DtsAboutMe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_about_me
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsAboutMe selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsAboutMe.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_about_me
     *
     * @mbg.generated
     */
    DtsAboutMe selectByPrimaryKey(Integer corpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_about_me
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DtsAboutMe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_about_me
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DtsAboutMe record);
}