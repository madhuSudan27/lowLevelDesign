package com.Algorithms.Trie;

import javax.swing.tree.TreeNode;

class TrieNode{
    TrieNode[] children;
    boolean isEndNode;

    TrieNode(){
        children = new TrieNode[26];
        isEndNode = false;
        // now i have to populate the children
        for(int i = 0; i< 26; i ++){
            children[i] = null;
        }
    }
}



public class Trie {
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }
    public void insert(String word){
        TrieNode currentNode = root;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(currentNode.children[index] == null){
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }
        currentNode.isEndNode = true;
    }

    public boolean search(String word){
        TrieNode currentNode = root;
        for(int i = 0; i < word.length();i++){
            int index = word.charAt(i) - 'a';
            if(currentNode.children[index] == null){
                return false;
            }
            currentNode = currentNode.children[index];
        }
        return currentNode.isEndNode;
    }

    // function to check a trie node has no children
    boolean isEmpty(TrieNode root){
        for(int i = 0; i< 26; i++){
            if(root.children[i] != null){
                return  false;
            }
        }
        return true;
    }

//    are
//    0 1 2 <- index


    public TrieNode deleteWord(TrieNode root, String word, int index){
        if(root == null) return null;

        if(word.length() == index){
            if(root.isEndNode){
                root.isEndNode = false;
            }
            if(isEmpty(root)){
                root = null;
            }
            return root;
        }
        int currentIndex = word.charAt(index) - 'a';
        root.children[currentIndex] = deleteWord(root.children[currentIndex], word, index + 1); // auxiliary stack

        if(isEmpty(root) && !root.isEndNode){
            root = null;
        }
        return root;

    }

    public void delete(String word){
        //
        deleteWord(root, "are", 0);

    }





}