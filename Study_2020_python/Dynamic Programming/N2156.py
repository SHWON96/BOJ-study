# 작성자 : SH_WON_96
# 2020-09-25
# 알고리즘 - DP
# 문제번호 : 2156 포도주 시식


# 초기 입력값 받기
import sys
input = sys.stdin.readline

N = int(input())
wine = []
for i in range(N):
    wine.append(int(input()))

dp = [[0, 0, 0] for i in range(N)]
dp[0] = [0, wine[0], 0] # 안마시고, 1잔 마시고, 아직2잔 못마시는

for i in range(1, N):
    dp[i][0] = max(dp[i - 1]) # 안마셨고, 이전까지 최고 마신 양
    dp[i][1] = dp[i - 1][0] + wine[i] # 1잔 마심 i번째 것
    dp[i][2] = dp[i - 1][1] + wine[i] # 연속 두잔 i-1 마신 것에 i도 마심

print(dp)
print(max(dp[N-1]))