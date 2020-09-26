# 작성자 : SH_WON_96
# 2020-09-26
# 알고리즘 - DP
# 문제번호 : 11722 가장 긴 증가하는 부분 수열

# 초기 입력값 받기
import sys
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))

dp = [1 for i in range(n)]

for i in range(n):
    for j in range(i):
        if lst[i] > lst[j]:
            dp[i] = max(dp[i], dp[j] + 1)

print(dp)
print(max(dp))