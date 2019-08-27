# java-gradle-multiprojext
Gradle (Java) で マルチプロジェクト を構成するサンプル

## Feature
- Java
- Gradle

## Note
- 以下のような構成を想定しています。

|プロジェクト名|説明|
|:--|:--|
|master|ルートプロジェクト|
|common|共通ライブラリ|
|common/main-lib|共通ライブラリ その１|
|common/sub-lib|共通ライブラリ その２|
|app/api|個別のアプリケーションサンプル|
|app/web|個別のアプリケーションサンプル|
|app/batch|個別のアプリケーションサンプル|

