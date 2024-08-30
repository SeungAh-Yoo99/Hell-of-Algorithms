'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120904
시간: 0.00ms
메모리: 10.1MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(num, k):
    for idx, n in enumerate(str(num)):
        if n == str(k):
            return idx+1
    return -1