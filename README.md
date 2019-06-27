# UtilSet ![GitHub repo size](https://img.shields.io/github/repo-size/puppet16/UtilSet.svg?color=1&label=UtilsSet%20Size) ![GitHub release](https://img.shields.io/github/release/puppet16/UtilSet.svg)
放置一些工具类

设置依赖库指南：[https://www.jianshu.com/p/6b489a73df4e](https://www.jianshu.com/p/6b489a73df4e)  
**关键点**：1. 要创建Android Library类型的Moduel; &emsp; 2. 要提交完整的工程，包括gradle文件夹、Test文件夹、gradlew等。
# 使用方式
1. 使用androidX支持库
2. 在根`build.gradle` 中添加
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
 
```
3. 然后添加依赖
```
dependencies {
  implementation 'com.github.puppet16:UtilSet:v1.0.0'
}
 ```
# 添加的库及工具类
 ## 1. [ButterKnife](https://github.com/JakeWharton/butterknife)
 ## 2. [Toasty](https://github.com/GrenderG/Toasty)
 ## 3. [Gson](https://github.com/google/gson)
 ## 4. PhoneRegexUtils &emsp;扩展自[ChinaMobilePhoneNumberRegex](https://github.com/VincentSit/ChinaMobilePhoneNumberRegex)
 ## 5. LogUtils &emsp;抽离自[AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode)
 ## 6. ApplicationUtils&emsp;抽离自[AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode)
