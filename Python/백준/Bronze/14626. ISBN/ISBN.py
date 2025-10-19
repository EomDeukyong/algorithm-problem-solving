num = input()
weight = 1
loss_weight = 0
last_num = int(num[-1])
num=num[:-1]
sum = 0
for i in num:
  if i != "*":
    sum = sum + int(i) * weight
  else:
    loss_weight = weight
  if weight == 1:
    weight = 3
  else:
    weight = 1
for i in range(10):
  if (sum+last_num+loss_weight*i)%10==0:
    print(i)