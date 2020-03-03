# springboot 日志框架实践
实例：https://www.jianshu.com/p/780a1bf46a1f 
- 其中使用slf4j报错`Class path contains multiple SLF4J bindings.`  </br>
原因：springboot中的日志默认使用logback-classic，和slf4j冲突，详情参考
    1. https://blog.csdn.net/wohaqiyi/article/details/81009689、
    2. https://blog.csdn.net/Lining_s/article/details/84349476

# springboot-jpa-data
### 1.调用save方法无法实现update操作
```
    videoAnalysisLocal videoAnalysisLocal1 = new VideoAnalysisLocal();
    videoAnalysisLocal1.setId(save.getId());
    videoAnalysisLocal1.setVideoName("zzc1.test");
    // videoAnalysisLocal1.setVersion(0L);
    videoAnalysisLocalDao.save(videoAnalysisLocal1);
    
    // 判断是否为一个新的实体，如果是则执行em.persist新增操作，否则执行em.merge更新操作
     @Transactional
    public <S extends T> S save(S entity) {
        if (this.entityInformation.isNew(entity)) {
            this.em.persist(entity);
            return entity;
        } else {
            return this.em.merge(entity);
        }
    }
    
    /**
    /*1.判断实体中是否有version字段
    /*2.有则判断改字段是否为null，无则判断改实体的主键是否有值
     **/
    public boolean isNew(T entity) {
     if (this.versionAttribute != null && !this.versionAttribute.getJavaType().isPrimitive()) {
         BeanWrapper wrapper = new DirectFieldAccessFallbackBeanWrapper(entity);
         Object versionValue = wrapper.getPropertyValue(this.versionAttribute.getName());
         return versionValue == null;
     } else {
         return super.isNew(entity);
     }
    }
            
```
