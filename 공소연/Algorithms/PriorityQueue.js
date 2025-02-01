class PriorityQueue {
    constructor() {
        this.heap = new Array(64);
        this.size = 0;
    }
    
    // 1. heap의 가장 끝에 value를 할당
    // 2. percolateUp() 호출을 통해 최소힙 정렬
    insert(value) {
        const heap = this.heap;
        const size = ++this.size;
        
        if (size === heap.length) heap.length *= 2;
        
        heap[size] = value;
        this.percolateUp();
    }
    
    // 1. 가장 끝에 할당된 value와 그의 부모의 값을 비교, value가 더 작으면 부모와 스왑
    // 2. 갱신된 pos를 기준으로 부모가 존재하면 스왑 반복
    percolateUp() {
        const heap = this.heap;
        const size = this.size;
        
        let pos = size;
        const item = heap[pos];
        
        while (pos > 1) {
            const parentPos = Math.floor(pos / 2);
            const parent = heap[parentPos];
            if (parent <= item) break;
            heap[pos] = parent;
            pos = parentPos;
        }
        
        heap[pos] = item;
    }
    
    // 1. 루트 값을 제거하고 가장 끝에 있는 요소를 루트로 가져옴
    // 2. percolateDown()을 통해 최소힙 정렬
    shift() {
        const heap = this.heap;
        const value = heap[1];
        if (value === undefined) return undefined;
        
        const size = --this.size;
        heap[1] = heap[size + 1];
        heap[size + 1] = undefined;
        
        this.percolateDown();
        return value;    
    }
    
    // 1. 루트 요소와 그의 자식 요소를 비교, 루트가 더 크면 자식과 스왑
    // 2. 갱신된 pos를 기준으로 자식이 존재하면 스왑 반복
    percolateDown() {
        const heap = this.heap;
        const size = this.size;
        
        const pos = 1;
        const item = heap[1];
        
        // 자식이 존재하면 실행
        while (pos * 2 <= size) {
            const childPos = pos * 2 + 1;
            if (childPos > size || heap[childPos - 1] < heap[childPos]) {
                childPos = pos * 2;
            }
            const child = heap[childPos];
            if (child >= item) break;
            heap[pos] = child;
            pos = childPos;
        }
        
        heap[pos] = item;
    }
}
