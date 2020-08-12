# 작성자 : SH_WON_96
# 2020-08-02
# 알고리즘 - DP
# 문제번호 : 1932

# 초기 입력값 받기
import sys
input = sys.stdin.readline

testCase = int(input())
sample = []

for i in range(testCase):
    line = [int(number) for number in input().split(" ")]
    sample.append(line)

dp = [[0]*i for i in range(1,testCase+1)]
dp[0][0] = sample[0][0]



for i in range(1,testCase):
    dp[i][0] = (dp[i-1][0]+sample[i][0])
    dp[i][i] = dp[i-1][i-1]+sample[i][i]
    for j in range(1,i):
        dp[i][j] = (max(dp[i-1][j]+sample[i][j],dp[i-1][j-1]+sample[i][j]))


print(max(dp[testCase-1]))