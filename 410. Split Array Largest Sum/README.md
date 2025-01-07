<h2><a href="https://leetcode.com/problems/split-array-largest-sum/">410. Split Array Largest Sum</a></h2><h3>Hard</h3><hr><p>Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.<br><br> Return the minimized largest sum of the split.<br><br>A subarray is a contiguous part of the array.

</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [7,2,5,10,8], k = 2
<strong>Output:</strong> 18
<strong>Explanation:</strong> There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
</pre>

<p><strong class="example">Example 2: </strong></p>

<pre>
<strong>Input:</strong>nums = [1,2,3,4,5], k = 2
<strong>Output:</strong>  9
<strong>Explanation:</strong>There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
 
</pre>


<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 <= nums.length <= 1000</code></li>
	<li><code>0 <= nums[i] <= 106</code></li>
	<li><code>1 <= k <= min(50, nums.length)</code></li>
</ul>
