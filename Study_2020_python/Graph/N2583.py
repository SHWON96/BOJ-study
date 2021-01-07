# 작성자 : SH_WON_96
# # 2021-01-07
# # 알고리즘 - Graph
# # 문제번호 : 2583 영역 구하기
#
# # 초기 입력값 받기
import sys
from collections import deque
input = sys.stdin.readline
queue = deque()
input = sys.stdin.readline
N,M,K = map(int, input().split(" "))

# N 행 M 열
# 그래프 생성
G = [[1 for i in range(M)] for i in range(N)]

# 좌표값에 맞는 직사각형 만들기 (주어진 그림과 똑같게 나타냈는데, 그럴 필요는 없음)
for i in range(K):
    x1,y1,x2,y2 = list(map(int, input().strip().split(" ")))
    #x1 ~ x2, y1 ~ y2 에 해당하는 G를 0으로 변경
    for t in range(x2-x1):
        for k in range(y2-y1):
            G[N-1-(y1+k)][x1+t] = 0

# 직사각형 체크
# for i in range(len(G)):
#     print(G[i])

howmany =[]
type = 1

dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
visited = [[0 for i in range(M)] for _ in range(N)]

def findblock(queue, visited):
    count = 0
    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if (0 <= nx < N) and (0 <= ny < M):
                if (visited[nx][ny] == 0 and G[nx][ny] == 1):
                    visited[nx][ny] = 1
                    queue.append((nx, ny))
                    count += 1
    return count



for i in range(N):
    for j in range(M):
        if G[i][j] == 1 and visited[i][j]==0:
            queue.append((i,j))
            howmany.append(findblock(queue, visited))


howmany.sort()
print(len(howmany))
for i in range(len(howmany)):
    if howmany[i] == 0:
        print(1,end=" ")
    else:
        print(howmany[i],end=" ")

