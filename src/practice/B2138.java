package practice;
/*
백준2138: 전구와 스위치
1. 실제 알고리즘 실행에 앞서 org 배열을 tmp에 복사하여 초기 상태를 임시 상태로 저장합니다.
2. 처음에는 첫 번째 스위치를 누르지 않은 경우를 가정하고 계산을 시작합니다.
두 번째 스위치부터 n 번째 스위치까지 진행하며 만약 tmp[i - 1] (현재 스위치 전의 상태)가 '원하던 상태 want[i -1]와 다르면 그 스위치를 누릅니다(change(i)).
 이때, tmp 상태를 변경하며 스위치 조작 횟수(ans1)를 하나씩 늘립니다.
3. 모든 스위치에 대한 계산이 끝난 후, 현재 tmp 배열이 want 상태와 동일한지 검사하고 그렇다면 ans1을 출력합니다.
4. 만약 첫 번째 스위치를 누르지 않았을 때 원하는 상태를 만들지 못했다면, 이번에는 첫 번째 스위치를 누른 경우를 가정하고 동일한 과정을 반복합니다.
방법은 동일하지만 스위치를 누르는 데 필요한 횟수를 기록하는 변수는 ans2로 바뀝니다.
5. 모든 계산 후에도 원하는 상태를 도달하지 못했다면 -1을 출력하여 목표 상태 도달이 불가능하다는 것을 나타냅니다.
6. change(int index) 메소드는 주어진 스위치 위치의 상태를 그 이전 위치, 같은 위치, 그 다음 위치의 전구들의 상태를 변경하는 함수입니다.
check() 함수는 tmp와 want가 같은지 확인하는 함수로, 모든 전구의 상태가 원하는 상태와 같다면 true를 반환하고 그렇지 않다면 false를 반환합니다
 */

public class B2138 {

}