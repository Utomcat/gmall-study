# gmall-study
> 电商学习项目


## 对gmall-user项目的配置
> 1. 对端口的配置
```yaml
#服务端口号设置
server:
  port: 8080
```
> 2. 对Spring Boot的多环境配置
```yaml
#spring boot 的多环境配置
spring:
  profiles:
    active: dev
```
> 3. 对Spring Boot测试环境的配置
```yaml
#spring 数据源配置
spring:
  datasource:
    username: root
    password: 123456
    url: jdbc:mysql://localhost:3306/gmall-study?useUnicode=true&characterEncoding=UTF-8&userSSL=false&serverTimezone=GMT%2B8
    driver-class-name: com.mysql.cj.jdbc.Driver

#mybatis的配置
mybatis:
  mapper-locations:
  configuration: classpath:mapper/*Mapper.xml
    map-underscore-to-camel-case: true

#后台输出打印执行SQL
logging:
  level: 
    com: 
      ranyk: debug
```
##对gmall项目的本机DNS配置和端口代理
>本地localhost的配置,将 `C:\Windows\System32\drivers\etc`下的`hosts`文件进行修改，修改成如下类容：
```
127.0.0.1 localhost www.gmall.com gmall.com user.gmall.com cart.gmall.com manage.gmall.com
```
>对端口使用nginx代理，配置如下：(将原有的server进行注释，配置新的端口服务代理)
```
#user  nobody;
worker_processes  1;

#error_log  logs/error.log;
#error_log  logs/error.log  notice;
#error_log  logs/error.log  info;

#pid        logs/nginx.pid;


events {
    worker_connections  1024;
}


http {
    include       mime.types;
    default_type  application/octet-stream;

    #log_format  main  '$remote_addr - $remote_user [$time_local] "$request" '
    #                  '$status $body_bytes_sent "$http_referer" '
    #                  '"$http_user_agent" "$http_x_forwarded_for"';

    #access_log  logs/access.log  main;

    sendfile        on;
    #tcp_nopush     on;

    #keepalive_timeout  0;
    keepalive_timeout  65;

    #gzip  on;
#新增此处的端口代理配置
    upstream user.gmall.com{
       server 127.0.0.1:8080;
    }
   server {
     listen 80;
     server_name user.gmall.com;
     location / {
        proxy_pass http://user.gmall.com;
        proxy_set_header X-forwarded-for $proxy_add_x_forwarded_for;
     }
    }

#将原有的server注释掉
    #server {
    #    listen       80;
    #    server_name  localhost;
#
    #    #charset koi8-r;
#
    #    #access_log  logs/host.access.log  main;
#
    #    location / {
    #        root   html;
    #        index  index.html index.htm;
    #    }
#
    #    #error_page  404              /404.html;
#
    #    # redirect server error pages to the static page /50x.html
    #    #
    #    error_page   500 502 503 504  /50x.html;
    #    location = /50x.html {
    #        root   html;
    #    }
#
    #    # proxy the PHP scripts to Apache listening on 127.0.0.1:80
    #    #
    #    #location ~ \.php$ {
    #    #    proxy_pass   http://127.0.0.1;
    #    #}
#
    #    # pass the PHP scripts to FastCGI server listening on 127.0.0.1:9000
    #    #
    #    #location ~ \.php$ {
    #    #    root           html;
    #    #    fastcgi_pass   127.0.0.1:9000;
    #    #    fastcgi_index  index.php;
    #    #    fastcgi_param  SCRIPT_FILENAME  /scripts$fastcgi_script_name;
    #    #    include        fastcgi_params;
    #    #}
#
    #    # deny access to .htaccess files, if Apache's document root
    #    # concurs with nginx's one
    #    #
    #    #location ~ /\.ht {
    #    #    deny  all;
    #    #}
    #}


    # another virtual host using mix of IP-, name-, and port-based configuration
    #
    #server {
    #    listen       8000;
    #    listen       somename:8080;
    #    server_name  somename  alias  another.alias;

    #    location / {
    #        root   html;
    #        index  index.html index.htm;
    #    }
    #}


    # HTTPS server
    #
    #server {
    #    listen       443 ssl;
    #    server_name  localhost;

    #    ssl_certificate      cert.pem;
    #    ssl_certificate_key  cert.key;

    #    ssl_session_cache    shared:SSL:1m;
    #    ssl_session_timeout  5m;

    #    ssl_ciphers  HIGH:!aNULL:!MD5;
    #    ssl_prefer_server_ciphers  on;

    #    location / {
    #        root   html;
    #        index  index.html index.htm;
    #    }
    #}

}
```
<font color="red" size="4">注意</font>，在配置完`Nginx`后可能会出现`bind() to 0.0.0.0:80 failed (10013: An attempt was made to access a socket in a way forbidden by its access permissions)`错误
>这个错误产生的原因是对应的端口被占用，但是监听的是80端口，会出现被PID=4的进程占用端口，解决办法[参考链接](https://jingyan.baidu.com/article/f96699bbca15a1894e3c1bc4.html)
>对注册表中的http的start进行重新设置为4重启电脑即可


## 使用通用Mapper的配置
> 1. 导入对应的依赖
```xml
 <!-- 通用mapper -->
<dependency>
    <groupId>tk.mybatis</groupId>
    <artifactId>mapper-spring-boot-starter</artifactId>
<!-- 因为使用的是最新的springboot项目所以需要使用最新的mapper 否则会抛错 -->
    <version>2.1.5</version>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```
> 2. 导入后，对Mapper接口进行修改：
>让其继承`tk.mybatis.mapper.common.Mapper`类，同时添加对应的泛型`UmsMember`
```java
package com.ranyk.gmall.user.dao;

import com.ranyk.gmall.user.entity.UmsMember;
import tk.mybatis.mapper.common.Mapper;

/**
 * ClassName:UserMapper
 * Description:用户映射接口
 *
 * @author ranyi
 * @date 2020-04-15 22:56
 * Version: V1.0
 */
public interface UmsMemberMapper extends Mapper<UmsMember> {


}
```
> 3.修改对应的serviceImpl处的调用方法，因接下来的方法是查询所有的用户，故调用`selectAll()`方法
```java
package com.ranyk.gmall.user.service.impl;

import com.ranyk.gmall.user.dao.UmsMemberMapper;
import com.ranyk.gmall.user.entity.UmsMember;
import com.ranyk.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UserServiceImpl
 * Description:用户业务接口实现类
 *
 * @author ranyi
 * @date 2020-04-15 22:54
 * Version: V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    /**
     * 获取所有用户的信息
     * @return 返回查询到的所有的用户信息
     */
    @Override
    public List<UmsMember> getAllUser() {
        return umsMemberMapper.selectAll();
    }
}
```

> 4. 修改实体类
```java
package com.ranyk.gmall.user.entity;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 会员表(UmsMember)实体类
 *
 * @author makejava
 * @since 2020-04-16 16:49:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class UmsMember implements Serializable {
    private static final long serialVersionUID = 731895660599518248L;

    /**
     * 主键，为主键添加Id注解，同时设置该主键的主键策略
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long memberLevelId;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 昵称
    */
    private String nickname;
    /**
    * 手机号码
    */
    private String phone;
    /**
    * 帐号启用状态:0->禁用；1->启用
    */
    private Integer status;
    /**
    * 注册时间
    */
    private Date createTime;
    /**
    * 头像
    */
    private String icon;
    /**
    * 性别：0->未知；1->男；2->女
    */
    private Integer gender;
    /**
    * 生日
    */
    private Object birthday;
    /**
    * 所做城市
    */
    private String city;
    /**
    * 职业
    */
    private String job;
    /**
    * 个性签名
    */
    private String personalizedSignature;
    /**
    * 用户来源
    */
    private Integer sourceType;
    /**
    * 积分
    */
    private Integer integration;
    /**
    * 成长值
    */
    private Integer growth;
    /**
    * 剩余抽奖次数
    */
    private Integer luckeyCount;
    /**
    * 历史积分数量
    */
    private Integer historyIntegration;

}
```

> 5. 修改启动类处的接口扫描的扫描类
```java
package com.ranyk.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//此处是tk.mybatis.spring.annotation.MapperScan的扫描包
@MapperScan(basePackages = "com.ranyk.gmall.user")
public class GmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
```