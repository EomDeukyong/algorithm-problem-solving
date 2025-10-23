def solution(cards):
    result=[]
    for i in range(len(cards)):
        tmp=0
        next_step=i
        while True:
            if cards[next_step]!=0:
                tmp+=1
                temp=next_step
                next_step=cards[next_step]-1
                cards[temp]=0
            else:
                result.append(tmp)
                break
    print(result)
    max=sorted(result, reverse=True)
    answer = max[0]*max[1]
    return answer