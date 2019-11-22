package com.zzc.jpademo.utils;

import lombok.Data;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BeanUtils {

    public static void copyProperties(Object source,Object target){
        Class clazz = source.getClass();
        Class targetClazz = target.getClass();
        //得到所有属性（包括私有）
        Field[] fields = clazz.getDeclaredFields();
        for(int i=0;i<fields.length;i++){
            String fieldName = fields[i].getName();  //属性名称
            Class fieldType = fields[i].getType();   //属性类型
            try{
                fields[i].setAccessible(true); //打开私有访问
                Object fieldValue = fields[i].get(source); //属性值
                Field targetField = targetClazz.getDeclaredField(fieldName);
                String methodName = "set"+ StringUtils.capitalize(fieldName);
                Method method = targetClazz.getMethod(methodName,fieldType);
                method.invoke(target,fieldValue);
                System.out.println(fieldName);
            }catch (NoSuchFieldException e){
                continue;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }


        }
    }

    public static void main(String[] args) throws Exception{
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId("1");
        fileInfo.setFileName("zzc");
        fileInfo.setFileUrl("http://zzc.com");
        fileInfo.setFileMd45("stfhskdhfkshfk");
        FileInfoDTO fileInfoDTO = new FileInfoDTO();
        copyProperties(fileInfo,fileInfoDTO);
        System.out.println(fileInfoDTO);
    }
}


@Data
class FileInfo{
    private String id;
    private String fileName;
    private String fileUrl;
    private String fileMd45;
}

@Data
class FileInfoDTO{
    private String fileName;
    private String fileMd45;
}