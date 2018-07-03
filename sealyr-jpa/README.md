# sealyr-jpa

http://projects.spring.io/spring-data-jpa/

JPA 诞生的缘由是为了整合第三方 ORM 框架，建立一套标准。在 ORM 框架中，Hibernate 的应用非常广泛，和 JPA 整合的也比较好（Hibernate 2.3 开始就完全支持 JPA 标准）。其实，JPA 的作者和 Hibernate 的作者是同一个人，我们所看到的 JPA 标准几乎都是接口，实际应用中 Hibernate 通常就是作为具体的实现。

上面阐述了 JPA 和 Hibernate 的关系，那么 Spring Data JPA 又是什么？

> 为了满足 Spring 生态系统的发展需要，2010 年 Spring One 开发者大会正式推出了 Spring Data 项目。Spring Data JPA 作为 Spring Data 的家族成员，主要负责将数据持久化到关系型数据库。实际上，Spring Data JPA 的底层依然是 Hibernate，它只是在 Hibernate 的基础上做了进一步的封装，融入 Spring 生态系统，并对外提供更加统一和轻量级的接口。

## 快速开始

在 Spring Boot 项目中添加依赖配置（公共配置见父项目）：

```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

## 参考

Spring Data JPA 网上有大量的资料可以参考，不过系统性的学习资料参考如下：

- 文档：http://projects.spring.io/spring-data-jpa/
- 书籍：《Spring Data JPA 从入门到精通》（网上商城购买）
- PDF：《Spring Data 实战》（百度云电子书）
