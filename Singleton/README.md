# Singletonパターン

## 概要
インスタンスが１個しか存在しないことを保証するパターン。

コンストラクタを**private**にして、クラス内からインスタンスを生成できないようにする。

getInstance()が呼びだされた時に、Sigletonクラスが初期化されて唯一のインスタンスが生成される。

## 登場人物
- Singleton(Singleton.java)  
Singletonパターンは、Singletonの役のみ。唯一のインスタンスを得るための、staticメソッドを持っている。

![Singleton](./plantuml/Singleton.png)

## メリット
- インスタンスが１個しか存在しないことを保証できる。

## 補足
- 複数スレッドを考慮する場合は、synchronizedをつける
