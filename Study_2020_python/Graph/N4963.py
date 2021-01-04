# 작성자 : SH_WON_96
# 2021-01-04
# 알고리즘 - Graph
# 문제번호 : 4963

# 초기 입력값 받기
import sys
from collections import deque
input = sys.stdin.readline


# N 열 M 행
def Calland(N,M):
    # 그래프 생성
    G = [0 for i in range(M)]
    for i in range(M):
        G[i] = list(map(int, input().strip().split(" ")))


    visited = [[0]*N for i in range(M)]

    # print(G)
    # print(visited)

    queue = deque()
    landnum = 0
    for i in range(M):
        for j in range(N):
            if (G[i][j] == 1 and visited[i][j] == 0):
                queue.append((i, j))
                landnum += 1
                visited[i][j] = landnum
                while queue:
                    x, y = queue.popleft()
                    for k in range(8):
                        nx = x + dx[k]
                        ny = y + dy[k]
                        if (0 <= nx < M and 0 <= ny < N):
                            if(visited[nx][ny]==0 and G[nx][ny]==1):
                                visited[nx][ny] = landnum
                                queue.append((nx,ny))


    return landnum
dx, dy = [-1, -1, -1, 0, 0, 1, 1, 1],[-1, 0, 1, -1, 1, -1, 0, 1]




#print(Calland(5,4))
while True:
    N, M = list(map(int, input().split(" ")))
    if N == 0 and M == 0:
        break
    else:
        print(Calland(N,M))