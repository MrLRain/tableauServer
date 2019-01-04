package com.adc.tableau.tableauSever.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *  tableau 配置类
 */
@ConfigurationProperties(
        prefix = "tableau")

@Component
public class TableauConfigType {
    /**
     * tableau用户名
     */
    private String userName;

    /**
     * tableau服务器地址
     */
    private String server;

    /**
     * tableau ipv4
     */
    private String ipv4;

    private String jnaUrl;

    private String gFileUrl;

    public String getgFileUrl() {
        return gFileUrl;
    }

    public void setgFileUrl(String gFileUrl) {
        this.gFileUrl = gFileUrl;
    }

    public String getJnaUrl() {
        return jnaUrl;
    }

    public void setJnaUrl(String jnaUrl) {
        this.jnaUrl = jnaUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}
