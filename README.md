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
리스트 한쪽 끝(rear)에서 삽입이 이루어지고, 반대쪽 끝(front)에서 삭제 작업이 이루어져 삽입된 순서대로 삭제되는 **선입선출 (FIFO, First In First Out)** 방식으로 동작.


| 		  |연산자|연산수행위치|
|--------|--------|--------|
| 삽입연산 | enQueue | rear |
| 삭제연산 | deQueue | front |

- `com.datastructure.queue.arrayqueue` 순차자료구조방식을 통한 큐 구현
- `com.datastructure.queue.arraycirclequeue` 순차자료구조방식을 통한 원형 큐 구현 (선형 큐의 잘못된 포함 상태 문제 해결)
- `com.datastructure.queue.linkedqueue` 연결자료구조방식을 통한 큐 구현

### Deque (Double-ended Queue)
큐의 양쪽 끝에서 삽입, 삭제가 모두 발생할 수 있는 큐로서 스택의 성질과 큐의 성질을 모두 가짐.

| 		  |연산자|연산수행위치|
|--------|--------|--------|
| 삽입연산 | insert | front 또는 rear |
| 삭제연산 | delete | front 또는 rear |
