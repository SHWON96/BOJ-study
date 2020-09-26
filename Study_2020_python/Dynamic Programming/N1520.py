# 작성자 : SH_WON_96
# 2020-09-26
# 알고리즘 - DP , Graph
# 문제번호 : 1520 내리막 길

# 초기 입력값 받기
import sys
import collections
input = sys.stdin.readline
sys.setrecursionlimit(10000)


#queue = collections.deque()

# 메모리 초과 된다능 N,M 으로 햇음
def BFS(G,trial):
    queue = collections.deque([])
    Visit = []
    queue.append([0,0])
    Visit.append([0,0])
    while(len(queue)!=0):
        x,y = queue.popleft()
        if(x==N-1 and y==M-1):
            trial += 1
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if(0<=nx<N and 0<=ny<M):  # G[3][0] = 27
                if(G[nx][ny]<G[x][y]):
                    queue.append([nx,ny])
                    Visit.append([nx, ny])

    return trial


def DFS(x,y):
    if x==0 and y ==0:
        return 1
    if dp[x][y]==-1:
        dp[x][y] = 0

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if (0 <= nx < M and 0 <= ny < N):
                if (G[nx][ny] > G[x][y]):
                    dp[x][y] += DFS(nx,ny)

    return dp[x][y]



M,N = map(int, input().strip().split(" "))
G = [list(map(int, input().strip().split())) for i in range(M)]

#visited = [[0]*N for i in range(M)]
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

dp = [[-1]*N for i in range(M)]
#print(BFS(G,0))
print(DFS(M-1,N-1))
#print(G[3][0])


