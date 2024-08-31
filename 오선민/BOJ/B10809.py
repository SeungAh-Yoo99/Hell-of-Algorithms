'''
문제 링크: https://www.acmicpc.net/problem/10809
시간: 108ms
메모리: 34892MB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

import sys
import string
input = sys.stdin.readline
lowerList = string.ascii_lowercase

s = input().strip()
result = []

for chr in lowerList:
    result.append(str(s.find(chr)))

print(' '.join(result))