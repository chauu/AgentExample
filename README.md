# AgentExample
#### 通过java.lang.Instrumentation构建独立于应用程序的agent，并通过Javassist操作Java类。该Demo使用IDEA开发

在导入项目后，执行gradle的Jar Task，生成agent的jar；

![JarTask](https://github.com/chauu/AgentExample/blob/master/img/jarTask.png)

然后修改Build配置，引用上一步生成的jar 

![javaagent](https://github.com/chauu/AgentExample/blob/master/img/javaagent.jpg)

执行HelloWorld.java的main方法，结果如下

![result](https://github.com/chauu/AgentExample/blob/master/img/result.jpg)