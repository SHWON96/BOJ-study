# 작성자 : SH_WON_96
# 2020-08-02
# 알고리즘 - DP
# 문제번호 : 1149

# 초기 입력값 받기
import sys
input = sys.stdin.readline

testCase = int(input())
price = [[0,0,0] for row in range(testCase+1)]

for i in range(1,testCase+1):
    each = input().split(" ")
    price[i][0] = int(each[0])
    price[i][1] = int(each[1])
    price[i][2] = int(each[2])

dp = [[0,0,0,0,0,0] for row in range(testCase+1)]

for i in range(1,testCase+1):
    dp[i][0] = (min(dp[i-1][2]+price[i][0],dp[i-1][4]+price[i][0]))
    dp[i][1] = (min(dp[i-1][2]+price[i][0],dp[i-1][4]+price[i][0]))
    dp[i][2] = (min(dp[i-1][0]+price[i][1],dp[i-1][5]+price[i][1]))
    dp[i][3] = (min(dp[i-1][0]+price[i][1],dp[i-1][5]+price[i][1]))
    dp[i][4] = (min(dp[i-1][1]+price[i][2],dp[i-1][3]+price[i][2]))
    dp[i][5] = (min(dp[i-1][1]+price[i][2],dp[i-1][3]+price[i][2]))

#print(price)
#print(dp)
print(min(dp[testCase]))