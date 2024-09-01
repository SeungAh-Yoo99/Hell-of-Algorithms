'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181866
시간: 5.31ms
메모리: 12.3MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(myString):
    # sample_list = list(filter(None, sample_list))
    return sorted(list(filter(None, myString.split("x"))))