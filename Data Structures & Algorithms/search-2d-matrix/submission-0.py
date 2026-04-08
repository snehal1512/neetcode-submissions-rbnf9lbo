class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows, cols = len(matrix) , len(matrix[0])
        low, high = 0 , rows - 1

        while low<=high:
            mid = (low+high)//2

            if target> matrix[mid][-1]:
                low = mid + 1
            elif target < matrix[mid][0]:
                high = mid - 1
            else:
                break
        if not (low<=high):
            return False
        else:
            row = (low+high)//2
            l,h = 0, cols-1
            while l<=h:
                m = (l+h)//2

                if matrix[row][m] < target:
                    l = m+1
                elif matrix[row][m] > target:
                    h = m-1
                else:
                    return True
            return False

