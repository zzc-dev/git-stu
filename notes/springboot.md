# springboot 日志框架实践
实例：https://www.jianshu.com/p/780a1bf46a1f 
- 其中使用slf4j报错`Class path contains multiple SLF4J bindings.`  </br>
原因：springboot中的日志默认使用logback-classic，和slf4j冲突，详情参考
    1. https://blog.csdn.net/wohaqiyi/article/details/81009689、
    2. https://blog.csdn.net/Lining_s/article/details/84349476
