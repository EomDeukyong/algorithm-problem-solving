n=int(input())
list=list(map(int,input().split()))
if len(list)==1:
    print(list[0]*list[0])
else:
    print(min(list)*max(list))
