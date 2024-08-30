'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42840
시간: 6.48ms
메모리: 10.2MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(answers):
    p1 = [1, 2, 3, 4, 5]
    p2 = [2, 1, 2, 3, 2, 4, 2, 5]
    p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    count = [0, 0, 0]
    result = []
    
    for idx, answer in enumerate(answers):
        if answer == p1[idx%len(p1)]:
            count[0] += 1
        if answer == p2[idx%len(p2)]:
            count[1] += 1
        if answer == p3[idx%len(p3)]:
            count[2] += 1

    for idx, answer in enumerate(count):
        if count[idx] == max(count):
            result.append(idx+1)
    
    return result