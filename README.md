# Android Clean Architecture

- [SampleCleanArchitecture - Source code](https://github.com/ByteAndroid/SampleCleanArchitecture)
- [Clean Architecture in Android with MVVM, Hilt, Retrofit, Jetpack Compose](https://medium.com/@andbyte18/clean-architecture-in-android-with-mvvm-hilt-retrofit-jetpack-compose-a27f8a817d20)
- [JetPackCompose-Modularization-MVVM-Clean-Architecture](https://github.com/kamrul3288/JetPackCompose-Modularization-MVVM-Clean-Architecture)

## Tech Stack

- `Kotlin`, 100% kotlin, no java
- `MVVM`: `Model`、`View`、`ViewModel`
- `Clean Architecture` 整洁架构
- `Hilt` 依赖注入
- `Retrofit` 网络请求
- `Jetpack Compose` 构建 `UI`

## 规范

- 文件夹使用全小写命名, 不含 `-`、`_` 等特殊符号, 如 `viewmodel`
- 文件名使用大驼峰 `CamelCase`
- `Data Class`、组合函数 (`@Composable`) 使用大驼峰命名 `CamelCase`, 如 `LoginScreen`
- 变量 `val` 或 `var` 使用小驼峰命名 `camelCase`
- 格式化代码 `Format Code`
- 移除无效引入、无效代码 `Code Cleanup`
- 对引入语句按某种顺序排序 `Sort Imports`

## Live Edit & Apply Code Changes

- [Iterative code development](https://developer.android.com/develop/ui/compose/tooling/iterative-development)

Hint: Live Edit requires a physical device or emulator that is running API level 30 or higher.

Android 版本 7.1.2 对应 [API level 25](https://developer.android.com/tools/releases/platforms#7.1)

## 重命名项目

`com.example.composepoc` -> `com.todo`

## 更改 APP 名称

修改 `app/src/main/res/values/strings.xml` 文件 `<string name="app_name">CleanCompose</string>`
部分即可修改 `APP` 名称

此值在 `app/src/main/AndroidManifest.xml` 文件中被 `application`
块 `android:label="@string/app_name"` 引用

## 更改 APP Icon

## Navigation/Router 导航/路由

## Tests 测试

## GitHub Actions

## 尺寸单位

- `dp` 用于元素尺寸、间距等
- `sp` 常用于字体大小

打包安卓 `apk`