package com.ecp.entity;

import javax.persistence.*;

@Table(name = "user_mall_resource")
public class MallResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modular_type")
    private Integer modularType;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "resource_name")
    private String resourceName;

    private Integer type;

    private String url;

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
     * @return modular_type
     */
    public Integer getModularType() {
        return modularType;
    }

    /**
     * @param modularType
     */
    public void setModularType(Integer modularType) {
        this.modularType = modularType;
    }

    /**
     * @return parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return resource_name
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", modularType=").append(modularType);
        sb.append(", parentId=").append(parentId);
        sb.append(", resourceName=").append(resourceName);
        sb.append(", type=").append(type);
        sb.append(", url=").append(url);
        sb.append("]");
        return sb.toString();
    }
}