# 자료구조(Data Structure)

> [자바로 배우는 쉬운 자료구조. 이지영 저. 한빛아카데미. 2013.](http://book.naver.com/bookdb/book_detail.nhn?bid=7278662) 의 예제를 참고함.

<br>

##Stack
시간 순서에 따라 가장 마지막에 삽입한 자료가 가장 먼저 삭제되는 **후입선출 (LIFO, Last In First Out)** 방식으로 동작.

| 		  |연산자|연산수행위치|
|--------|--------|--------|
| 삽입연산 | push | top |
| 삭제연산 | pop  | top |


- `com.datastructure.stack.arraystack` 순차자료구조방식을 통한 스택 구현
- `com.datastructure.stack.linkedstack` 연결자료구조방식을 통한 스택 구현
- `com.datastructure.stack.apply` 스택을 이용한 중위 표기법의 후위표기법 변환

##Queue

| 		  |연산자|연산수행위치|
|--------|--------|--------|
| 삽입연산 | enQueue | rear |
| 삭제연산 | deQueue | front |

- `com.datastructure.queue.arrayqueue` 순차자료구조방식을 통한 큐 구현