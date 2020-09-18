# 작성자 : SH_WON_96
# 2020-09-18
# 알고리즘 - Graph
# 문제번호 : 10026 적록색약

# 초기 입력값 받기
import sys
import collections
import copy
input = sys.stdin.readline
N = int(input())

G = [[""]*N for i in range(N)]

for i in range(N):
    x = input().strip()
    for j in range(N):
        G[i][j] = x[j]

dx, dy = [-1,1,0,0], [0,0,-1,1]


def nonRG(Graph):
    visited = [[0] * N for i in range(N)]
    for i in range(N):
        for j in range(N):
            if(Graph[i][j] == "R"):
                Graph[i][j] = "G"
    result = 0
    queue = collections.deque()
    for s in range(N):
        for t in range(N):
            if(visited[s][t] == 0):
                result += 1
                queue.append((s,t))
                visited[s][t] = 1

            while queue:
                x,y = queue.popleft()
                for i in range(4):
                    nx = x + dx[i]
                    ny = y + dy[i]
                    if( 0<= nx <N and 0 <= ny <N):
                        if(visited[nx][ny] == 0 and Graph[nx][ny]==Graph[x][y]):
                            visited[nx][ny] = result
                            queue.append((nx,ny))
    return result


def RG(Graph):
    visited = [[0] * N for i in range(N)]
    result = 0
    queue = collections.deque()
    for s in range(N):
        for t in range(N):
            if(visited[s][t] == 0):
                result += 1
                queue.append((s,t))
                visited[s][t] = 1

            while queue:
                x,y = queue.popleft()
                for i in range(4):
                    nx = x + dx[i]
                    ny = y + dy[i]
                    if( 0<= nx <N and 0 <= ny <N):
                        if(visited[nx][ny] == 0 and Graph[nx][ny]==Graph[x][y]):
                            visited[nx][ny] = result
                            queue.append((nx,ny))

    return result

print(RG(copy.deepcopy(G)), end=" ")
print(nonRG(copy.deepcopy(G)))

