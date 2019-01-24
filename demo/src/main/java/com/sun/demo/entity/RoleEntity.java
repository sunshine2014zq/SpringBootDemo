package com.sun.demo.entity;

import javax.persistence.*;

/**
 * @author sun
 * @date 2019/1/10 13:37
 */
@Entity
@Table(name = "role")
public class RoleEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @Column(name = "role_name")
    private String roleName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "id='" + id + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
