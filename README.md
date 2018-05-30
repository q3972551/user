# user
springMVC +mybatis +druid 实用框架 
所有spring 相关配置在 resouces/spring/*.xml


第一次的坑,一定要记住在web.xml 中建立 context**** 同时完成监听，把上面的spring的配置文件加载进去，具体看下我的配置。
同时在common/listen 里有一个startlistening class 是关于启动加载的类。

以前都写java 游戏服务器，第一次接触web 坑了好几天，现在可以使用了，大家可以放心使用，非常简单使用。
