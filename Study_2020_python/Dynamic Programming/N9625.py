# 작성자 : SH_WON_96
# 2020-09-27
# 알고리즘 - 문자열
# 문제번호 : 9625 BABBA

# 초기 입력값 받기
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10000)

test = int(input())

A = 1
B = 0

for i in range(test):
    tmp = B
    B = A + B
    A = tmp

print (str(A)+" "+str(B))