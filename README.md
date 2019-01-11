## Stu_Admin——基于PlayFramwoek的MVC框架实践
---
### 1. 功能介绍
> "StuAdmin" 是一个简易的学生成绩管理平台，已实现的功能如下：
 - 批量导入学生信息;
 - 登陆安全控制：提供root和vistor两类用户;
 - 信息操作授权(仅root可以对系统各类信息进行修改，vistor仅可查看检索信息);
 - 实现多种方式检索(姓名/学号);
 - 创建学生信息时，学号自动生成;
 - 列表内容国际化;
 
`注`：本系统的网页样式参考自Play framework官网的教学案例**Yabe**
https://www.playframework.com/documentation/1.5.x/guide3

### 2. 开发环境
- Eclipse OXYGEN3.0
- Play Framwork 1.5.1
- Mysql 5
- file encoding UTF-8
