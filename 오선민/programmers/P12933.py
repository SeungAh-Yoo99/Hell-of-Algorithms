'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12933
시간: 0.03ms
메모리: 10.3MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(n):
    result = sorted([s for s in str(n)], reverse=True)
    return int(''.join(result))