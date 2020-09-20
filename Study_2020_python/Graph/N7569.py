# 작성자 : SH_WON_96
# 2020-09-20
# 알고리즘 - Graph
# 문제번호 : 7569 토마토 // 파이썬 시간초과, pypy3에서 가능

# 초기 입력값 받기
import sys
import collections


def ripening(queue, visited):

    while queue:
        z, x, y = queue.popleft()

        for i in range(6):
            nx = x + dx[i]
            ny = y + dy[i]
            nz = z + dz[i]
            if (0 <= nx < N) and (0 <= ny < M) and (0 <= nz <H):
                if (visited[nz][nx][ny]==0 and G[nz][nx][ny] == 0):
                    visited[nz][nx][ny] = visited[z][x][y]+1
                    queue.append((nz, nx, ny))
                elif(visited[nz][nx][ny]>0 and G[nz][nx][ny] == 0):
                    visited[nz][nx][ny] = min(visited[z][x][y]+1,visited[nz][nx][ny])


    return visited

queue = collections.deque([])
input = sys.stdin.readline
M, N, H = map(int, input().split(" "))

# 시작
dx, dy ,dz = [-1, 1, 0, 0, 0, 0], [0, 0, -1, 1, 0, 0], [0, 0, 0, 0, 1, -1]
count = 0
find = 1
max = 0

visited = [[[0]*M for i in range(N)] for k in range(H)]
G = [[[0]*M for j in range(N)] for k in range(H)]

for k in range(H):
    for i in range(N):
        x = input().split(" ")
        for j in range(M):
            G[k][i][j] = int(x[j])
            if (G[k][i][j] == 1 and visited[k][i][j] == 0):
                count += 1
                queue.append((k,i,j))
                visited[k][i][j] = 1



if(count == M*N):
    print(0)
else:
    result = ripening(queue,visited)
    for k in range(H):
        for i in range(N):
            for j in range(M):
                if(result[k][i][j]+G[k][i][j] == 0):
                    find = 0
                if(result[k][i][j]>=max):
                    max = result[k][i][j]

    if(find):
        print(max-1)
    else:
        print(-1)

