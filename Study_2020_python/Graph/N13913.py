# 작성자 : SH_WON_96
# 2020-09-16
# 알고리즘 - Graph
# 문제번호 : 13913 숨바꼭질 4

# 초기 입력값 받기
import sys
import collections

queue = collections.deque([])
input = sys.stdin.readline
N,M = map(int, input().split(" "))

visited = [0]*100001
how = [0]*100001
def dx(put):
    change = []
    change.append(put - 1)
    change.append(put + 1)
    change.append(put * 2)
    return change

def findsoo(From,To):
    queue.append(From)
    visited[From] = 1
    how[From] = From
    while queue:

        x = queue.popleft()
        newx = dx(x)
        for i in range(3):
            nx = newx[i]
            if (0 <= nx <= 100000) :
                if (visited[nx] == 0 ):
                    visited[nx] = visited[x] + 1
                    queue.append((nx))
                    how[nx] = x
                elif (visited[nx] > 0):
                    visited[nx] = min(visited[x] + 1, visited[nx])

    return visited,how


result1, result2 = findsoo(N,M)

print(result1[M]-1)

get = M
res = []
for i in range(result1[M]):
    res.append(get)
    get = result2[get]

res.reverse()
for i in res:
    print(i,end=" ")


# for i in range(len(result2[M])):
#     print(result2[M][i],end=" ")



