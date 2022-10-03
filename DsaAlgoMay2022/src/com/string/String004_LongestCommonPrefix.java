package com.string;

public class String004_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String004_LongestCommonPrefix lcp = new String004_LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix_leetcodeVerticalScanning(strs));

    }

    public String longestCommonPrefix(String[] strs) {

        //get the minimum length from the strs arr
        int min = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }

        //result String
        StringBuilder sb = new StringBuilder();
        boolean isMatch = true;

        //iterate through the min length
        for(int i=0; i<min; i++) {
            //iterate through the strs arr
            for(int j=0; j<strs.length-1;j++) {
                if(strs[j].charAt(i) != strs[j+1].charAt(i)) {
                    isMatch = false;
                }
            }
            if(isMatch){
                sb.append(strs[0].charAt(i));
            }
        }
        if(sb.toString().length() == 0) {
            return "";
        }

        return sb.toString();
    }

    public String longestCommonPrefix_leetcodeVerticalScanning(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
/*
    public String longestCommonPrefix_leetcodeHorizontalScanning(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public String longestCommonPrefix_leetcodeTrie(String q, String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        Trie trie = new Trie();
        for (int i = 1; i < strs.length ; i++) {
            trie.insert(strs[i]);
        }
        return trie.searchLongestPrefix(q);
    }

    class TrieNode {

        // R links to node children
        private TrieNode[] links;

        private final int R = 26;

        private boolean isEnd;

        // number of children non null links
        private int size;
        public void put(char ch, TrieNode node) {
            links[ch -'a'] = node;
            size++;
        }

        public int getLinks() {
            return size;
        }
        //assume methods containsKey, isEnd, get, put are implemented as it is described
        //in  https://leetcode.com/articles/implement-trie-prefix-tree/)
    }

    public class Trie {

        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        //assume methods insert, search, searchPrefix are implemented as it is described
//in  https://leetcode.com/articles/implement-trie-prefix-tree/)
        private String searchLongestPrefix(String word) {
            TrieNode node = root;
            StringBuilder prefix = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char curLetter = word.charAt(i);
                if (node.containsKey(curLetter) && (node.getLinks() == 1) && (!node.isEnd())) {
                    prefix.append(curLetter);
                    node = node.get(curLetter);
                }
                else
                    return prefix.toString();

            }
            return prefix.toString();
        }
    }

*/

}
