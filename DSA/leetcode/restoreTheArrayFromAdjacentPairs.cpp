#include <iostream>
#include <vector>
class Solution {
public:
    vector<int> restoreArray(vector<vector<int>>& adjacentPairs) {
        vector<int> ans;
        unordered_map<int,vector<int>> gr;

        for(auto p: adjacentPairs){
            gr[p[0]].push_back(p[1]);
            gr[p[1]].push_back(p[0]);
        }
        for(auto nodePair: gr){
            if(nodePair.second.size() == 1){
                ans.push_back(nodePair.first);
                ans.push_back(nodePair.second[0]);
                break;
            }
        }
        while(ans.size() < gr.size()){
            int lastElement = ans[ans.size() - 1], secondLastElement = ans[ans.size() - 2];
            vector<int> ne = gr[lastElement];
            if(ne[0] != secondLastElement){
                ans.push_back(ne[0]);
            }else{
                ans.push_back(ne[1]);
            }
        }
        return ans;
    }
};