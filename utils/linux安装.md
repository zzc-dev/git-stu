# CentOS6.5详细安装步骤
https://blog.csdn.net/z1941563559/article/details/80615691
### 注意：
在最后`/etc/sysconfig/network-scripts/ifcfg-eth0`该文件中配置虚拟机的ip时，要是使用下图中的配置
1. IPADDR：虚拟机的ip地址
2. NETMASK：本机的子网掩码
3. GATEWAY: 本机的网关地址

![img](https://github.com/zzc-dev/git-stu/blob/master/images/nio/ip.png)

# 账号
root 123456

# 开发环境配置
### 1.secureCRT连接服务器报错 Unable to authenticate

```
1. 修改/etc/ssh/sshd_config的PasswordAuthentication项为yes
2. 重启ssh服务
  service sshd restart
```
### 2.使用yum命令安装sz rz
```
   安装命令：yum install lrzsz
   error： could not retrieve mirrorlist
   解决： https://blog.csdn.net/why15732625998/article/details/80177978
    本次只改了resolv.conf重新使用安装命令就不报错了
    vi /etc/resolv.conf
    
    nameserver 8.8.8.8
    search localdomain
```

### 3.安装jdk1.8
1. 下载jdk的linux压缩包，解压tar -zxvf 文件名
2. 修改系统环境变量 vi /etc/profile
```
#java
export JAVA_HOME=/opt/software/jdk1.8.0_131
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib
```
3. 修改配置生效 source /etc/profile
4. 验证 java -version  javac
