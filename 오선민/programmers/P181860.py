'''
문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181860
시간: 0.04ms
메모리: 10.2MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

def solution(arr, flag):
    x = []
    for idx, f in enumerate(flag):
        if f:
            x.extend([arr[idx]] * 2 * arr[idx])
        else:
            del x[-arr[idx]:]
    return x