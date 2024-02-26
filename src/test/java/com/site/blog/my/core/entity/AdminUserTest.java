package com.site.blog.my.core.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void setLoginUserName() {
        AdminUser adminUser = new AdminUser();
        adminUser.setLoginUserName("jack");
        System.out.println(adminUser.toString());

    }

    @Test
    void testToString() {
    }

    @Test
    void getAdminUserId() {
    }

    @Test
    void getLoginUserName() {
    }

    @Test
    void getLoginPassword() {
    }

    @Test
    void getNickName() {
    }

    @Test
    void getLocked() {
    }

    @Test
    void setAdminUserId() {
    }

    @Test
    void setLoginPassword() {
    }

    @Test
    void setNickName() {
    }

    @Test
    void setLocked() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void canEqual() {
    }

    @Test
    void testHashCode() {
    }
}