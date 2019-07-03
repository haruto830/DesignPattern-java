# Iteratorパターン

## 概要
配列等の何かがたくさん集まっている要素に対して、
それを順番に指し示していき、全体をスキャンする処理を行うためのもの。

## 登場人物
- Iterator (Iterator.java)  
要素を順番にスキャンしていくインターフェース。ループ変数のような役割。
hasNextメソッド、nextメソッドを用意

- Aggregate (Aggregate.java)  
Iteretorを作り出すインターフェース。
数え上げを行うものを表す。iteratorメソッドを宣言し、
数え上げを行う時は、Iteratorインターフェースを実装したクラスのインタンスをつくる。

- ConcreateIterator (BookShelfIterator.java)  
Iteratorインターフェースを実装する。スキャンするために必要な情報をもつ。

- ConcreateAggregate (BookShelf.java)  
Aggregateを実装する。ConcreateIteratorをつくる。

## メリット
- while文で数え上げする際、BookShelfのメソッドを使っていないため実装に依存しなくなる
- Iteratorクラスにメソッドを追加することで、様々な要素の列挙が可能（逆方向、スキップなど）

