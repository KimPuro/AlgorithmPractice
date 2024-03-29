package practice;
/*
백준 4659: 비밀번호 발음하기
이 Java 프로그램은 다음과 같은 규칙을 기반으로 문자열이 "acceptable"인지 아닌지를 결정합니다:
각 문자열은 최소 하나의 모음을 포함해야 합니다. (모음: 'a', 'e', 'i', 'o', 'u')
동일한 글자가 연속으로 두 번 이상 나타나지 않아야 합니다. 예외적으로 'e'와 'o'는 두 번 연속 나타날 수 있습니다.
모음 또는 자음이 연속으로 세 번 나오지 않아야 합니다.
이 프로그램은 이러한 규칙을 다음과 같이 처리합니다:
type(char c): 입력 문자가 모음인지 자음인지 확인합니다. 모음일 경우 1을 반환하고, 자음일 경우 -1을 반환합니다.
hasOne(String s): 문자열 s가 적어도 하나의 모음을 포함하고 있는지 확인합니다.
hasNoThree(String s): 문자열 s에서 모음 또는 자음이 연속으로 세 번 이상 나오지 않는지 확인합니다.
hasNoTwo(String s): 문자열 s에서 같은 문자가 연속으로 두 번 이상 나오지 않는지 확인합니다. 'e'와 'o'는 예외적으로 허용됩니다.
check(String s): 위의 세 개의 조건(hasOne, hasNoThree, hasNoTwo)이 모두 참인지 확인하여 입력 문자열 s의 "acceptable" 여부를 결정합니다.
inputOutput(): 사용자로부터 문자열을 입력받아 해당 문자열이 "acceptable"한지 확인합니다. 만약 문자열이 "end"라면 프로그램을 종료합니다. 사용자가 입력하는 각 문자열에 대해, "<문자열> is acceptable." 또는 "<문자열> is not acceptable."를 출력합니다.
따라서 이 프로그램은 사용자로부터 입력받은 문자열이 위에서 설명한 규칙에 따라 "acceptable"한지 아닌지를 판별하여 결과를 출력합니다.
 */
public class B4659{

}









