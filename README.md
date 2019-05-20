HEAD FIRST DUBBO
=
  该项目为本人学习Spring Boot集成Dubbo这一过程的记录。虽然取名借鉴了“Head First”系列，但并做不到深入浅出_(:з」∠)_。



附一张常见的Dubbo项目结构图：  
</br>![](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1558090504660&di=56c7381b538d127d5928f312b1c5f363&imgtype=0&src=http%3A%2F%2Fupload-images.jianshu.io%2Fupload_images%2F3101087-3defe390112edb05.jpg)

简单介绍一下图中我们需要关注的几个模块。
* Registry:服务注册中心，我们常使用[Zookeeper](https://zookeeper.apache.org/)作为服务注册中心。
* Provider:服务提供方，提供服务的具体实现。
* Consumer:服务消费方，从注册中心订阅服务，远程调用提供方提供的服务。
* Monitor:服务监控中心，监控RPC调用次数以及调用时间。

<br>项目结构如下：
* dubbo-common:公共包。
* dubbo-consumer:服务消费方。
* dubbo-provider:服务提供方。