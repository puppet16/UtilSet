# UtilSet  [![Release](https://jitpack.io/v/puppet16/utilset.svg)](https://jitpack.io/#puppet16/UtilSet)   ![GitHub repo size](https://img.shields.io/github/repo-size/puppet16/utilset.svg?color=green)   ![GitHub release](https://img.shields.io/github/release/puppet16/UtilSet.svg)    [![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg?style=flat-square)](https://github.com/996icu/996.ICU/blob/master/LICENSE)


放置一些工具类 &emsp;实例见[LibraryShowDemo](https://github.com/puppet16/LibraryShowDemo)

设置依赖库指南：[https://www.jianshu.com/p/6b489a73df4e](https://www.jianshu.com/p/6b489a73df4e)  
**关键点**：1. 要创建Android Library类型的Moduel; &emsp; 2. 要提交完整的工程，包括gradle文件夹、Test文件夹、gradlew等。&emsp;3. 只可以创建一个module

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
3. 在模块级`gradle`文件中的`android`里添加java1.8支持，如下：
```
android {
   ...
 compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}
```
4. 然后添加依赖

```
dependencies {
  implementation 'com.github.puppet16:UtilSet:v1.0.6'
  annotationProcessor "com.jakewharton:butterknife-compiler:10.1.0"
}
```

# 添加的库及工具类

## 1. [ButterKnife](https://github.com/JakeWharton/butterknife)

## 2. Toasty &emsp;扩展自[Toasty](https://github.com/GrenderG/Toasty)，暴露cancel方法，并与基类activity绑定

## 3. [Gson](https://github.com/google/gson)

## 4. PhoneRegexUtils &emsp;扩展自[ChinaMobilePhoneNumberRegex](https://github.com/VincentSit/ChinaMobilePhoneNumberRegex)

## 5. LogUtils &emsp;抽离自[AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode)

## 6. ApplicationUtils&emsp;抽离自[AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode)

## 7. PreferencesUtils &emsp; 抽离自[AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode)

## 8. LanguageUtils 语言切换管理类，适配7.0及以上版本  

