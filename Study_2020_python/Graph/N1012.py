# 작성자 : SH_WON_96
# 2020-09-17
# 알고리즘 - Graph
# 문제번호 : 1012 유기농 배추



def findapt(queue, visited, type):
    count = 0
    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if (0 <= nx < N) and (0 <= ny < M):
                if (visited[nx][ny] == 0 and G[nx][ny] == 1):
                    visited[nx][ny] = type
                    queue.append((nx, ny))
                    count += 1
    return count


# 초기 입력값 받기
import sys
import collections
input = sys.stdin.readline
TestCase = int(input())
#G = [[0 for i in range(N)] for j in range(N)]
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

for i in range(TestCase):
    M, N ,K = map(int, input().split())
    G = [[0]*M for i in range(N)]
    for i in range(K):
        x ,y = map(int,input().split())
        G[y][x] = 1

    visited = [[0]*M for i in range(N)]
    queue = collections.deque()
    type = 1

    howmany =[]
    for i in range(N):
        for j in range(M):
            if (G[i][j]==1 and visited[i][j]==0):
                queue.append((i,j))
                howmany.append(findapt(queue,visited,type))
                type += 1


    print(len(howmany))


