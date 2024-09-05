'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181898
시간: 0.00ms
메모리: 10.1MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(arr, idx):
    # 찾을 문자, 시작지점, 종료지점
    try:
        return arr.index(1, idx)
    except ValueError:
        return -1