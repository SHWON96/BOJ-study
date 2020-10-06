# 작성자 : SH_WON_96
# 2020-10-06
# 알고리즘 - Greedy
# 문제번호 : 1931 회의실 배정

# 초기 입력값 받기
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10000)
N = int(input())
table = []

for i in range(N):
    x, y = map(int, input().strip().split(" "))
    table.append([x,y])

# 시작시간 기준으로 정렬
#table = sorted(table, key=lambda table: table[0])
# 종료시간 기준으로 정렬
#table = sorted(table, key=lambda table: table[1])

# x[1]으로 먼저 정렬, x[0] 으로 정렬
table.sort(key=lambda x: (x[1],x[0]))


def solution(table):
    answer = 0
    endTime = 0
    for i in (table):
        # 시작시간이 이전 끝시간보다 크면 실행
        if endTime <= i[0]:
            endTime = i[1]
            answer += 1
    return answer

print(solution(table))
