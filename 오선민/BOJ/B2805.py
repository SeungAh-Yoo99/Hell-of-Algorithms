'''
문제 링크: https://www.acmicpc.net/problem/2805
시간: 4028 ms
메모리: 144340 KB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''

import sys
input = sys.stdin.readline

# 나무의 수: n, 필요한 나무: M(목표), 절단기 높이: H(정답), 최소 M미터의 나무를 집에 가져가기 위한 절단기 높이 H는?
n, m = map(int, input().strip().split())
trees = list(map(int, input().strip().split()))

trees.sort()
start = 0
end = max(trees)
result = 0

while(start <= end):
	total = 0
	mid = (start + end) // 2
	for i in trees:
		# 잘랐을 때 나무의 양 계산
		if i > mid:
			total += i-mid
	
     # 나무의 양이 m에 도달하지 못한다면
	if total < m:
		# end 값을 왼쪽으로 보낸다
		end = mid -1
	# 나무의 양이 m을 초과한다면
	else:
		result = mid # while문 반복 -> 최소의 result를 얻을 수 있게 됨
		start = mid +1
print(result)		
        
