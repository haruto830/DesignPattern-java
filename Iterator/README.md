# デザインパターン Iteratorパターン

## 概要
配列等の何かがたくさん集まっている要素に対して、
それを順番に指し示していき、全体をスキャンする処理を行うためのもの。

## 登場人物
- Iterator  
要素を順番にスキャンしていくインターフェース。ループ変数のような役割。
hasNextメソッド、nextメソッドを用意

- Aggregate  
Iteretorを作り出すインターフェース。
数え上げを行うものを表す。iteratorメソッドを宣言し、
数え上げを行う時は、Iteratorインターフェースを実装したクラスのインタンスをつくる。

- ConcreateIterator  
Iteratorインターフェースを実装する。スキャンするために必要な情報をもつ。

- ConcreateAggregate  
Aggregateを実装する。ConcreateIteratorをつくる。

## メリット
