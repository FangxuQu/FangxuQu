Welcom to myGitHub !	我已成功下载了文件！

一、使用git bash下载项目代码

1、找到要下载代码的文件，右键 GIT BASH HERE ,打开命令窗口。

2、初始化
git init
git remote add origin <项目地址>

3、克隆
git clone <项目地址>

二、常见问题

1、Git报错：remote: HTTP Basic: Access denied
    错误信息：
        remote: HTTP Basic: Access denied
        fatal: Authentication failed for 'http://localhost/rep.git/'

    解决办法：
        打开命令窗口，输入以下命令：git config --system --unset credential.helper
        重新执行 git clone <项目地址> 命令