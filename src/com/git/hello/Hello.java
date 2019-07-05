package com.git.hello;

/*
 *  gitlab 需要使用8080端口，其它程序不能占用，否则就是502错误
 *  
 *  更改默认8080端口
 *  
 *  gitlab 错误
 *           Next authentication method: password           配置了ip没有配置port
               git@gitlabss.com's password:
    
    IP和port都没有配置
    debug1: Reading configuration data /etc/ssh/ssh_config
     ssh: Could not resolve hostname gitlabss.com: Name or service not known
 */
public class Hello {
     public void hello(){
                     System.out.println(2);    
     }
}
