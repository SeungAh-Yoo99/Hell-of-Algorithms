'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120903
시간: 0.01ms
메모리: 10.3MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(s1, s2):
    return len([s for s in s1 if s in s2])