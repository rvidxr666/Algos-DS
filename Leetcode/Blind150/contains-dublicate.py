def hasDuplicate(self, nums: list) -> bool:
    st = set()

    for num in nums:
        st.add(num)

    if len(st) == len(nums):
        return False

    return True


# Approach
# Use SET as the Data Structure
# Input elements from the array to set
# Compare set len and array len


