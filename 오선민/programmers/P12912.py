'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12912
시간: 987.32ms
메모리: 10.2MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(a, b):
    result = 0
    if a > b:
        a, b = b, a
    for i in range(a, b+1):
        result += i
    return result