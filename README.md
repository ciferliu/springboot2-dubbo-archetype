# springboot-dubbo-archetype

**注意：** dubbo版本是`2.7.23`

下载云效maven私服的 [setting.xml](https://packages.aliyun.com/repo/config/file/downloadWithPersonalCredential?settingsType=maven)文件，并保存在本地的local repository`.m2/`路径下

命令行使用方法：
```bash
mvn archetype:generate -DarchetypeGroupId=com.fourportun \
    -DarchetypeArtifactId=springboot-dubbo-archetype \
    -DarchetypeVersion=1.0.0 \
    -DgroupId=your-groupId \
    -DartifactId=your-artifactId \
    -Dversion=1.0.0-SNAPSHOT \
    -Dpackage=your-package \
    -DinteractiveMode=false
```

图形化使用方法：<p>
IDEA & Eclipse <br />
【new maven project】---> 【add Archetype】，输入脚手架坐标，[IDEA示意图](https://upload-images.jianshu.io/upload_images/1932174-6e4d7bcfa431e818.png)

```
<groupId>com.fourportun</groupId>
<artifactId>springboot-dubbo-archetype</artifactId>
<version>1.0.0</version>
```

