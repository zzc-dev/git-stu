# CentOS6.5详细安装步骤
https://blog.csdn.net/z1941563559/article/details/80615691
### 注意：
在最后`/etc/sysconfig/network-scripts/ifcfg-eth0`该文件中配置虚拟机的ip时，要是使用下图中的配置
1. IPADDR：虚拟机的ip地址
2. NETMASK：本机的子网掩码
3. GATEWAY: 本机的网关地址

![img](https://github.com/zzc-dev/git-stu/blob/master/images/nio/ip.png)

### secureCRT连接服务器报错 Unable to authenticate

```
1. 修改/etc/ssh/sshd_config的PasswordAuthentication项为yes
2. 重启ssh服务
  service sshd restart
```

