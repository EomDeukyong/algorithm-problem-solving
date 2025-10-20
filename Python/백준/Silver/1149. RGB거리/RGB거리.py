num=int(input())
prev=[0,0,0]

for i in range(num):
  current=[0,0,0]
  r,g,b=map(int,input().split())
  current[0]=r+min(prev[1],prev[2])
  current[1]=g+min(prev[0],prev[2])
  current[2]=b+min(prev[0],prev[1])
  prev=current
print(min(prev))