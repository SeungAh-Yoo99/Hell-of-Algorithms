'''
문제 링크: https://www.acmicpc.net/problem/2805
시간: 1856 ms
메모리: 144340 KB
PR 제목 : 날짜 사이트_명 문제_번호 사용_언어
'''
import sys
input = sys.stdin.readline

# 나무의 수: n, 필요한 나무: M(목표), 절단기 높이: H(정답), 최소 M미터의 나무를 집에 가져가기 위한 절단기 높이 H는?
n, m = map(int, input().strip().split())
trees = list(map(int, input().strip().split()))

# trees.sort() 사실상 사용하지 않음
start = 0
end = max(trees)
result = 0

while(start <= end):
	mid = (start + end) // 2
    # 리스트 컴프리헨션 -> for문보다 처리 속도가 빠름 (사유: 내부 최적화, 오버헤드 감소)
	total = sum(i-mid for i in trees if i > mid)
     # 나무의 양이 m에 도달하지 못한다면
	if int(total) < m:
		# end 값을 왼쪽으로 보낸다
		end = mid -1
	# 나무의 양이 m을 초과한다면
	else:
		result = mid # while문 반복 -> 최소의 result를 얻을 수 있게 됨
		start = mid +1
print(result)