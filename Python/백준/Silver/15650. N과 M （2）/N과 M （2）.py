n,m=map(int,input().split())
result=[]
current=[]
def dfs(start : int):
    if len(current)==m:
        print(" ".join(map(str,current)))
        return
    for i in range(start,n+1):
        current.append(i)
        dfs(i+1)
        current.pop()
dfs(1)

