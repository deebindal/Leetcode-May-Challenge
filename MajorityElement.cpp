class Solution {
public:
    int sorting_solution(vector<int>& nums){   //   O(nlogn) time complexity  O(1) space complexity
        sort(nums.begin(),nums.end());
        // return nums[nums.size()/2];         //can directly return the mid element as majority element will always be present at the mid.
        int count=1;
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i+1]==nums[i]) count++;
            else{
                if(count>nums.size()/2) return nums[i];
                count=1;
            }
        }
        return nums[nums.size()-1];
    }
    
    int hashmap_solution(vector<int>& nums){     //   O(n) time complexity  O(n/2) space complexity 
        unordered_map<int,int> map;
        for(int i=0;i<nums.size();i++){
            map[nums[i]]++;
            if(map[nums[i]]>nums.size()/2) return nums[i];
        }
        return nums[nums.size()-1];
    }
    
    int boyer_moore_solution(vector<int>& nums){   // O(n) time complexity O(1) space complexity
        int curr_majority_index=0;                 
        int count=1;
        for(int i=1;i<nums.size();i++){
            if(count==0){
                curr_majority_index=i;
                count=0;
            }
            if(nums[i]==nums[curr_majority_index]) count++;
            else count--;
        }
     return nums[curr_majority_index];   
    }
    
    int majorityElement(vector<int>& nums) {
        ios::sync_with_stdio(false); std::cin.tie(nullptr); std::cout.tie(nullptr);
        // return sorting_solution(nums);
        // return hashmap_solution(nums);
        return boyer_moore_solution(nums);
    }
    
};
