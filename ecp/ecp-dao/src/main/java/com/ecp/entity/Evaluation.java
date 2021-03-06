package com.ecp.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "item_evaluation")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "by_user_id")
    private Long byUserId;

    private String content;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "modify_time")
    private Date modifyTime;

    @Column(name = "order_id")
    private Long orderId;

    private String resource;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "user_id")
    private Long userId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return by_user_id
     */
    public Long getByUserId() {
        return byUserId;
    }

    /**
     * @param byUserId
     */
    public void setByUserId(Long byUserId) {
        this.byUserId = byUserId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return item_id
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return order_id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    /**
     * @param resource
     */
    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }

    /**
     * @return sku_id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * @param skuId
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", byUserId=").append(byUserId);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", itemId=").append(itemId);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", resource=").append(resource);
        sb.append(", skuId=").append(skuId);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}