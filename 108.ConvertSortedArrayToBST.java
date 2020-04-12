/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        return makeBST(nums, 0, nums.length-1);
    }
    
    public TreeNode makeBST(int[] nums, int left, int right){
        if(left>right){
            return null;
        }
        int mid = left + (right - left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = makeBST(nums,left,mid-1);
        node.right = makeBST(nums,mid+1,right);
        return node;
    }
}
