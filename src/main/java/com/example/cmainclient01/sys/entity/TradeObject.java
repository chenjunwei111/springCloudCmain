package com.example.cmainclient01.sys.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.example.cmainclient01.BaseEntity;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 模拟对象信息，用于模拟参与交易的市场主体
 * </p>
 *
 * @author cjw
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TRADE_OBJECT")
public class TradeObject extends BaseEntity<TradeObject> {

    private static final long serialVersionUID = 1L;

    /**
     * 对象id
     */
    @TableId("OBJECT_ID")
    private String objectId;
    /**
     * 企业名称
     */
    @TableField("OBJECT_NAME")
    private String objectName;
    /**
     * 企业标识，用于参与交易申报标识
     */
    @TableField("OBJECT_SIGN")
    private String objectSign;
    /**
     * 企业类型,01发电企业，02售电公司，03电力用户
     */
    @TableField("OBJECT_TYPE")
    private String objectType;
    /**
     * 购售类型，01买，02卖
     */
    @TableField("TRADE_TYPE")
    private String tradeType;
    /**
     * 创建者
     */
    @TableField("CREATE_USER")
    private String createUser;
    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;
    /**
     * 创建者id
     */
    @TableField("CREATE_ID")
    private String createId;
    /**
     * 交易编码
     */
    @TableField("TRADE_CODE")
    private String tradeCode;


    @Override
    protected Serializable pkVal() {
        return this.objectId;
    }

}
