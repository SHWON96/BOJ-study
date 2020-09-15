# 작성자 : SH_WON_96
# 2020-08-12
# 알고리즘 - 2 level - 프로그래머스
# 문제번호 :


# 초기 입력값 받기
#import sys
#input = sys.stdin.readline

board = [[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]
maxre = 0
maxlen = min(len(board[0]),len(board))

for i in range(len(board[0])):
    for j in range(len(board)):
        length = j - i + 1
        area = 0
        for s in range(i, j + 1):
            for k in range(i, j + 1):
                area += board[s][k]
        if (area == length ** 2):
            maxre = area