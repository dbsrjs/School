import random

red = '\033[31m \033[41m' + '■' + '\033[0m'
blue = '\033[34m \033[44m' + '■' + '\033[0m'
yellow = '\033[33m \033[43m' + '■' + '\033[0m'
green = '\033[32m \033[42m' + '■' + '\033[0m'
pink = '\033[35m \033[45m' + '■' + '\033[0m'
null = '\033[30m \033[40m' + '■' + '\033[0m'

a_list, b_list, c_list, d_list, e_list, f_list, g_list = [], [], [], [], [], [], [] #병

str_list = [red, blue, yellow, green, pink] #색을 모아둔 리스트

lis_list = [a_list, b_list, c_list, d_list, e_list, f_list, g_list] #병을 모아둔 리스트

# 병에 랜덤한 색 넣기
for i in str_list:
    for j in range(4):
        lis_list[random.randrange(len(lis_list))].append(i) #lis_list중 랜덤으로 정해진 곳에 원소의 i 값 넣기

# 병 정리
if len(lis_list[len(lis_list)-1]) > 4:   #만약 lis_list[마지막]의 길이가 4 이상일 때
    for j in range(len(lis_list[len(lis_list)-1])-4):   #lis_list[마지막]의 길이가 4가 될 때 까지 반복
        lis_list[0].append(lis_list[len(lis_list)-1].pop())  #lis_list[첫번째]에 lis_list[마지막] 뒤에 있는 값 보내주기
    #lis_list[마지막]의 길이가 4가 될 때 까지 lis_list[첫번째]한테 짬처리

for i in range(1, len(lis_list)):   
    if len(lis_list[i-1]) > 4:
        for j in range(len(lis_list[i-1])-4):
            lis_list[i].append(lis_list[i-1].pop())
    #lis_list[i]가 4가 될 때 까지 옆 리스트에 마지막 원소 값을 보내줌

while True:
    f=0
    # 공백 생성
    for i in lis_list:
        for j in range(4-len(i)):
            i.append(null)

    # 병 출력
    for i in range(3, -1, -1):
        for j in range(len(lis_list)):
            print(lis_list[j][i],end=" ")
        print()

    #클리어
    for i in range(len(lis_list)):  
        if lis_list[i].count(lis_list[i][0])==4:    #랜덤의 병들 중 선택된 병이 꽉 차있다면
            f+=1

    if f == 7:  #무한 반복문 멈추기
        break

    # 공백 제거
    for i in range(len(lis_list)):
        for j in range(len(lis_list[i])):
            if null in lis_list[i]:
                lis_list[i].pop()

    # 이동
    X = int(input("어디에서?(포기하실려면 '77'을 입력해주세요)"))-1
    if X == 76:
        print("다음에 또 도전해보세요.")
        exit()
    Y = int(input("어디로?"))-1

    if (X > len(lis_list)-1 or Y > len(lis_list)-1 or X < 0 or Y < 0 or len(lis_list[X]) == 0):
        print("다시 입력해주세요.")
        continue


    if len(lis_list[Y]) == 4:   #이동 하려는 곳(lis_list[Y])의 원소의 개수가 0일 때
        print("이동시동 할려는 병이 꽉 차있어서 이동 할 수 없습니다")

    elif len(lis_list[Y]) == 0 or lis_list[X][len(lis_list[X])-1] == lis_list[Y][len(lis_list[Y])-1]:   #이동 하려는 곳(lis_list[Y])의 원소의 개수가 없거나, 이동 시키는 곳(lis_list[Y])의 끝 모래의 색과 이동 하려는 곳(lis_list[X])의 끝 모래의 색이 같을 때
        lis_list[Y].append(lis_list[X].pop())

    else:
        print("움직일 수 없습니다")

    print("---------------------------------------------")

#엔딩
print("게임을 클리어하셨군요. 축하드립니다!")
