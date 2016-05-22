# 자료구조(Data Structure)

> [자바로 배우는 쉬운 자료구조. 이지영 저. 한빛아카데미. 2013.](http://book.naver.com/bookdb/book_detail.nhn?bid=7278662) 의 예제를 참고함.

<br>

## Stack
시간 순서에 따라 가장 마지막에 삽입한 자료가 가장 먼저 삭제되는 **후입선출 (LIFO, Last In First Out)** 방식으로 동작.

| 		  |연산자|연산수행위치|
|--------|--------|--------|
| 삽입연산 | push | top |
| 삭제연산 | pop  | top |

- [`com.datastructure.stack.arraystack`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/stack/arraystack) 순차자료구조방식을 통한 스택 구현
- [`com.datastructure.stack.linkedstack`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/stack/linkedstack) 연결자료구조방식을 통한 스택 구현
- [`com.datastructure.stack.apply`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/stack/apply) 스택을 이용한 중위 표기법의 후위표기법 변환

## Queue
리스트 한쪽 끝(rear)에서 삽입이 이루어지고, 반대쪽 끝(front)에서 삭제 작업이 이루어져 삽입된 순서대로 삭제되는 **선입선출 (FIFO, First In First Out)** 방식으로 동작.


| 		  |연산자|연산수행위치|
|--------|--------|--------|
| 삽입연산 | enQueue | rear |
| 삭제연산 | deQueue | front |

- [`com.datastructure.queue.arrayqueue`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/queue/arrayqueue) 순차자료구조방식을 통한 큐 구현
- [`com.datastructure.queue.arraycirclequeue`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/queue/arraycirclequeue) 순차자료구조방식을 통한 원형 큐 구현 (선형 큐의 잘못된 포함 상태 문제 해결)
- [`com.datastructure.queue.linkedqueue`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/queue/linkedqueue) 연결자료구조방식을 통한 큐 구현

### Deque (Double-ended Queue)
큐의 양쪽 끝에서 삽입, 삭제가 모두 발생할 수 있는 큐로서 스택의 성질과 큐의 성질을 모두 가짐.

-	[`com.datastructure.queue.dequeue`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/queue/dequeue) 이중 연결 리스트를 통한 덱 구현


| 		  |연산자|연산수행위치|
|--------|--------|--------|
| 삽입연산 | insert | front 또는 rear |
| 삭제연산 | delete | front 또는 rear |

## Tree
비선형 자료구조 중 자료들 간에 계층관계를 가진 계층형 자료 구조. 연산을 단순화 하기 위해 트리의 노드 구조를 일정하게 정의한 것이 이진트리. 모든 노드의 차수를 2 이하로 정하여 트리의 차수가 2 이하가 되도록 만듬.

### 이진 트리 (Binary Tree)
`n` 개의 노드를 가진 이진 트리는 항상 `n-1` 개의 간선을 가짐. 높이가 `h` 인 이진 트리가 가질 수 있는 노드의 최소 개수는 `h+1` 개.

- [`com.datastructure.tree.binaraytree`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/tree/binaraytree) 연결자료구조방식을 통한 이진트리 구현
	- 전위 순회: `DLR`의 순서로 순회
	- 중위 순회: `LDR`의 순서로 순회
	- 후위 순회: `LRD`의 순서로 순회
- [`com.datastructure.tree.binarysearchtree`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/tree/binarysearchtree) 연결자료구조방식을 통한 이진탐색트리 구현
	- 탐색을 위한 자료구조로 이진트리를 사용하기 위해 저장할 데이터의 크기에 따라 노드의 위치를 정한 트리. 
		- 모든 원소는 서로 다른 유일한 키를 가짐.
		- 왼쪽 서브트리의 키 < 그 루트의 키
		- 오른쪽 서브 트리의 키 > 그 루트의 키

### 힙 (Heap)
완전 이진 트리에 있는 노드 중 키 값이 가장 큰 노드나 키 값이 가장 작은 노트를 찾기 위해 만든 자료 구조.

- [`com.datastructure.tree.heap`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/tree/heap) 순차 자료 구조를 통한 최대 힙 구현.

## Graph
