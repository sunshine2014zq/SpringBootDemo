package com.sun.demo.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 用户实体
 *
 * @author sun
 * @date 2019/1/8 13:27
 */
@Entity
@Table(name = "user")
public class UserEntity implements Serializable,UserDetails {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

//    @ManyToMany
//    @JoinTable(
//            name = "user_role",
//            joinColumns = {
//                    @JoinColumn(name = "user_id")
//            },
//            inverseJoinColumns = {
//                    @JoinColumn(name = "role_id")
//            }
//    )

    @ManyToMany(cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name="user_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id"))
    private List<RoleEntity> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<>();
        List<RoleEntity> roles = getRoles();
        for (RoleEntity role : roles) {
            auths.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return auths;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleEntity> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password=" + password +
                ", roles=" + roles +
                '}';
    }
}
