# 2020-07-18
# 알고리즘 - DP
# 문제번호 : 1003

# 메모이제이션

fibolist = [0]*41
def fibonacci(n):
    if(n == 0):
        fibolist[0] = 0
        return 0
    elif(n == 1):
        fibolist[1] = 1
        return 1
    else:
        if(fibolist[n]!=0):
            return fibolist[n]
        else:
            fibolist[n] = fibonacci(n-1) + fibonacci(n-2)
            return fibolist[n]


testcase = int(input())

for i in range(testcase):
    test = int(input())
    if(test == 0):
        print("1 0")
    elif(test == 1):
        print("0 1")
    else:
        fibonacci(test)
        print(str(fibolist[test-1])+" "+str(fibolist[test]))

