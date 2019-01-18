# wykshop
这是一个在线商城的网站demo，采用spring+struts+hibernate(ssh)架构 原创者：sysho。github:https://github.com/511733119/shop。

由于原作者并没有写配置环境，而笔者在电脑上使用了较新的tomcat8,mysql8,jdk1.8的环境。原项目无法正常运行。

于是我花了一些时间把原项目改成为maven架构，更换hibernate3为hibernate5,采用spring4等等其他更高的版本。

同时在针对高版本的hibernate，hql不支持limit语法，我已经做了修正。针对高版本的mysql，数据库连接的时候要带上serverTimezone时区。
以及原项目中一些配置信息错误的地方，我做了小优化。当然，对于大部分源码和逻辑结构，均出自原创作者之手。

总之，这是一个很好的适合新手入门的在线商城项目，感谢sysho的源码。本项目将与原作者遵守的协定一样，不作为任何的商业用途！
