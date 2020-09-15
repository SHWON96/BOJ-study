# 작성자 : SH_WON_96
# 2020-09-15
# 알고리즘 - Graph
# 문제번호 : 1278

# 초기 입력값 받기
import sys
import math
input = sys.stdin.readline
N,M = map(int, input().split(" "))
#G = [input().rstrip() for _ in range(N)]
G = [[0 for i in range(M)] for j in range(N)]

for i in range(N):
    x = list(input())
    for j in range(M):
        G[i][j] = int(x[j])


#print(G)

visited = [[0]*M for i in range(N)]
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

queue = [(0,0)]
visited[0][0] = 1

while queue:
    x,y = queue.pop(0)

    if x == N-1 and y == M-1:
        print(visited[x][y])
        break

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if (0 <= nx < N) and (0 <= ny <M):
            if(visited[nx][ny]==0 and G[nx][ny]==1):
                visited[nx][ny] = visited[x][y]+1
                queue.append((nx,ny))

def BFS(G,i,j):
    queue = []
    visited = []
    queue.append([0,0])
    visited[0][0] = 1
    s=1; t = 1
    while(len(queue)!=0):
        poped = queue.pop()
        if (s==1 and poped[0] + s >= N ):
            s = s * (-1)
        if (s==-1 and poped[0] + s < 0):
            s = s * (-1)
        if (t==1 and poped[1]+t >= M):
            t = t *(-1)
        if (t==-1 and poped[1] + t <0):
            t = t * (-1)

        if(G[poped[0]+s][poped[1]]== 1 and ([poped[0]+s,poped[1]] not in visited)):
            queue.append([poped[0]+s,poped[1]])
            visited.append([poped[0]+s,poped[1]])


            #BFS(Visited,i+1,j)
        if (G[poped[0]][poped[1]+t] == 1 and ([poped[0],poped[1]+t] not in visited)):
            queue.append([poped[0], poped[1]+t])
            visited.append([poped[0], poped[1]+t])

        if(poped[0]==N-1 and poped[1]==M-1):
            return visited
            #BFS(Visited,i,j+1)

    return visited

#print(BFS(G,0,0))
#print(BFS(G).index(N,M))