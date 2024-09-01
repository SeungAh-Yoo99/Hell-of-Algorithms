'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120891
시간: 0.01ms
메모리: 10.1MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(order):
    order_count = str(order).count('3') + str(order).count('6') + str(order).count('9')
    return order_count
