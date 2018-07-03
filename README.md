# sealyr-orm

对象关系映射（Object Relational Mapping, ORM）是一种程序技术，用于实现面向对象编程语言里不同类型系统的数据之间的转换。在 Java 领域，常用的 ORM 框架有：

- Hibernate
- MySQL
- JPA / Spring Data JPA

## 公共配置

本项目使用的公共依赖配置如下：

```
<dependency>
	<groupId>com.alibaba</groupId>
	<artifactId>druid-spring-boot-starter</artifactId>
	<version>1.1.9</version>
</dependency>
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<scope>runtime</scope>
</dependency>
<dependency>
	<groupId>com.alibaba</groupId>
	<artifactId>fastjson</artifactId>
	<version>1.2.38</version>
</dependency>
<dependency>
	<groupId>org.apache.commons</groupId>
	<artifactId>commons-lang3</artifactId>
</dependency>
```

## 参考

- [Druid](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter) 