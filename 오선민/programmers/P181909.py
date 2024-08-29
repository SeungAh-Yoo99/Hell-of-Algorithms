'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181909
시간: 0.04ms
메모리: 10.3MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(my_string):
    return sorted([my_string[i::] for i in range(len(my_string))])

