# 작성자 : SH_WON_96
# 2020-09-26
# 알고리즘 - DP
# 문제번호 : 11054 가장 긴 증가하는 부분 수열 4

# 초기 입력값 받기
import sys
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))

dp = [1 for i in range(n)]
point = [0 for i in range(n)]


for i in range(n):
    for j in range(i+1):
        if lst[i] > lst[j]:
            if(dp[i]<dp[j]+1):
                dp[i] = dp[j] + 1
                point[i] = j # 어디에서 온건지 기록


maxvalue = max(dp)

# 기록된 순서 백트래킹
back = dp.index(maxvalue)
result = []
for i in range(maxvalue):
    result.append(lst[back])
    back = point[back]

result.sort()

#정답
print(maxvalue)
for i in result:
    print(i, end=" ")
