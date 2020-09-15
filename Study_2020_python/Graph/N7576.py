# 작성자 : SH_WON_96
# 2020-09-15
# 알고리즘 - Graph
# 문제번호 : 7576

# 초기 입력값 받기
import sys
import collections


def ripening(queue, visited):

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if (0 <= nx < N) and (0 <= ny < M):
                if (visited[nx][ny]==0 and G[nx][ny] == 0):
                    visited[nx][ny] = visited[x][y]+1
                    queue.append((nx, ny))
                elif(visited[nx][ny]>0 and G[nx][ny] == 0):
                    visited[nx][ny] = min(visited[x][y]+1,visited[nx][ny])


    return visited

queue = collections.deque([])
input = sys.stdin.readline
M,N = map(int, input().split(" "))

# 시작
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
count = 0
find = 1
max = 0

visited = [[0]*M for i in range(N)]
G = [[0]*M for j in range(N)]

for i in range(N):
    x = input().split(" ")
    for j in range(M):
        G[i][j] = int(x[j])
        if (G[i][j] == 1 and visited[i][j] == 0):
            count += 1
            queue.append((i, j))
            visited[i][j] = 1



if(count == M*N):
    print(0)
else:
    result = ripening(queue,visited)

    for i in range(N):
        for j in range(M):
            if(result[i][j]+G[i][j] == 0):
                find = 0
            if(result[i][j]>=max):
                max = result[i][j]

    if(find):
        print(max-1)
    else:
        print(-1)

