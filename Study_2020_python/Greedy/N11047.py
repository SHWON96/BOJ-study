# 작성자 : SH_WON_96
# 2020-09-21
# 알고리즘 - Greedy
# 문제번호 : 11047 동전0

# 초기 입력값 받기
import sys
input = sys.stdin.readline


N,K = map(int,input().strip().split(" "))
coins = []
for i in range(N):
    coins.append(int(input()))

which = 0
count = 0

while K!=0 :
    for i in range(N):
        if(int(K/coins[N-1-i])>0):
            count += int(K/coins[N-1-i])
            K = K-int(K/coins[N-1-i])*coins[N-1-i]
            break

print(count)
# while (price != 0):
#
#     for i in range(len(coins)):
#         if coins[i]>price:
#             which = i-1
#             break
#
#     while price > 0:
#         if(price-coins[which]<0):
#             break
#         price -= coins[which]
#         count += 1

#print(count)