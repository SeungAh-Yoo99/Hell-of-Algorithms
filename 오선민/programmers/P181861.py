'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120904
시간: 0.10ms
메모리: 10.9MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(arr):
    x = []
    for i in arr:
        x += [i] * i
    return x