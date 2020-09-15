# 작성자 : SH_WON_96
# 2020-09-15
# 알고리즘 - Graph
# 문제번호 : 2667

# 초기 입력값 받기
import sys
input = sys.stdin.readline
N = int(input())
G = [[0 for i in range(N)] for j in range(N)]

for i in range(N):
    x = list(input())
    for j in range(N):
        G[i][j] = int(x[j])


visited = [[0]*N for i in range(N)]
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

# queue = [(0,0)]
# visited[0][0] = 1
queue = []
type = 1


def findapt(queue, visited, type):
    count = 0
    while queue:
        x, y = queue.pop(0)

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if (0 <= nx < N) and (0 <= ny < N):
                if (visited[nx][ny] == 0 and G[nx][ny] == 1):
                    visited[nx][ny] = type
                    queue.append((nx, ny))
                    count += 1
    return count

howmany =[]
for i in range(N):
    for j in range(N):
        if (G[i][j]==1 and visited[i][j]==0):
            queue.append((i,j))
            howmany.append(findapt(queue,visited,type))
            type += 1

#print(visited)
print(len(howmany))
howmany.sort()
for i in howmany:
    if(i==0):
        print(1)
    else:
        print(i)
