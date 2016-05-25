# 내부 정렬 (Sort) 

> [자바로 배우는 쉬운 자료구조. 이지영 저. 한빛아카데미. 2013.](http://book.naver.com/bookdb/book_detail.nhn?bid=7278662) 의 예제를 참고함.

<br>

## 정렬 방법의 분류
- 실행 방법에 따른 분류
	- 비교식 정렬: 비교하고자 하는 각 키 값들을 한번에 두개씩 비교하여 교환
	- 분산식 정렬: 키 값을 기준으로 하여 자료를 여러 개의 부분집합 단위로 분해하여 비교, 정렬
- 정렬 장소에 따른 분류
	- 내부 정렬
		- 교환 방식: 키를 비교하고 교환하여 정렬
		- 삽입 방식: 키를 비교하고 삽입하여 정렬
		- 병합 방식: 키를 비교하고 병합하여 정렬
		- 분배 방식: 키를 구성하는 값을 여러 개의 부분집합에 분배하여 정렬
		- 선택 방식: 이진 트리를 사용하여 정렬
		
	- 외부 정렬 
		- 병합 방식  

## 선택 정렬 (Selection Sort)
- [`com.sort.selection`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/sort/selection) 

전체 원소들 중 기준 위치에 맞는 원소를 선택하여 자리를 교환하는 방식. 전체 원소 중 가장 작은 원소를 찾아 첫번째 원소와 자리 교환, 두번째로 작은 원소를 찾아 두번째 원소와 자리 교환... 의 과정을 반복. 

- 1단계에서 첫 번째 원소를 기준으로 n 개의 원소 비교
- 2단계에서 두 번째 원소를 기준으로 n-1개의 원소 비교
- ...

## 버블 정렬 (Bubble Sort)
- [`com.sort.bubble`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/sort/bubble)

인접한 두개의 원소를 비교하여 자리를 교환하는 방식. 첫 번째 원소부터 마지막 원소까지 반복하면 가장 큰 원소가 마지막 자리로 정렬하게 됨. 가장 마지막 원소부터 정렬 된다.

## 퀵 정렬 (Quick Sort)
- [`com.sort.quick`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/sort/quick)

기준 값(피봇, Pivot)을 중심으로 전체 원소들을 왼쪽 부분집합과 오른쪽 부분집합으로 분할. 왼쪽부분집합에는 기준값보다 작은 원소들을, 오른쪽부분집합에는 기준값보다 큰 원소들을 이동시킴. 

## 삽입 정렬 (Insert Sort)
- [`com.sort.insert`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/sort/insert)

정렬할 자료가 두 개의 부분집합으로 나뉘어 있다고 생각하고 정렬을 수행. 정렬 된 앞부분의 원소들은 부분집합 `S`가 되고 정렬되지 않은 나머지 원소들은 부분집합 `U`로 정하여 정렬되지 않은 부분집합 `U`의 원소를 하나씩 꺼내서 이미 정렬되어 있는 부분집합 `S`의 마지막 원소부터 비교하면서 위치를 찾아 삽입하는 방식.

- 정렬할 데이터: {69, 10, 30, 2, 16, 8, 31, 22}
- S= {69}, U= {10, 30, 2, 16, 8, 31, 22}

## 셸 정렬 (Shell Sort)
- [`com.sort.shell`] (https://github.com/iamkyu/data-structure-tutorial/tree/master/src/com/sort/shell)

일정한 간격으로 떨어져 있는 자료들끼리 부분집합을 구성하고 각 부분집합에 있는 원소들에 대해 삽입 정렬을 수행하는 작업을 반복하면서 전체 원소들을 정렬하는 방법. 삽입 정렬을 수행하는 것보다 비교 연산과 교환 연산의 횟수를 줄일 수 있음.