'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120895
시간: 0.00ms
메모리: 10.2MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(my_string, num1, num2):
    my_list = list(my_string)
    my_list[num1], my_list[num2] = my_list[num2], my_list[num1]
    return ''.join(my_list)