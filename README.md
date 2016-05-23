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
모든 연결 구조를 표현할 수 있는 자료구조. 연결할 객체를 나타내는 정점(Vertex)와 간선(Edge)의 집합으로 구성. `G=(V, E)`

- [`com.datastructure.graph.AdjMatrix`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/graph) 순차자료구조방식을 이용한 그래프 구현(인접행렬 방법)
- [`com.datastructure.graph.AdjList`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/graph) 연결자료구조방식을 이용한 그래프 구현(인접리스트 방법)

<br>
### 그래프의 종류

#### *- 무방향 그래프 (Undirected Graph)*
두 정점을 연결하는 간선에 방향이 없는 그래프. `(Vi, Vj)`와 `(Vj, Vi)` 는 같은 간선을 나타냄.

#### *- 방향 그래프 (Directed Graph)*
다이그래프(Digraph)라고도 하며, 간선에 방향이 있는 그래프. Vi -> Vj를 `<Vi, Vj>` 로 표현하고 화살표로 나타냄. Vi를 tail, Vj를 head라고 함. `<Vi, Vj>`와 `<Vj, Vi>`  는 서로 다른 간선.

#### *- 완전 그래프 (Complete Graph)*
한 정점에서 다른 모든 정점과 연결되어 최대 간선 수를 가진 그래프. 정점이 `n`개인 무방향 그래프의 최대 간선 수는 `n(n-1)/2`개 이며, 방향 그래프의 경우는 `n(n-1)`개.

#### *- 부분 그래프 (Sub Graph)*
원래 그래프에서 일부의 정점이나 간선을 제외하여 만든 그래프.

#### *- 가중 그래프 (Weight Graph or Network)*
정점을 연결하는 간선에 가중치를 할당한 그래프.

<br>
### 그래프 순회
- [`com.datastructure.graph.search`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/datastructure/graph/search)

#### *- 깊이 우선 탐색 (Depth First Search)*
시작 정점에서 한 방향으로 가장 먼 경로까지 깊이 탐색했다가 더 이상 갈 곳이 없으면 가장 마지막에 만난 갈림길로 되돌아와서 다른 방향의 간선으로 탐색을 계속함. 후입 선출 구조의 스택을 이용.
> (1) 시작 정점 v 방문<br>
> (2) 정점 v에 인접한 정점 중<br>
> 
> - a. 방문하지 않은 정점 w가 있으면 정점 v를 스택에 push하고 w를 방문.<br>
> - b. 방문하지 않은 정점이 없으면 스택을 pop하여 가장 마지막 정점을 v로 설정.<br>
>
> (3) 스택이 공백이 될 때까지 (2)를 반복.

#### *- 너비 우선 탐색 (Breath First Search)*
시작 정점으로부터 인접한 정점들을 모두 차례로 방문 후, 방문했던 정점을 다시 시작점으로 하여 인접한 정점들을 차례로 방문. 선입선출의 구조의 큐를 이용.
> (1) 시작 정점 v 방문<br>
> (2) 정점 v에 인접한 정점 중<br>
> 
> - a. 방문하지 않은 정점이 있으면 차례로 방문하면서 큐에 enQueue.<br>
> - b. 방문하지 않은 정점이 없으면 큐를 deQueue하여 구한 정점을 v로 설정하고 다시 (2)를 반복.<br>
>
> (3) 큐가 공백이 될 때까지 (2)를 반복.

