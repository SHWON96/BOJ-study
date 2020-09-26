# 작성자 : SH_WON_96
# 2020-09-25
# 알고리즘 - DP
# 문제번호 : 9251 LCS 문제


# 초기 입력값 받기
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10000)

X = [""]
Y = [""]
X = X+(list(input().strip()))
Y = Y+(list(input().strip()))

where = []
LCS =[[0]*(len(Y)) for i in range(len(X))]
ck = [[""]*(len(Y)) for i in range(len(X))]

for i in range(1,len(X)):
    for j in range(1,len(Y)):
        if(X[i]==Y[j]):
            LCS[i][j] = LCS[i-1][j-1]+1
            ck[i][j] = "0"
        elif(LCS[i-1][j]>=LCS[i][j-1]):
            LCS[i][j] = LCS[i-1][j]
            ck[i][j] = "1"
        else:
            LCS[i][j] = LCS[i][j-1]
            ck[i][j] = "2"

def printLCS(ck,LCS,i,j):
    if i==0 or j==0:
        return
    if ck[i][j] == "0":
        printLCS(ck,LCS,i-1,j-1)
        print(X[i], end="")
    elif ck[i][j] == "1":
        printLCS(ck,LCS,i-1,j)

    else:
        printLCS(ck,LCS,i,j-1)
print(LCS[len(X)-1][len(Y)-1])


# LCS 2 정답 
printLCS(ck,LCS,len(X)-1,len(Y)-1)

###
# X = input().strip()
# Y = input().strip()
# where = []
# arr = [0 for _ in range(len(Y))]
#
# for i in range(len(X)):
#     max_num = 0
#     for j in range(len(Y)):
#         if max_num < arr[j]:
#             max_num = arr[j]
#         elif X[i] == Y[j]:
#             arr[j] = max_num + 1
#
# print(max(arr))
# print(where)