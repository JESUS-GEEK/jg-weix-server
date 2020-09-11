package com.jg.wx.dao;

import com.jg.wx.domain.DtsRegion;
import com.jg.wx.domain.DtsRegionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DtsRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    long countByExample(DtsRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    int deleteByExample(DtsRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    int insert(DtsRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    int insertSelective(DtsRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsRegion selectOneByExample(DtsRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsRegion selectOneByExampleSelective(@Param("example") DtsRegionExample example, @Param("selective") DtsRegion.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<DtsRegion> selectByExampleSelective(@Param("example") DtsRegionExample example, @Param("selective") DtsRegion.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    List<DtsRegion> selectByExample(DtsRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsRegion selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsRegion.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    DtsRegion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DtsRegion record, @Param("example") DtsRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DtsRegion record, @Param("example") DtsRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DtsRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DtsRegion record);
}