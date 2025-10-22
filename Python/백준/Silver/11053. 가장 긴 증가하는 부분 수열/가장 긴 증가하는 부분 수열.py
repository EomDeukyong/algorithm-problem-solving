N=int(input())
a_list=list(map(int,input().split()))
dp=[1]*N
for i in range(N):
    for i2 in range(i):
        if a_list[i2] < a_list[i]:
            dp[i]=max(dp[i2]+1,dp[i])
print(max(dp))